/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lc Martendal
 */
public class GerenciamentoFinanceiro implements AcoesGerenciamentoFinanceiro{
    private List<Lancamento> lancamentos;
    
    public String[] gravandoReceitaNumaString(){
        String[] receita = null;
        int i = 0;
        for(Lancamento l : lancamentos){
            i++;
            if(l.getTipo().equals("Receita")){
                receita[i] = l.getCategoria() + ";" + l.getValor() + ";" + l.getData() + ";";
            }
        }
        return receita;
    }
    
    public String gravandoDespesaNumaString(){
        String despesa = new String();
        for(Lancamento l : lancamentos){
            if(l.getTipo().equals("Despesa")){
                despesa = l.getCategoria() + ";" + l.getValor() + ";" + l.getData() + ";";
            }
        }
        return despesa;
    }

    public GerenciamentoFinanceiro() {
        lancamentos = new ArrayList<>();
    }

    public void adicionarLancamento(Lancamento lancamento) {
        lancamentos.add(lancamento);
    }

    @Override
    public double consultarSaldoAtual() {
        double saldo = 0;
        LocalDate hoje = LocalDate.now();
        for (Lancamento lancamento : lancamentos) {
            if (lancamento.getData().isBefore(hoje) || lancamento.getData().isEqual(hoje)) {
                saldo += lancamento.getTipo().equals("Receita") ? lancamento.getValor() : -lancamento.getValor();
            }
        }
        return saldo;
    }

    @Override
    public double consultarSaldoTotal() {
        double saldo = 0;
        for (Lancamento lancamento : lancamentos) {
            saldo += lancamento.getTipo().equals("Receita") ? lancamento.getValor() : -lancamento.getValor();
        }
        return saldo;
    }

    @Override
    public List<Lancamento> listarReceitas() {
        List<Lancamento> receitas = new ArrayList<>();
        for (Lancamento lancamento : lancamentos) {
            if (lancamento instanceof Receita) {
                receitas.add(lancamento);
            }
        }
        return receitas;
    }

    @Override
    public List<Lancamento> listarDespesas() {
        List<Lancamento> despesas = new ArrayList<>();
        for (Lancamento lancamento : lancamentos) {
            if (lancamento instanceof Despesa) {
                despesas.add(lancamento);
            }
        }
        return despesas;
    }

    @Override
    public List<Lancamento> listarLancamentosOrdenados() {
        lancamentos.sort((l1, l2) -> l1.getData().compareTo(l2.getData()));
        return lancamentos;
    }
}
    
