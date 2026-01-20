package br.com.biblioteca.controller;

import br.com.biblioteca.model.Livro;
import br.com.biblioteca.model.StatusLivro;
import br.com.biblioteca.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    // LISTAR
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("livros", service.listarTodos());
        return "lista";
    }

    // NOVO
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("livro", new Livro());
        model.addAttribute("statusList", StatusLivro.values());
        return "cadastro";
    }

    // SALVAR (novo ou edição)
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Livro livro) {

        service.salvar(livro);
        return "redirect:/livros";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        Livro livro = service.buscarPorId(id);


        model.addAttribute("livro", livro);
        model.addAttribute("statusList", StatusLivro.values());

        return "cadastro";
    }

    // EXCLUIR
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/livros";
    }
    
    @GetMapping("/detalhes/{id}")
    public String detalhes(@PathVariable Long id, Model model) {
        Livro livro = service.buscarPorId(id);
        model.addAttribute("livro", livro);
        return "detalhes";
    }

    
    
}
