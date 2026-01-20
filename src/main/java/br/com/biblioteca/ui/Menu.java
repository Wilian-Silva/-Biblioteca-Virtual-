package br.com.biblioteca.ui;

import br.com.biblioteca.model.Livro;
import br.com.biblioteca.model.StatusLivro;
import br.com.biblioteca.service.LivroService;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private LivroService service;
    private Scanner scanner = new Scanner(System.in);

    public Menu(LivroService service) {
        this.service = service;
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n=== Biblioteca Virtual ===");
            System.out.println("1 - Listar livros");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Atualizar status do livro");
            System.out.println("4 - Excluir livro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> listar();
                case 2 -> cadastrar();
                case 3 -> atualizarStatus();
                case 4 -> excluir();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void listar() {
        List<Livro> livros = service.listarLivros();

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(
                livro.getId() + " - " +
                livro.getTitulo() + " (" +
                livro.getStatus() + ")"
            );
        }
    }

    private void cadastrar() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        System.out.print("Número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Resumo: ");
        String resumo = scanner.nextLine();

        Livro livro = service.cadastrarLivro(
                titulo, autor, editora,
                categoria, paginas,
                StatusLivro.NAO_LIDO,
                resumo
        );

        System.out.println("Livro cadastrado com ID: " + livro.getId());
    }

    private void atualizarStatus() {
        System.out.print("Informe o ID do livro: ");
        int id = scanner.nextInt();

        System.out.println("1 - NÃO LIDO");
        System.out.println("2 - LENDO");
        System.out.println("3 - LIDO");
        System.out.print("Novo status: ");
        int opcao = scanner.nextInt();

        StatusLivro status = switch (opcao) {
            case 1 -> StatusLivro.NAO_LIDO;
            case 2 -> StatusLivro.LENDO;
            case 3 -> StatusLivro.LIDO;
            default -> null;
        };

        if (status == null || !service.atualizarStatus(id, status)) {
            System.out.println("Erro ao atualizar status.");
        } else {
            System.out.println("Status atualizado com sucesso!");
        }
    }

    private void excluir() {
        System.out.print("Informe o ID do livro: ");
        int id = scanner.nextInt();

        if (service.excluirLivro(id)) {
            System.out.println("Livro excluído com sucesso.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
