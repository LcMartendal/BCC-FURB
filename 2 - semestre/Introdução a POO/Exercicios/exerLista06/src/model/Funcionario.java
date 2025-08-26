/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lc Martendal
 */
public class Funcionario {
    
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    

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
        if(salario < 0 ){
            throw new IllegalArgumentException("Salário deve ser maior que Zero");
        }else
        
        this.salario = salario;
    }
      
    public double calcIrpf(){
        double irpf = 0;
        
        if(this.salario <= 1903.98){
            irpf = 0;
        }else if(this.salario > 1903.98 && this.salario <= 2826.65){
            irpf = ((this.salario - 1903.98)*7.5)/100;
        }else if(this.salario > 2826.65 && this.salario <= 3751.05){
            irpf = ((this.salario - 2826.65)*15)/100 + ((2826.65 - 1903.98)*7.5)/100;;
        }else if(this.salario > 3751.05 && this.salario <= 4664.68){
            irpf = ((this.salario - 3751.05)*22.5)/100 + ((3751.05 - 2826.65)*15)/100 + ((2826.65 - 1903.98)*7.5)/100;
        }else if(this.salario > 4664.68){
            irpf = ((this.salario - 4664.68)*27.5)/100 + ((4664.68 - 3751.05)*22.5)/100 + ((3751.05 - 2826.65)*15)/100 + ((2826.65 - 1903.98)*7.5)/100;
        }
        
        return irpf;
    
    }
    
    public FaixaIrpf identificarFaixaIrpf(){
                
        if(this.salario <= 1903.98){
            return FaixaIrpf.PRIMEIRA;
        }else if(this.salario > 1903.98 && this.salario <= 2826.65){
            return FaixaIrpf.SEGUNDA;
        }else if(this.salario > 2826.65 && this.salario <= 3751.05){
            return FaixaIrpf.TERCEIRA;
        }else if(this.salario > 3751.05 && this.salario <= 4664.68){
            return FaixaIrpf.QUARTA;
        }else {
            return FaixaIrpf.QUINTA;
        }
    }
    
}
