/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

import java.util.ArrayList;
import questao01.*;

/**
 *
 * @author Lc Martendal
 */
public class ContaBancaria {
    
    private String numero;
    private double saldo;
    private Cliente titular;
    
    
    private ArrayList<Movimento> contaBancaria = new ArrayList<>();
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo+= valor;
        Movimento m = new Movimento(valor, TipoMovimento.CREDITO);
        incluirMovimento(m);
    }
    
    public void sacar(double valor){
        if(valor > this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo-= valor;
        Movimento m = new Movimento(valor, TipoMovimento.DEBITO);
        incluirMovimento(m);
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
        if(valor > this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo-= valor;
        contaDestino.setSaldo(this.saldo + valor);
        
        Movimento m = new Movimento(valor, TipoMovimento.DEBITO);
    }

    public ArrayList<Movimento> getContaBancaria() {
        return contaBancaria;
    }
    
    protected void incluirMovimento(Movimento m){
        contaBancaria.add(m);
    }

}
