import java.text.DecimalFormat;
import java.util.Scanner;

public class un2Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");


        double raio, areaCir;

        System.out.println("Digite valor de raio!");
        raio = scan.nextDouble();

        areaCir = 3.14159 * raio * raio;

        System.out.println(df_4.format(areaCir));



    }
    
}
