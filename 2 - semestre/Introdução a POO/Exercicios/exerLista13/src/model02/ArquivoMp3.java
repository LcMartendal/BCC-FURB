/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author rwsouza
 */
public class ArquivoMp3 {
    TagMp3 tag;
    
    public ArquivoMp3(String nomeArquivo) throws FileNotFoundException, IOException{
        File arquivo = new File(nomeArquivo);
        
        if (!arquivo.exists()){
            throw new FileNotFoundException(nomeArquivo);
        }
        
        if (!arquivo.isFile()){
            throw new ArgumentoNaoEhArquivoException(nomeArquivo);
        }
        
        try(FileInputStream fis = new FileInputStream(arquivo)){
           fis.skip(arquivo.length()-128);
           
           byte[] dados = new byte[128];
           fis.read(dados);
           
           /*int qtdBytes = 3, posicaoInicial = 0; 
           byte[] dados2 = new byte[qtdBytes];
           
           for(int i = 0; i < qtdBytes; i++){
               dados2[i] = dados[posicaoInicial+i];
           }
           String cabecalho = new String(dados2);
           */
           
           String cabecalho = extrairInformacoes(dados,0,3);
           
           if (cabecalho.equals("TAG")){
               tag = new TagMp3();
               
               String tituloMusica = extrairInformacoes(dados, 3, 30);
               tag.setTitulo(tituloMusica);
               
               String artista = extrairInformacoes(dados, 33, 30);
               tag.setArtista(artista);
               
               String album = extrairInformacoes(dados, 63, 30);
               tag.setAlbum(album);
               
               int ano = 0;
               try{
                ano = Integer.parseInt(extrairInformacoes(dados, 93, 4));
                tag.setAno(ano);
               }catch(NumberFormatException ex){
                   
               }
               
               String comentario = extrairInformacoes(dados,97, 28);
               tag.setComentario(comentario);
               
               //flag de trilha pula 1 byte - posição 125
               int faixa = 0;
               try{
                faixa = Integer.parseInt(extrairInformacoes(dados, 126, 1));
                tag.setNumeroFaixa(faixa);
               }catch(NumberFormatException ex){
                   
               }
               
                int genero = 0;
                try{
                 genero = Integer.parseInt(extrairInformacoes(dados, 127, 1));
                 tag.setGenero(genero);
                }catch(NumberFormatException ex){

                }
                //System.out.println(tituloMusica);

            }else{
                throw new ArquivoNaoTemTagMp3(nomeArquivo);
            }

          
           
        }
        
    }
    
    private String extrairInformacoes(byte[] dados,
                                      int posicaoInicial,
                                      int qtdBytes){
        
           byte[] dados2 = new byte[qtdBytes];
           
           for(int i = 0; i < qtdBytes; i++){
               dados2[i] = dados[posicaoInicial+i];
           }
           return new String(dados2);
    }

    public TagMp3 getTag() {
        return tag;
    }
    
    
}
