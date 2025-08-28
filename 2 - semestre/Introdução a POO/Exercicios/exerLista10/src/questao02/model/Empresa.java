/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02.model;

import java.util.ArrayList;

/**
 *
 * @author Lc Martendal
 */
public class Empresa {
    private String nome;

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    
    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void incluirFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void excluirFuncionario(Funcionario f){
        funcionarios.remove(f);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public double calcularCustosSalarios(){
        double total = 0;
        
        for(Funcionario f : funcionarios){
            total += f.calcularSalario();
        }
        
        return total;
    }
    
    
}
