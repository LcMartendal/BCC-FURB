package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lc Martendal
 */
public class Cartao implements FormaPagamento{

    @Override
    public double pagar(double valor) {
        return valor - ((valor * 2) / 100);
    }
    
    
}
