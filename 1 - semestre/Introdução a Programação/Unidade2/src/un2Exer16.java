import java.text.DecimalFormat;
import java.util.Scanner;

public class un2Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int lata = 350;
        int garrafa600 = 600;
        int garrafa2L = 2000;
        int conComp = 0;
        double ml1 = 0, ml2 = 0, ml3 = 0;

        while (conComp!=2){
            System.out.println("cod lata =       1");
            System.out.println("cod garrafa600 = 2");
            System.out.println("cod garrafa2L =  3");
            System.out.println("Digite o cod do produto!");
            int cod=scan.nextInt();
        
        
            if(cod == 1){
                System.out.println("lata 350");
                System.out.println("digite a qtd");
                int qtdlata = scan.nextInt();
                ml1 = qtdlata * lata;
                System.out.println("Continuar comprando? (digite 1 para sim, 2 para não)");
                conComp=scan.nextInt();
    
            }
            else if (cod == 2){
                System.out.println("Peça 2");
                System.out.println("digite a qtd");
                int qtdGarrafa600 = scan.nextInt();
                ml2 = qtdGarrafa600 * garrafa600;
                System.out.println("Continuar comprando? (digite 1 para sim, 2 para não)");
                conComp=scan.nextInt();
            }
            else if (cod == 3){
                System.out.println("garrafa 2L");
                System.out.println("digite a qtd");
                int qtdgarrafa2L = scan.nextInt();
                ml3 = qtdgarrafa2L * garrafa2L;
                System.out.println("Continuar comprando? (digite 1 para sim, 2 para não)");
                conComp=scan.nextInt();
            }       
            else  {
                System.out.println("Código não cadastrado!");
            } 
    
        }
            double totalL =( ml1 + ml2 + ml3 )/ 1000;
            System.out.println("quantidade de Litros = " + df_2.format(totalL));
        
             
           scan.close();     
    
    
            
    
           
            
    }
    
}
