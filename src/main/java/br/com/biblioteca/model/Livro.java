package br.com.biblioteca.model;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private String categoria;
    private int numeroPaginas;
    private StatusLivro status;
    private String resumo;

    public Livro(int id, String titulo, String autor, String editora,
                 String categoria, int numeroPaginas,
                 StatusLivro status, String resumo) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.numeroPaginas = numeroPaginas;
        this.status = status;
        this.resumo = resumo;
    }

    // getters e setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getEditora() { return editora; }
    public String getCategoria() { return categoria; }
    public int getNumeroPaginas() { return numeroPaginas; }
    public StatusLivro getStatus() { return status; }
    public String getResumo() { return resumo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setEditora(String editora) { this.editora = editora; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }
    public void setStatus(StatusLivro status) { this.status = status; }
    public void setResumo(String resumo) { this.resumo = resumo; }
}
