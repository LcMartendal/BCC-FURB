import java.util.Scanner;

public class uni6exer03 {

    public static void main(String[] args) {
        double[] valores = new double[12];
        lerValores(valores);
        ajustarValores(valores);
        imprimirValores(valores);
    }

    public static void lerValores(double[] valores) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 22 valores reais:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = teclado.nextDouble();
        }
        teclado.close();
    }

    public static void ajustarValores(double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if ((i + 1) % 2 == 0)
                valores[i] *= 1.02;
            else
                valores[i] *= 1.05;
        }
    }

    public static void imprimirValores(double[] valores) {
        System.out.println("Valores ajustados:");
        for (int i = 0; i < valores.length; i++)
            System.out.println("Posição " + (i + 1) + ": " + valores[i]);
    }
}
