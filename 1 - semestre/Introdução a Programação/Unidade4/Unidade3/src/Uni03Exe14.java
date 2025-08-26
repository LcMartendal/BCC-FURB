import java.util.Scanner;

public class Uni03Exe14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distancia(KM): ");
        double km=scan.nextDouble();
        System.out.println("Digite o tempo gasto(HR): ");
        double hora=scan.nextDouble();

        System.out.println("Velocidade media = " + (km/hora) + "KM/H");
        System.out.println("Qtd combustivel gasto = " + (km/12) + "L");

        scan.close();
    }
    
}
