/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import model02.ArquivoMp3;
import model02.ArquivoNaoTemTagMp3;
import model02.TagMp3;

/**
 *
 * @author rwsouza
 */
public class App {
    public static void main(String[] args) throws IOException {
        
        try{
            ArquivoMp3 arquivo = new ArquivoMp3("C:\\Users\\luizc\\Downloads\\Nova pasta\\L13_musicaMP3_EX2.mp3");
        
            TagMp3 minhaTag = arquivo.getTag();

            System.out.println("Titulo Musica: "+ minhaTag.getTitulo());
            System.out.println("Artista: "+ minhaTag.getArtista());
            System.out.println("Album: "+ minhaTag.getAlbum());
            System.out.println("Ano: "+ minhaTag.getAno());
             System.out.println("Comentario: "+ minhaTag.getComentario());
        }catch(ArquivoNaoTemTagMp3 ex){
            System.out.println("Arquivo "+ex.getMessage()+" não tem tag mp3.");
        }
        
    }
  
}
