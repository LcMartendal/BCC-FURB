/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author Lc Martendal
 */
public class Funcionario {
    
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
      
    public double calcIrpf(){
        double irpf = 0;
        
        if(this.salario <= 1903.98){
            irpf = 0;
            
        }else if(this.salario > 1903.98 && this.salario <= 2826.65){
            irpf = (this.salario - 1903.98)*0.075;
            
        }else if(this.salario > 2826.65 && this.salario <= 3751.05){
            irpf = (this.salario - 2826.65)*0.15 + (2826.65 - 1903.98)*0.07;
            
        }else if(this.salario > 3751.05 && this.salario <= 4664.68){
            irpf = (this.salario - 3751.05)*0.225 + (3751.05 - 2826.65)*0.15 + (2826.65 - 1903.98)*0.075;
            
        }else if(this.salario > 4664.68){
            irpf = (this.salario - 4664.68)*0275 + (4664.68 - 3751.05)*0.225 + (3751.05 - 2826.65)*0.15 + (2826.65 - 1903.98)*0.075;
        }
        
        return irpf;
    
    }
    
}


