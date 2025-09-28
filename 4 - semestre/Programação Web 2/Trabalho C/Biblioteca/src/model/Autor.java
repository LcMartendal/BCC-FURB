package model;

import java.io.Serializable;

public class Autor implements Serializable {
    private int id;
    private String nome;
    private String email;

    public Autor() {}

    public Autor(int id, String nome, String email) {
        setId(id);
        setNome(nome);
        setEmail(email);
    }

    public int getId() { return id; }
    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID do autor deve ser positivo.");
        this.id = id;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty())
            throw new IllegalArgumentException("Nome do autor não pode estar em branco.");
        this.nome = nome;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("Email inválido.");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor{id=" + id + ", nome='" + nome + "', email='" + email + "'}";
    }
}
