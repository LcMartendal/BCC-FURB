import java.util.Scanner;

public class Uni5Exer20 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int tempo = 0, finalizador = 1;
        double massaFinal = 0;

        System.out.println("Massa inicial: ");
        double massaInicial = scan.nextDouble();
        double massa = massaInicial;
        while (finalizador != 0) {
            tempo+= 50;
            massaFinal = massa/2;
            massa = massaFinal;
            if(massa < 0.5){
                finalizador = 0;
            }
        }
        System.out.println("Massa inicial = " + massaInicial + ", Massa final =  " + massaFinal + ", tempo necessario = " + tempo);
        scan.close();
    }
    
}
