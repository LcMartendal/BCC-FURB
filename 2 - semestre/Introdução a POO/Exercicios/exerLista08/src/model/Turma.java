/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Lc Martendal
 */
public class Turma {
    
    private String disciplina;
    private Professor professor;
    private Turno turno;
    
    private ArrayList<Aluno> turma = new ArrayList<>();

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos(){
        return turma;
    }
    
    public void incluirAluno(Aluno aluno){
        turma.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        turma.remove(aluno);
    }
    
    
    public Aluno obterAlunoMelhorNotaEnem(){
        Aluno alunoMaiorNota = turma.get(0);
        
        for(int i = 0; i < turma.size(); i++){
            
            if(turma.get(i).getNotaEnem() > alunoMaiorNota.getNotaEnem()){
                alunoMaiorNota = turma.get(i);
                
            }
                                                        
        }
        
        return  alunoMaiorNota;  
    }
    
    
    
}
