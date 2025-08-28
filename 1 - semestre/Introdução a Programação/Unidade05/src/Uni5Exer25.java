import java.util.Scanner;

public class Uni5Exer25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int pontos = 0, diferenca = 0, jogadorD = 0, jogadorE = 0;

        while (pontos < 21 && diferenca < 2){
            while ( pontos >= 21 && diferenca < 2){

                String jogador = scan.next();

                if(jogador.equalsIgnoreCase("D")){
                    jogadorD++;
                    
                }else if(jogador.equalsIgnoreCase("E")){
                    jogadorE++;

                }
                diferenca = Math.max(jogadorD, jogadorE) - Math.min(jogadorD, jogadorE);
                
                if(jogadorD >= 21 && diferenca == 2){
                    System.out.println("jogador da direita ganhou!");
                }else if(jogadorE >= 21 && diferenca ==2){
                    System.out.println("jogador da esquerda ganhou!");
                }
            }
        } System.out.println();
        scan.close();
    }
    
}
