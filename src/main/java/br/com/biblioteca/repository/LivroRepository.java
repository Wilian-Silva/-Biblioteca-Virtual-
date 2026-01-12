

package br.com.biblioteca.repository;

import br.com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

    private List<Livro> livros = new ArrayList<>();
    private int proximoId = 1;

    public Livro salvar(Livro livro) {
        livros.add(livro);
        return livro;
    }

    public int gerarId() {
        return proximoId++;
    }

    public List<Livro> listarTodos() {
        return livros;
    }

    public Livro buscarPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public boolean remover(int id) {
        Livro livro = buscarPorId(id);
        if (livro != null) {
            livros.remove(livro);
            return true;
        }
        return false;
    }
}
