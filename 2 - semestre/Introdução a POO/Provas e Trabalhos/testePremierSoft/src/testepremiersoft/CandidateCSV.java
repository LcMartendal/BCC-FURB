/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testepremiersoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author Lc Martendal
 */
public class CandidateCSV {
    static String nomeArquivo = "./Sorted_Academy_Candidates.csv";
    
    
    
    public  static void AdicionarCandidate(Candidate c){
        try{
            
            boolean arquivoExiste = new File(nomeArquivo).exists();
            
            FileWriter escritor = new FileWriter(nomeArquivo, StandardCharsets.ISO_8859_1 ,true);
            
            if(!arquivoExiste){
                escritor.write("nome;idade;vaga;estado\n");
            }
            
            escritor.write(c.getNome() + ";" + c.getIdade() + ";" + c.getVaga() + ";" + c.getEstado() + "\n");
            
            escritor.flush();
            
            escritor.close();
            
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Candidate> listarCandidates(){
        ArrayList<Candidate> lista = new ArrayList<>();
        
        try{
            
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            
            boolean primeiraLinha = true;
            
            while((linha = leitor.readLine()) != null){
                
                if(primeiraLinha){
                    primeiraLinha = false;
                    continue;
                }
                
                String[] partes = linha.split(";");
                
                String nome = partes[0];
                int idade = Integer.parseInt(partes[1]);
                String vaga = partes[2];
                String estado = partes[3];
                
                Candidate c = new Candidate(nome, idade, vaga, estado);
                lista.add(c);
                
                System.out.println(nome + ";" + idade + ";" + vaga + ";" + estado );
                
            }
            
            leitor.close();
            
        } catch(IOException e){
            e.printStackTrace();
        }
        
        return lista;
    }
}
