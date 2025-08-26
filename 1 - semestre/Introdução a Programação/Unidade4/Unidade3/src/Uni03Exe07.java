import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni03Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df3 = new DecimalFormat("0.000");

        System.out.println("lata de 350 ml");
        int L300=scan.nextInt();
        System.out.println(" garrafa de 600 ml ");
        int g600=scan.nextInt();
        System.out.println("e garrafa de 2 litros");
        int g2L=scan.nextInt();

        System.out.println("Quantidade de Litros comprados: " + df3.format((L300*0.350)+(g600*0.600)+(g2L*2)) + " Litros");
        scan.close();

    }
    
}
