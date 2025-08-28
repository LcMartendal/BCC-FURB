import java.util.Scanner;

public class Uni5Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vtVenda=0, vtCompra=0, vVenda=0, vCompra=0, finalizar = 0; 
        int produto1=0, produto2=0, produto3=0;
        String nome = "";

        
            while (finalizar == 0) {
                for(int i = 0; i <= 20 ; i++){
            
                System.out.println("Digite o nome da mercadoria: ");
                nome = scan.next();

                System.out.println("Digite o preço de compra");
                double PC = scan.nextDouble();
                vtCompra+=PC;

                System.out.println("Digite o preço de venda");
                double PV = scan.nextDouble();
                vtVenda+=PV;
            
                if((PV-PC)/PC*100<10){
                    produto1++;
                }else if(10<=(PV-PC)/PC*100&&(PV-PC)/PC*100<=20){
                    produto2++;
                }else if((PV-PC)/PC*100>20){
                    produto3++;
                }
                System.out.println("Nome: " + nome);
                System.out.println("Valor  de compra = " + vCompra);
                System.out.println("Valor  de venda = " + vVenda);
                finalizar++;
        }
            System.out.println("lucro < 10% =  " + produto1 + "\n" + "10% <= lucro <= 20% = " + produto2 + "\n" + "lucro > 20% = " + produto3);
            System.out.println("Valor total de compra = " + vtCompra);
            System.out.println("Valor total de venda = " + vtVenda);
            System.out.println("Valor do lucro total = " + (produto1 + produto2 + produto3));
            finalizar--;
        }
        scan.close();
    }
}
