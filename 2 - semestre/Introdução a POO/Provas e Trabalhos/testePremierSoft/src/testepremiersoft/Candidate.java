/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testepremiersoft;

/**
 *
 * @author Lc Martendal
 */
public class Candidate {
    private String nome;
    private int idade;
    private String vaga;
    private String estado;

    public Candidate(String nome, int idade, String vaga, String estado) {
        this.nome = nome;
        this.idade = idade;
        this.vaga = vaga;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
