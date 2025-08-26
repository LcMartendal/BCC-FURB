import java.util.Scanner;

public class un2Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        

        System.out.println("Digite o valor");
        int valor = scan.nextInt();

        if(valor>=100){
            int qtd100 = valor/100;
            valor =  valor - (qtd100*100);
            System.out.println("Qtd100 " + qtd100);
             if(valor<100){
                 int qtd50 = valor/50;
                 valor = valor - (qtd50*50);
                 System.out.println("qtd50 " + qtd50);
                if (valor<50){
                    int qtd20 = valor/20;
                    valor = valor - (qtd20*20);
                    System.out.println("qtd20 " + qtd20);
                    if(valor<20){
                        int qtd10 = valor/10;
                        valor = valor - (qtd10/10);
                        System.out.println("qtd10 " + qtd10);
                        if(valor<10){
                             int qtd5 = valor/5;
                             valor = valor - (qtd5*5);
                             System.out.println("qtd5 " + qtd5);
                            if(valor<5){
                                int qtd2 = valor/2;
                                valor = valor - (qtd2*2);
                                System.out.println("qtd2 " + qtd2);
                                if(valor<2){
                                    int qtd1 = valor/1;
                                    valor = valor - (qtd1*1);
                                    System.out.println("qtd1 " + qtd1);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println(" Nada informado!");
        }
    
        
        
        
        

    
         scan.close();          
   
    }
    
}
