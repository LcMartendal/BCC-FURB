/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testepremiersoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.util.ArrayList;


/**
 *
 * @author Lc Martendal
 */


public class Main {
    
public static class Candidate {
    private String nome;
    private int idade;
    private String vaga;
    private String estado;
    
    static String nomeArquivo1 = "./Academy_Candidates.txt";

    public Candidate(String nome, int idade, String vaga, String estado) {
        this.nome = nome;
        this.idade = idade;
        this.vaga = vaga;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    private ArrayList<Candidate> listaCandidatos;
            
    public  ArrayList<Candidate> candidatos(){
        listaCandidatos = new ArrayList<>();
        
        try{
            
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo1));
            String linha;
            
            boolean primeiraLinha = true;
            
            while((linha = leitor.readLine()) != null){
                
                if(primeiraLinha){
                    primeiraLinha = false;
                    continue;
                }
                
                String[] partes = linha.split(";");
                
                this.nome = partes[0];
                this.idade = Integer.parseInt(partes[1]);
                this.vaga = partes[2];
                this.estado = partes[3];
                
                Candidate c = new Candidate(nome, idade, vaga, estado);
                listaCandidatos.add(c);
                
                System.out.println(nome + ";" + idade + ";" + vaga + ";" + estado );
                
                
                
            }
            
            leitor.close();
            
        } catch(IOException e){
            e.printStackTrace();
        }
        
        return listaCandidatos;
    }
    
    
}
    


public static class CandidateCSV {
    static String nomeArquivo = "./Sorted_Academy_Candidates.csv";
    
    
    
    public static void AdicionarCandidate(Candidate c){
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
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Candidate c = new Candidate("Luiz", 20, "FS", "SC");
        CandidateCSV.AdicionarCandidate(c);
        System.out.println(c.getNome());
        
        int idadeQA = 0;
        int idadeMobile = 0;
        for(int i = 0; i < c.listaCandidatos.size(); i++){
            
            if(c.listaCandidatos.get(i).vaga.equalsIgnoreCase("QA")){
                idadeQA+= c.listaCandidatos.get(i).idade;
            }else if (c.listaCandidatos.get(i).vaga.equalsIgnoreCase("Mobile")){
                idadeMobile+= c.listaCandidatos.get(i).idade;
            }
        }
        
        System.out.println(" im = " + idadeMobile);
            
        
    }
}