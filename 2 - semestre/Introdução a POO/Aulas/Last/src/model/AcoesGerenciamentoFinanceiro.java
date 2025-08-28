/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Lc Martendal
 */
public interface AcoesGerenciamentoFinanceiro {
    void adicionarLancamento(Lancamento lancamento);
    double consultarSaldoAtual();
    double consultarSaldoTotal();
    List<Lancamento> listarReceitas();
    List<Lancamento> listarDespesas();
    List<Lancamento> listarLancamentosOrdenados();
}
