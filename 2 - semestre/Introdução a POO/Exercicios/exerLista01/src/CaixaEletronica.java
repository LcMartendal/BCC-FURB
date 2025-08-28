/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lc Martendal
 */
public class CaixaEletronica {
    public static void main(String[] args){
        
        ContaBancaria conta1 = new ContaBancaria();
        
        conta1.setTitular("Luiz");
        conta1.depositar(10000);
        conta1.sacar(100);
        System.out.println(conta1.toString());
        
        
    }
}
