import java.util.Scanner;

public class Uni5Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int numCanal = 1, qtdPessoas = 0, emissora4 = 0, emissora5 = 0, emissora9 = 0, emissora12 = 0, cont = 0;

            while (numCanal!=0) {

                System.out.println("Escolha o  número de canal (4-5-9-12): ");
                numCanal = scan.nextInt();
                
                if(numCanal!=0){
                System.out.println("Digite a qtd de pessoas: ");
                qtdPessoas = scan.nextInt();
                cont+= qtdPessoas;
                if(numCanal == 4 ){
                    emissora4+= qtdPessoas;

                }else if(numCanal == 5 ){
                    emissora5+= qtdPessoas;

                }else if (numCanal == 9) {
                    emissora9+= qtdPessoas; 

                }else emissora12+= qtdPessoas;
                }

            }
            System.out.println("percentual de audiência emissora 4: " + ((emissora4*100)/cont));
            System.out.println("percentual de audiência emissora 5: " + ((emissora5*100)/cont));
            System.out.println("percentual de audiência emissora 9: " + ((emissora9*100)/cont));
            System.out.println("percentual de audiência emissora 12: " + ((emissora12*100)/cont));
            
            scan.close();
    }
    
}
