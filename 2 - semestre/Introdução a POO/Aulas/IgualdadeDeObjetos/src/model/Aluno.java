/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author Lc Martendal
 */
public class Aluno implements Comparable<Aluno>{
    
    private int matricula;
    private String nome;
    private String endereco;
    private LocalDate dataNascimento;

    public Aluno() {
    }

    
    public Aluno(int matricula, String nome, String endereco, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return this.matricula == other.matricula;
    }

    

   
    
    
        @Override
        public int compareTo(Aluno o) {
        if (this.matricula < o.matricula)
        return -1;
        if (this.matricula > o.matricula)
        return +1;
        return 0;
        }
        
        
    

    
    
    
}
