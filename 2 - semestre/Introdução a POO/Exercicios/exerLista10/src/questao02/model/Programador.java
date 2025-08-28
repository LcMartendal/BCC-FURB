/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02.model;

import java.util.ArrayList;

/**
 *
 * @author Lc Martendal
 */
public class Programador extends Funcionario{
    
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
    
    ArrayList<String> linguagens = new ArrayList<>();
    
    public void incluirLinguagem(String lingagem ) {
        linguagens.add(lingagem);
    }
    
    public void excluirLinguagem(String lingagem ){
        linguagens.remove(lingagem);
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
  
    
    @Override
    public double calcularSalario(){
        double salario = getSalario();
        
        for(String l : linguagens){
            if(l.equalsIgnoreCase("Java")){
            return salario + ((salario * 20) / 100);
            }
        }
        
        
        return salario;
    }
    
}
