import java.util.Scanner;

public class un2Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vUnP1 = 2.50, vUnP2  = 5;
        double valorP1 = 0, valorP2 = 0;
        int conComp=0;
        

    while (conComp!=2){
        System.out.println("cod peça 1 = 258");
        System.out.println("cod peça 2 = 259");
        System.out.println("Digite o cod da peça");
        int cod=scan.nextInt();
    
    
        if(cod == 258){
            System.out.println("Peça 1");
            System.out.println("digite a qtd");
            int qtdP1 = scan.nextInt();
            valorP1 = qtdP1 * vUnP1;
            System.out.println("valor total em " + valorP1);
            System.out.println("Continuar comprando? (digite 1 para sim, 2 para não)");
            conComp=scan.nextInt();

        }
        else if (cod == 259){
            System.out.println("Peça 2");
            System.out.println("digite a qtd");
            int qtdP2 = scan.nextInt();
            valorP2 = qtdP2 * vUnP2;
            System.out.println("valor total em " + valorP2);
            System.out.println("Continuar comprando? (digite 1 para sim, 2 para não)");
            conComp=scan.nextInt();
        }
                
        else  {
            System.out.println("Código não cadastrado!");
        } 

    }
        double vTotal = valorP1 + valorP2;
        System.out.println("Valor total = " + vTotal);

        scan.close();
    }
    
}
