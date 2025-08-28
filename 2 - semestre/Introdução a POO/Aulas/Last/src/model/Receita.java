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
public class Receita extends Lancamento {
    public Receita(String categoria, double valor, LocalDate data) {
        super(categoria, valor, data);
    }

    @Override
    public String getTipo() {
        return "Receita";
    }
}