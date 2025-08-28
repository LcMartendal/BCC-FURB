/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Lc Martendal
 */
public abstract class Lancamento {
    private String categoria;
    private double valor;
    private LocalDate data;

    public Lancamento(String categoria, double valor, LocalDate data) {
        this.categoria = categoria;
        this.valor = valor;
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public abstract String getTipo();
}


