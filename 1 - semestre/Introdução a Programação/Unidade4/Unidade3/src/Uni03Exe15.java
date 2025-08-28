import java.util.Scanner;

public class Uni03Exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro(3 Digitos no maximo)");
        int num=scan.nextInt();
        if(num<=999||num>=0){
        int centena = num/100;       
        int dezena = (num%100)/10;        
        int unidade = (num%10)/1;      

        System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
        }else{
            System.out.println("Erro");
        }

        scan.close();
    }
    
}
