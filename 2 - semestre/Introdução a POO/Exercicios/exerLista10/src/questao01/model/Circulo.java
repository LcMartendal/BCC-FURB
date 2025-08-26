/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01.model;

/**
 *
 * @author Lc Martendal
 */
public class Circulo extends Figura {
    
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return this.raio * (Math.pow(3.1415, 2));
    }
}
