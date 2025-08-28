/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelQ;

/**
 *
 * @author Lc Martendal
 */
public class Pessoa {
    
    private String nome;
    private double salario;

    public Pessoa() {
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
        if(salario <= 0){
            throw new IllegalArgumentException("Valor invalido!");
        }
        this.salario = salario;
    }

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public double calculoIRPF(){
        if(this.salario <= 1903.98 ){
            return 0;
        }else if(this.salario <= 2826.65){
            return ((this.salario - 1903.98) * 7.5) / 100;
        }else if(this.salario <= 3751.05){
            return ((this.salario - 2826.65) * 15) / 100 + (((2826.65 - 1903.98) * 7.5) / 100);
        }else if (this.salario <= 4664.68){
            return ((this.salario - 3751.05) * 22.5) / 100 + (((3751.05 - 2826.65) * 15) / 100 + (((2826.65 - 1903.98) * 7.5) / 100));
        }else {
            return ((this.salario - 4664.68) * 27.5) / 100 + (((4664.68 - 3751.05) * 22.5) / 100 + (((3751.05 - 2826.65) * 15) / 100 + (((2826.65 - 1903.98) * 7.5) / 100)));
        }
    }
    
    public FaixaIRPF identificarFaixa(){
        if(this.salario <= 1903.98 ){
            return FaixaIRPF.PRIMEIRA;
        }else if(this.salario <= 2826.65){
            return FaixaIRPF.SEGUNDA;
        }else if(this.salario <= 3751.05){
            return FaixaIRPF.TERCEIRA;
        }else if (this.salario <= 4664.68){
            return FaixaIRPF.QUARTA;
        }else {
            return FaixaIRPF.QUINTA;
        }
    }
}
