import java.util.Scanner;

public class Uni5Exer6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int alturas=0;
        int media=0;
        for(int i=1; i <=20; i++){
            System.out.println("Digite a altura da pessoa (em cm): ");
            alturas=scan.nextInt();
            media+=alturas;
           
        }

        System.out.println("Média da altura dos alunos (em metros): " + ((media/20)/100));
        scan.close();
    }
    
}
