/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args){
        
        Funcionarioo f = new Funcionarioo();
        
        f.setNome("luiz");
        f.setSalario(3000);
        System.out.print(f.calcIrpf());
        
        
        
    }
}
