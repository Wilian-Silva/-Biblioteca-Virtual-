package br.com.biblioteca.model;

import jakarta.persistence.*;

@Entity
@Table(name = "livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    private String editora;
    private String categoria;

    @Column(name = "numero_paginas")
    private int numeroPaginas;

    @Enumerated(EnumType.STRING)
    private StatusLivro status;

    @Column(columnDefinition = "TEXT")
    private String resumo;

    // 🔹 Construtor vazio (OBRIGATÓRIO para o JPA)
    public Livro() {
    }
    
    public void setId(Long id) {
    this.id = id;
}

    // 🔹 Construtor completo (opcional, mas útil)
    public Livro(String titulo, String autor, String editora,
                 String categoria, int numeroPaginas,
                 StatusLivro status, String resumo) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.numeroPaginas = numeroPaginas;
        this.status = status;
        this.resumo = resumo;
    }

    // 🔹 Getters e Setters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public StatusLivro getStatus() {
        return status;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
