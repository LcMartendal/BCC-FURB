/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

/**
 *
 * @author Lc Martendal
 */
public class Imovel {
    
    
    private String endereco;
    private int area;
    
    private Bairro bairro;
    private Finalidade finalidade;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if(area <= 0){
            throw new IllegalArgumentException("Area igual a zero ou inferior!");
        }
        this.area = area;
    }
    
    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        if(bairro == null){
            throw new IllegalArgumentException("Bairro não definido!");
        }
        this.bairro = bairro;
    }
    
    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        if(finalidade == null){
            throw new IllegalArgumentException("Finalidade não definido!");
        }
        this.finalidade = finalidade;
    }
    
    public double calcularIptu(){
        double iptu = 0;
        if(finalidade == finalidade.RESIDENCIAL){
            iptu = this.getArea() * 1;
        }
        else if(finalidade == finalidade.COMERCIAL){
            if(this.getArea() <= 100){
                iptu = 500;
            }else if(this.getArea() > 100 && this.getArea() <= 400){
                iptu = 1000;
            }else if(this.getArea() > 400 ){
                iptu = this.getArea() * 2.55;
            }
        }else if(finalidade == finalidade.INDUSTRIAL){
            if(this.getArea() <= 2000){
                iptu = 1000;
            }else{
                iptu = this.getArea() * 0.55;
            }
        }
        return iptu * bairro.getCoeficienteIptu();
    }
}
