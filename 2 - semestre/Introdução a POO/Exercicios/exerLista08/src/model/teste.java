/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lc Martendal
 */
public class teste {
    public static void main(String[] args){
        
        Turma t = new Turma();
             
    Aluno aluno = new Aluno();
    String nome = "pedor";
    aluno.setNome(nome);
    int numMatricula = 7777;
    aluno.setMatricula(numMatricula);
    double notaENEM = 97;
    aluno.setNotaEnem(notaENEM);
    
    t.incluirAluno(aluno);
    
    Aluno aluno2 = new Aluno();
    String nome2 = "lui";
    aluno2.setNome(nome2);
    int numMatricula2 = 8888;
    aluno2.setMatricula(numMatricula2);
    double notaENEM2 = 77;
    aluno2.setNotaEnem(notaENEM2);
    
    t.incluirAluno(aluno2);
    
    for(int i = 0; i < t.getAlunos().size(); i++){
        System.out.print(t.getAlunos().get(i).getNome() + "-" + t.getAlunos().get(i).getMatricula());
    }
        System.out.print(t.obterAlunoMelhorNotaEnem().getNome());
    }
}
