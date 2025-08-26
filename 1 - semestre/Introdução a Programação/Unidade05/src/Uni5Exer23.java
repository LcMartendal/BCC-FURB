import java.util.Scanner;

public class Uni5Exer23 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nome = "", continuar = "sim";
        double total_vendas = 0, salario = 0, precoProd = 0, qtdVendida = 0;
        int finalizar = 1;
        while (continuar.equals("sim")) {
            
        
            while (finalizar != 0) {

            System.out.println("Digite o nome do vendedor: ");
            nome = scan.next();

            System.out.println("Qtd Vendidas: ");
            qtdVendida = scan.nextDouble();            

            System.out.println("Preço do produto: ");
            precoProd = scan.nextDouble();             
                
            total_vendas = qtdVendida * precoProd;
            salario = (total_vendas * 30) / 100;
            finalizar = 0;
            }
            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: " + total_vendas);
            System.out.println("Salário: " + salario);
            
            finalizar++;
            continuar = scan.next();
         }
         scan.close();
    }
    
}
