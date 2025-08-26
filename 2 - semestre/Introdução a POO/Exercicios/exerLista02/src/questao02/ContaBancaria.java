/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

/**
 * 
 * @author Lc Martendal
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * 
     * @param valor Valor do deposito
     */
    public void depositar(double valor){
        if(saldo < 0){
            throw new IllegalArgumentException("Valor negativo");
        }
        this.saldo = this.saldo + valor;
    }
    /**
     * 
     * @param valor vslor do saque
     */
    public void sacar(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor negativo");
        }
        this.saldo = this.saldo - valor;
    }

    /**
     * 
     * @param contaDestino Indica qual conta recebera a transferencia
     * @param valor valor da transferencia
     */
    public void transferir(ContaBancaria contaDestino, double valor){
        this.saldo-= valor;
        contaDestino.saldo+= valor;
    }
}
