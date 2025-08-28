/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao3;

/**
 *
 * @author Lc Martendal
 */
public class Retangulo {
    private int altura;
    private int comprimento;

   
    
    /**
     * Este construtor inicializa ja mostrando o que se deve apresentar a ele
     * @param altura É a altura do retangulo que deverá ser informada
     * @param comprimento É o comprimento do retangulo que deverá ser informada
     */
    

    public Retangulo(int altura, int comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }
    

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        }
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if(comprimento <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        }
        this.comprimento = comprimento;
    }
    
    /**
     * Este metodo calcula o perimetro do retangulo
     * @return Retorna o valor do perimetro do retangulo
     */
    public int calcularPerimetro(){
        
        return (this.altura * 2) + (this.comprimento * 2);
    }
    /**
     * Este metodo calcula a areaB do retangulo
     * @return Retorna o valor da area do retangulo
     */
    public int calcularArea(){
        
        return this.altura * this.comprimento;
    }
}
