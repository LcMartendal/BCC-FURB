import java.util.Scanner;

public class Uni5Exer9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a qtd de alunos da turma: ");
        int qtdAlunos=scan.nextInt();
        int maiorde20=0, idade = 0 ;
        String nome = "";

        for(int i = 1;i<=qtdAlunos;i++){
            System.out.println("Digite o nome do aluno: ");
            nome = scan.next();
            System.out.println("Digite a idade do aluno: ");
            idade = scan.nextInt();

                if(idade==18){
                    System.out.println("Aluno com 18 anos: " + nome);
                }
                else if (idade>20){
                    maiorde20++;
                }           
              
            }
            System.out.println("qtd de alunos com mais de 20 anos: " + maiorde20);  
            scan.close();  
    }
    
}
