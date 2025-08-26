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
public class Despesa extends Lancamento {
    public Despesa(String categoria, double valor, LocalDate data) {
        super(categoria, valor, data);
    }

    @Override
    public String getTipo() {
        return "Despesa";
    }
}