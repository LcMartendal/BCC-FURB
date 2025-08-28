/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import model.Aluno;
import model.OrdenacaoPorNome;

/**
 *
 * @author Lc Martendal
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
            Aluno a1 = new Aluno();
            a1.setMatricula(205108);
            a1.setNome("Flávia Moritz");
            a1.setEndereco("Rua São Paulo, 295");
            a1.setDataNascimento(LocalDate.of(2001, 01, 05));
            alunos.add(a1);
            
            Aluno alunoProcurar = new Aluno();
            alunoProcurar.setMatricula(205108);
            alunoProcurar.setNome("Flávia Moritz");
            int posicao = alunos.indexOf(alunoProcurar);
            if (posicao > -1) {
            Aluno alunoEncontrado = alunos.get(posicao);
            System.out.println(alunoEncontrado.getNome());
            }else 
                System.out.println("Não localizou aluno!");
            
            
            alunos.add(new Aluno(6925,"Zé","R.XV de Novembro 192",LocalDate.of(2000,2,18)));
            alunos.add(new Aluno(1010,"Marta","R. 7 de setembro, 942",LocalDate.of(2001,9,7)));
            
            for(Aluno a : alunos){
                System.out.println("Nome: " + a.getNome() + "Matricula -" + a.getMatricula());
            }
            
            Collections.sort(alunos, new OrdenacaoPorNome());
            
            for(Aluno a : alunos){
                System.out.println("Nome: " + a.getNome() + "Matricula -" + a.getMatricula());
            }
            
    }
  
    
}
