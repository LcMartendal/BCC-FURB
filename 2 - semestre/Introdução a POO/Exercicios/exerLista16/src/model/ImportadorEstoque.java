/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Lc Martendal
 */
public class ImportadorEstoque {
    
    private Map<Produto, Integer> estoque;
    private File arquivo;

    public ImportadorEstoque() {
        estoque = new HashMap<>();
    }
    
    public void setArquivo(File arquivo){
        this.arquivo = arquivo;
    }
    
    public void processarArquivo() throws FileNotFoundException{
        try(Scanner sc = new Scanner(arquivo); ){
           
            if (sc.hasNextLine()){
                //Ignora o Cabeçalho
                sc.nextLine();
            }

            while(sc.hasNextLine()){

                String[] linha = sc.nextLine().split(";");

                Produto p = new Produto(linha[0], Double.parseDouble(linha[1]));
                if(estoque.containsKey(p)){
                    Integer qtdEstoque = estoque.get(p);
                    estoque.put(p, Integer.parseInt(linha[2]) + qtdEstoque);
                }else{
                    estoque.put(p, Integer.parseInt(linha[2]));
                }
                
                
            }

        }
    }

    public Map<Produto, Integer> getEstoque() {
        return estoque;
    }
    
    
}
