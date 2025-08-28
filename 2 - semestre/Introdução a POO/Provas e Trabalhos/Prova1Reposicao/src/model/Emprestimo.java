/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Lc Martendal
 */
public class Emprestimo {
    
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    /**
     * Este metodo calcula os dias que a pessoa pegou o livro emprestado.
     * @return os dias de emprestimo do livro.
     */
    public long calcularDiasEmprestimo(){
        
        if(this.dataDevolucao.isBefore(dataEmprestimo)){
            throw new IllegalArgumentException("Data de devolução anterior a de emprestimo!");
        }
        long diaEmprestimo = this.getDataEmprestimo().getDayOfMonth();
        long diaDevolucao = this.getDataDevolucao().getDayOfMonth();
        //long diasDeDiferenca = ChronoUnit.DAYS.between(this.dataEmprestimo, this.dataDevolucao);
        return diaDevolucao - diaEmprestimo;
    }  
    
    /**
     * Calula o valor que a pessoa tem que pagar ao pegar o livro emprestado.
     * @return o valor que pode ser variado após ultrapassar os sete dias de emprestimo do livro.
     */
    public double calcularValorDevido(){
        double valorDevido;
        long diasDeDiferenca = ChronoUnit.DAYS.between(this.dataEmprestimo, this.dataDevolucao);
        
        if(diasDeDiferenca <= 7){
            return valorDevido = 5;
        }else{
            long diasDeAtraso = diasDeDiferenca - 7;
            
            return valorDevido = 5 + (1 * diasDeAtraso);
        }

    }
    
}
