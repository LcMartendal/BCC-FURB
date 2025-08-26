import java.util.Scanner;

public class uni6exer02 {

    public static void main(String[] args) {
        double[] valores = new double[12];
        lerValores(valores);
        double media = calcularMedia(valores);
        imprimirMaioresQueMedia(valores, media);
    }

    public static void lerValores(double[] valores) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 12 valores reais:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = teclado.nextDouble();
        }
        teclado.close();
    }

    public static double calcularMedia(double[] valores) {
        double soma = 0;
        for (double valor : valores)
            soma += valor;
        return soma / valores.length;
    }

    public static void imprimirMaioresQueMedia(double[] valores, double media) {
        System.out.println("Valores maiores que a média (" + media + "):");
        for (double valor : valores) {
            if (valor > media)
                System.out.println(valor);
        }
    }
}