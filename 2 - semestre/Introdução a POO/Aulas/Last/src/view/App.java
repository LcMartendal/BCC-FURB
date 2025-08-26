/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.time.LocalDate;
import model.Despesa;
import model.GerenciamentoFinanceiro;


/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args) {
        GerenciamentoFinanceiro gf = new GerenciamentoFinanceiro();
        
        Despesa d = new Despesa("Salario" , 300, LocalDate.now());
        Despesa d1 = new Despesa("Salario" , 300, LocalDate.now());
        Despesa d2 = new Despesa("Salario" , 400, LocalDate.now());
        
        
        gf.adicionarLancamento(d);
        gf.adicionarLancamento(d1);
        gf.adicionarLancamento(d2);
        
        System.out.println(gf.gravandoDespesaNumaString());
        
    }
}
