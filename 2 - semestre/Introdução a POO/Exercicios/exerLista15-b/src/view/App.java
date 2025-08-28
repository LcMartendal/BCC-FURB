/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.ContaBancaria;
import model.ContaEspecial;
import model.Movimento;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        ContaBancaria cb = new ContaBancaria();
        ContaEspecial ce = new ContaEspecial();
        
        cb.depositar(100);
        Thread.sleep(1000);
        cb.depositar(9000);
        Thread.sleep(1000);
        cb.sacar(2000);
        Thread.sleep(1000);
        cb.sacar(900);
        Thread.sleep(1000);
        
        ce.depositar(2100);
        Thread.sleep(1000);
        ce.depositar(9156);
        Thread.sleep(1000);
        ce.sacar(980);
        Thread.sleep(1000);
        
        System.out.println("--------- LISTA MOVIMENTOS EM ORDENACAO POR HORA  ---------");
        System.out.println("Conta normal:");
        cb.ordenaMovimentosHoraDecrescente();
        System.out.println("Conta especial:");
        ce.ordenaMovimentosHoraDecrescente();
        
        
    }
}
