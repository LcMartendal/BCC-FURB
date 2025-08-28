import java.text.DecimalFormat;
import java.util.Scanner;

public class un2Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        System.out.println("Digite o valor de A!");
        double A = scan.nextDouble();
        System.out.println("Digite o valor de B!");
        double B = scan.nextDouble();
        System.out.println("Digite o valor de C!");
        double C = scan.nextDouble();
        

        double areaTriRet = (A*C)/2;
        double areaCirc = 3.14159 * (C*C);
        double areaTrap = ((A+B)*C)/2;
        double areaQuad = B*B;
        double areaRet = A*B;

        System.out.println("TRIANGULO: " + df_3.format(areaTriRet));
        System.out.println("CIRCULO: " + df_3.format(areaCirc));
        System.out.println("TRAPEZIO: " + df_3.format(areaTrap));
        System.out.println("QUADRADO: " + df_3.format(areaQuad));
        System.out.println("RETANGULO: " + df_3.format(areaRet));

        scan.close();
    }
    
}
