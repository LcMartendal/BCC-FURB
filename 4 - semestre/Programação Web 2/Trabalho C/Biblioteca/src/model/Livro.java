package model;

import java.io.Serializable;

public class Livro implements Serializable {
    private int id;
    private String titulo;
    private String isbn;
    private int ano;

    public Livro() {}

    public Livro(int id, String titulo, String isbn, int ano) {
        setId(id);
        setTitulo(titulo);
        setIsbn(isbn);
        setAno(ano);
    }

    public int getId() { return id; }
    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID do livro deve ser positivo.");
        this.id = id;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty())
            throw new IllegalArgumentException("Título do livro não pode estar em branco.");
        this.titulo = titulo;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty())
            throw new IllegalArgumentException("ISBN inválido.");
        this.isbn = isbn;
    }

    public int getAno() { return ano; }
    public void setAno(int ano) {
        if (ano < 1500 || ano > 2100)
            throw new IllegalArgumentException("Ano inválido para o livro.");
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{id=" + id + ", titulo='" + titulo + "', isbn='" + isbn + "', ano=" + ano + "}";
    }
}
