import java.util.Scanner;

public class uni6exer06 {
        public static void main(String[] args) { 
            Scanner scan = new Scanner(System.in);
            System.out.print("Adicione a quantidade de elementos que o vetor possui: ");
            int elementos = scan.nextInt();

            double[] vetor = new double[elementos];
            
            lerElementos(vetor, scan); 
            verificarValores(vetor, scan);
        }
        public static void lerElementos(double vetor[], Scanner scan) {
            for(int i = 0; i < vetor.length; i++){
                System.out.println("Digite o valor do vetor " + (i + 1));
                vetor[i] = scan.nextDouble();

            }
            for(double valores : vetor){
                System.out.print(valores + " ");
            }
            System.out.println("");
        }
        public  static void verificarValores(double vetor[], Scanner scan){
            boolean contido = false;
            int numDoVetor = 0;
            System.out.print("Informe o valor a ser verificado: ");
            double valor = scan.nextDouble();

            for(int i = 0; i < vetor.length; i++){
                if(valor == vetor[i]){
                    contido = true;
                    numDoVetor = i;                    
                }else contido = false;   
            }if(contido){
                System.out.println("O valor está contido no vetor " + numDoVetor);
            }else System.out.println("O valor não está contido no vetor ");

        }           
            

           
}
