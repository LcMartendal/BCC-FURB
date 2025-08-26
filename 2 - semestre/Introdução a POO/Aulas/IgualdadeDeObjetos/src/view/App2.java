/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Aluno;

/**
 *
 * @author Lc Martendal
 */
public class App2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(1120);
        
        Aluno aluno2 = new Aluno();
        aluno2.setMatricula(450);
        aluno2.setNome("Teste");
        
        System.out.println("Aluno 1 " + aluno1.hashCode());
        System.out.println("Aluno 2 " + aluno2.hashCode());
        if(aluno1.equals(aluno2)){
            System.out.println("Objetos iguais"); 
        }else {
            System.out.println("Objetos diferentes");
        }
    }
    
}
