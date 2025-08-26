import java.util.Scanner;

public class Uni5Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = 0, n2 = 0 ;
        String nome = "";
        while (!nome.equals("fim")) {

            System.out.println("Digite nome do aluno: ");
            nome = scan.next();
            
            System.out.println("Digite nota 1 do aluno: ");
            n1 = scan.nextDouble();

            System.out.println("Digite nota 2 do aluno: ");
            n2 = scan.nextDouble();

            System.out.println("Media do aluno: " + nome + " = " + ((n1+n2)/2));

        }
        scan.close();
        
    }
    
}
