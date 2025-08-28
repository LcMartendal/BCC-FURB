import java.util.Scanner;

public class uni6exer01 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        lerNumeros(numeros);
        escreverNumerosInversos(numeros);
    }

    public static void lerNumeros(int[] numeros) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 10 num int");

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Numero " + (i + 1 ) + ": ");
            numeros[i] = scan.nextInt();
        }
        scan.close();        
    }

    public static void escreverNumerosInversos(int[] numeros) {
        System.out.println("Numeros na ordem inversa:");
        for(int i = numeros.length - 1;i >=0; i --){
            System.out.println(numeros[i]);
        }
    }
    
}