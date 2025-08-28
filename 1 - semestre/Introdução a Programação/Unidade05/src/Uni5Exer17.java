import java.util.Scanner;

public class Uni5Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inscricao = 1 ;
        double altura = 0, comp = 0, maiorAltura = 0, menorAltura = 0, cont = 0, cont2 = 0;

        while(inscricao != 0){

            System.out.print("número de inscrição: ");
            inscricao = scan.nextInt();
            
            if(inscricao != 0){
                System.out.print("altura do atleta: ");
                altura = scan.nextDouble();
                cont += altura;
                cont2++;

                maiorAltura = Math.max(altura, comp);
                comp = maiorAltura;
                System.out.println(" Número inscrição: " + inscricao + ", maior altura: " + maiorAltura);

                menorAltura = Math.min(altura, comp);
                comp = menorAltura;
                System.out.println(" Número inscrição: " + inscricao + ", menor altura: " + menorAltura);
            }

        }
        System.out.println("a altura média do grupo de atletas: " + (cont2/cont));
        scan.close();
    }
    
}
