/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1Model;

/**
 *
 * @author Lc Martendal
 */
public class MensalidadeEnsino implements Pagavel{
    
    private int nrCreditos;
    private double precoCredito;

    public MensalidadeEnsino(int nrCreditos, double precoCredito) {
        this.nrCreditos = nrCreditos;
        this.precoCredito = precoCredito;
    }

    @Override
    public double calcularValorPagar() {
        return this.nrCreditos * this.precoCredito;
    }
    
    
}
