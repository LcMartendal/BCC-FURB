import java.util.Scanner;

public class Exer01 {

    static String nomeCompleto = "";

        public static void inserirNome() {
            Scanner scan = new Scanner(System.in);
            System.out.print("DIGITE SEU NOME COMLETO:");
            nomeCompleto = scan.nextLine();

            scan.close();
        }
    
        public static void exibirIniciais() {
            StringBuilder iniciais = new StringBuilder();     
            String[] palavras = nomeCompleto.split(" ");
            
            for (String palavra : palavras) {
                if (!palavra.isEmpty()) {
                    
                    iniciais.append(Character.toUpperCase(palavra.charAt(0)));
                }
            }    
            System.out.println("Iniciais: " + iniciais.toString());
        }

        public static void exibirNomeMaiusculo() {
            
            String nomeMaiusculo = nomeCompleto.toUpperCase();     
            System.out.println("Nome em maiúsculas: " + nomeMaiusculo);
        }
        public static void main(String[] args) {
        System.out.println("1) Elabore um programa que receba seu nome.completo, e após, exiba como saída as suas\r\n" + //
                        "iniciais (propriedade charAt) e em outra linha o nome informado em letra maiúscula\r\n" + //
                        "(propriedade toUpperCase).\n");
        inserirNome();
        exibirIniciais();
        exibirNomeMaiusculo();

        }
}
    
