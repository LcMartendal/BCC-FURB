/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;

/**
 *
 * @author Lc Martendal
 */
public class Pessoa {
    
    
    private float altura;
    private float peso;

    public Pessoa(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }
    public Pessoa() {
        
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public double calcularImc(){
        return this.peso / Math.pow(altura, 2);
    }
}
