/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lc Martendal
 */
public class Funcionario {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0){
            throw new IllegalArgumentException ("Salario incorreto(menor que 0)");
        }
        this.salario = salario;
    }
    
    
}
