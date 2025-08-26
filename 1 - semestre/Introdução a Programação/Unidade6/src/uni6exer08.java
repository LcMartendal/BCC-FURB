import java.util.Scanner;

public class uni6exer08 {
    
    public static void main(String[] args) {
       
    }

    public static void lerValores(Scanner scan, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
            vetor[i] = scan.nextDouble();
        }
    }

    public static void imprimirTabela(double[] vetor) {
        System.out.println("Valor  |   frequencia");
        System.out.println("----------------------");

        for (int i = 0; i < vetor.length; i++) {
            double valor = vetor[i];
            int frequencia = 1;

            
            boolean contado = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == valor) {
                    contado = true;
                    break;
                }
            }

            if (!contado) {
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[j] == valor) {
                        frequencia++;
                    }
                }
                System.out.println(valor + "      |   " + frequencia);
            }
        }
    }
}