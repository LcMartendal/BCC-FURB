import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

    private static final double kmLitros = 12;
    static double tempo_gasto = 0;
    static double velocidade_media = 0;
    
    public static void inserirEntradas() {
        Scanner scan = new Scanner(System.in);
        

        System.out.print("Digite o tempo gasto na viagem(em horas):");
        tempo_gasto = scan.nextDouble();
        System.out.print("Digite a velocidade media durante a viagem(em km/h):");
        velocidade_media = scan.nextDouble();

        scan.close();
    }

    public static void exibirSaidas() {
        DecimalFormat df = new DecimalFormat("0.000");

        double quantidade_litros_gastos = tempo_gasto * velocidade_media / kmLitros;
        System.out.println(df.format(quantidade_litros_gastos));
    }

    public static void main(String[] args) {
        System.out.println("4) Selecione e resolva (livre escolha) algum dos desafios do beecrowd que ainda não tenha sido\r\n" + //
                        "resolvido por você.\n");
        System.out.println("beecrowd 1017\r\n" + //
                        " GASTO DE COMBUSTIVEL\r\n" + //
                        "\r\n" + //
                        "         Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem,\r\n" + //
                        "         ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através\r\n" + //
                        "         de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas)\r\n" + //
                        "         e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida,\r\n" + //
                        "         calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.\n");
        inserirEntradas();
        exibirSaidas();

         


    }  
}
