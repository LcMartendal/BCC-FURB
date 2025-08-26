/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import model.ImportadorEstoque;
import model.Produto;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        ImportadorEstoque i = new ImportadorEstoque();
        
        
        i.setArquivo(new File("C:\\Users\\luizc\\Downloads\\POO\\L16_Estoque.csv"));
        i.processarArquivo();
        i.getEstoque();
        
        for(Map.Entry<Produto, Integer> p: i.getEstoque().entrySet()){
            System.out.println(p.getKey().getNome() + " - " + p.getKey().getValor() + " - " + p.getValue());
        }
    }
    
    
   
}
