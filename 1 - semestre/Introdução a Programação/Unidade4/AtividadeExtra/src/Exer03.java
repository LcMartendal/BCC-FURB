import java.util.Scanner;

public class Exer03 {

     static String sexo = "";
    
    private static void inserirSexo(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da fruta: ");
        sexo = scan.next();

        scan.close();
    }
    private static void exibirsexualidade(){
        if(sexo.equalsIgnoreCase("M")){
            System.out.println("Masculino");
        }else if(sexo.equalsIgnoreCase("F")){
            System.out.println("Feminino");
        }else System.out.println("indefinido");              
    }


    public static void main(String[] args) {
        System.out.println("3) Faça um programa que solicite que o usuário informe o sexo. Caso informe a letra M, exiba\r\n" + //
                        "Masculino. Caso informe F, exiba feminino. Caso informe qualquer letra diferente destas duas,\r\n" + //
                        "a saída padrão deve ser Indefinido. Lembre que o usuário pode informar a letra em maiúsculo\r\n" + //
                        "e em minúsculo.\n");
        inserirSexo();
        exibirsexualidade();
    }
}
