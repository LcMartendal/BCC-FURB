/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lc Martendal
 */
public class ContaBancaria {
        
    private String titular;
    private double saldo;

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
    
    
    
    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }
    public void sacar(double valor){
       this.setSaldo(this.getSaldo() - valor);    }

    @Override
    public String toString() {
        return " ContaBancaria \nTitular = " + this.getTitular() + "\nSaldo = " + this.getSaldo() ;
    }
    
}
