import java.util.Scanner;

public class Uni5Exer19 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double valor_da_compra = 1, desc1 = 0, desc2 = 0, cont1 = 0, cont2 = 0;

        while (valor_da_compra!=0) {

            System.out.println("Digite o valor da compra: ");
            valor_da_compra = scan.nextDouble();

            if(valor_da_compra != 0){

                if(valor_da_compra>500){
                    desc1 = (valor_da_compra*20)/100;
                    System.out.println("Total a pagar = " + (valor_da_compra - desc1));
                    cont1+= (valor_da_compra - desc1);
                }else if(valor_da_compra<=500){
                    desc2 = (valor_da_compra*15)/100;
                    System.out.println("Total a pagar = " + (valor_da_compra-desc2));
                    cont2+= (valor_da_compra-desc2);
                }  
            }            
        }
        System.out.println(" valor total recebido pela loja ao final do dia: " + (cont1+cont2));
        scan.close();
    }
    
}
