/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Lc Martendal
 */
public class AnalizadorTexto {
    
    private Map<String, Integer> palavras;
    private File arquivo;
    
    public AnalizadorTexto(File arquivo) {
        palavras = new HashMap<>();
        this.arquivo = arquivo;
    }
    
    public void processarArquivo() throws FileNotFoundException{
        
        try(Scanner scanner = new Scanner(arquivo)) {
         scanner.useDelimiter("[-., :\" ()!? \n \r]");
            while (scanner.hasNext()) {
                String palavra = scanner.next().toLowerCase();
                
                if(!palavra.equals("")){
                    Integer frequencia = palavras.get(palavra);

                    if(frequencia != null){
                        frequencia++;
                    }else {
                        frequencia = 1;
                    }

                    palavras.put(palavra, frequencia);
                }
            }
        } 
    }

    public Map<String, Integer> getPalavras() {
        return palavras;
    }
    
}
