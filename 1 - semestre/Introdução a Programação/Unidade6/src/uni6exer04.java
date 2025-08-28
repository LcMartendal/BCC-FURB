import java.util.Scanner;

public class uni6exer04 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        lerValores(vetor1, vetor2);
        somarVetores(vetor1, vetor2, vetor3);
        escreverVetores(vetor1, vetor2, vetor3);
    }    
            public static void lerValores(int[] vetor1, int[] vetor2){
                Scanner scan = new Scanner(System.in);
                System.out.println("digite 10 valores para o vetor 1:");
                for(int i = 0; i < vetor1.length; i++){
                    System.out.println("Digite o valor " + vetor1[i + 1]);
                    vetor1[i] = scan.nextInt();
                }
                System.out.println("digite 10 valores para o vetor 2:");
                for(int i = 0; i < vetor2.length; i++){
                    System.out.println("Digite o valor " + vetor2[i + 1]);
                    vetor2[i] = scan.nextInt();
                }
                scan.close();
            }
            public static void somarVetores(int[] vetor1, int[] vetor2, int[] vetor3) {
                for(int i = 0; i < vetor3.length; i++){
                vetor3[i] = vetor1[i] + vetor2[i];
                }                
            }
            public static void escreverVetores(int[] vetor1, int[] vetor2, int[] vetor3){
                System.out.println("vetor 1");
                escreverVetor(vetor1);
                System.out.println("vetor 2");
                escreverVetor(vetor2);
                System.out.println("vetor 3");
                escreverVetor(vetor3);
            }
            public static void escreverVetor(int[] vetor) {
                for (int valor : vetor)
                    System.out.print(valor + " ");
                System.out.println();
            }
        }
            
        
    
    

