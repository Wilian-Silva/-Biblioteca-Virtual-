package br.com.biblioteca.main;

import br.com.biblioteca.repository.LivroRepository;
import br.com.biblioteca.service.LivroService;
import br.com.biblioteca.ui.Menu;

public class Main {

    public static void main(String[] args) {

        LivroRepository repository = new LivroRepository();
        LivroService service = new LivroService(repository);
        Menu menu = new Menu(service);

        menu.exibirMenu();
    }
}
