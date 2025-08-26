import java.util.Scanner;

public class Uni4exer06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com M, F ou I:");
        String letra = ler.nextLine().toUpperCase();
        char letraChar = letra.trim().charAt(0);
        if (letra.equals("M")){
            System.out.println("Masculino");
        } else if (letraChar == 'F'){
            System.out.println("Feminino");
        }else if (letraChar == 'I'){
            System.out.println("Não informado");
        }else{
            System.out.println("Entrada incorreta");
        }
        ler.close();
    }
}