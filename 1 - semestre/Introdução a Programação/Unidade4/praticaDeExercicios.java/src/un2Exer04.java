import java.text.DecimalFormat;
import java.util.Scanner;

public class un2Exer04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double notaA, notaB;
        System.out.println("Digite nota A!");
        notaA=scan.nextDouble();
        System.out.println("Digite nota B!");
        notaB=scan.nextDouble();
        double media = (notaA * 3.5 + notaB * 7.5)/11;  

        System.out.println(df_2.format(media));

    }
    
}
