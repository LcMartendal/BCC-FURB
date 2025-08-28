import java.text.DecimalFormat;
import java.util.Scanner;

public class un2Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        System.out.println("Digite o valor de x1");
        double x1 = scan.nextDouble();
        System.out.println("Digite o valor de x2");
        double y1 = scan.nextDouble();        
        System.out.println("Digite o valor de y1");
        double x2 = scan.nextDouble();
        System.out.println("Digite o valor de y2");
        double y2 = scan.nextDouble();

        
        double distancia = (x2-x1)-(y2-y1);

        
        System.out.println(df_4.format(distancia));
        
        scan.close();
    }
    
}
