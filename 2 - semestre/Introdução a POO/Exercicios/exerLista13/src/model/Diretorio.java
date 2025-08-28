/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;

/**
 *
 * @author rwsouza
 */
public class Diretorio {
    private File arquivo;
    
    public Diretorio(String caminho){
        arquivo = new File(caminho);
        
        if (!arquivo.exists()){
            throw new IllegalArgumentException("O diretório:" +
                                               caminho+ " não existe!" );
        }
        
    }
    
    public long obterTamanhoArquivos(){
       return obterTamanhoArquivos(arquivo);
    }
    
    private long obterTamanhoArquivos(File dir){
       long tamanhoTotal = 0; 
       File[] f = dir.listFiles();
       
       if (f != null){
           for (File arq : f){
            if (arq.isDirectory()){
                //percorrer subdiretorios
               tamanhoTotal += obterTamanhoArquivos(arq);
            }else{
               tamanhoTotal += arq.length();
            }
          }
       }
       
       
       return tamanhoTotal;
    }
    
}
