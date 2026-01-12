package br.com.biblioteca.service;

import br.com.biblioteca.model.Livro;
import br.com.biblioteca.model.StatusLivro;
import br.com.biblioteca.repository.LivroRepository;
import java.util.List;

public class LivroService {

    private LivroRepository repository;

 
    
    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

       public LivroService() {
    // Construtor vazio para testes de regras simples
}
    public Livro cadastrarLivro(String titulo, String autor, String editora,
                                String categoria, int numeroPaginas,
                                StatusLivro status, String resumo) {

        int id = repository.gerarId();

        Livro livro = new Livro(
                id, titulo, autor, editora,
                categoria, numeroPaginas,
                status, resumo
        );

        return repository.salvar(livro);
    }

    public List<Livro> listarLivros() {
        return repository.listarTodos();
    }

    public boolean excluirLivro(int id) {
        return repository.remover(id);
    }

    public boolean atualizarStatus(int id, StatusLivro novoStatus) {
        Livro livro = repository.buscarPorId(id);
        if (livro != null) {
            livro.setStatus(novoStatus);
            return true;
        }
        return false;
    }

    public Livro buscarPorId(int id) {
        return repository.buscarPorId(id);
    }
    
    public boolean statusValido(String status) {
        if (status == null) {
            return false;
        }

        return status.equalsIgnoreCase("LIDO")
            || status.equalsIgnoreCase("LENDO")
            || status.equalsIgnoreCase("NAO_LIDO");
    }
}

