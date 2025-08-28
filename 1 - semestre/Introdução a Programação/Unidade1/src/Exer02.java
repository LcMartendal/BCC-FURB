import java.util.Scanner;

public class Exer02 {

    static String fruta = "";
    
    private static void inserirFrutas(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da fruta: ");
        fruta = scan.next();

        scan.close();
    }
    private static void avaliacaoDasFrutas(){

        if(fruta.equals("amora")||fruta.equals("nectarina")||fruta.equals("ameixa")||fruta.equals("goiaba")){
            System.out.println("Eu gosto");
        }else System.out.println("Eu como mas não gosto");

    }


    public static void main(String[] args) {
        System.out.println("2) Elabore um programa que receba o nome de uma fruta. Caso a fruta informada seja amora,\r\n" + //
                        "nectarina, ameixa ou goiaba, exiba como saída o nome da fruta informada seguida de \"eu\r\n" + //
                        "gosto\", e caso contrário exiba o nome da fruta seguida de \" eu como mas não gosto\"\n");
        inserirFrutas();
        avaliacaoDasFrutas();
    }
}
