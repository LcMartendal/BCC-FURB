import java.util.Scanner;

public class uni6exer07 {
        public static void main(String[] args) {            
            
            Scanner scan = new Scanner(System.in);                

            System.out.println("Informe um valor inteiro ( < 20)");
            int vI = scan.nextInt();

            int[] vetor = new int[vI];
            lerValores(scan, vetor);           
            ordenarValores(vetor);
            resultadoVetor(vetor);
                
            
        }
        public static void lerValores(Scanner scan, int[] vetor) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite o " + (i+1) + "º número inteiro: ");
                int valor = scan.nextInt();
                inserirValor(vetor, valor, i);
            }
        }
    
        public static void inserirValor(int[] vetor, int valor, int index) {
            for (int i = 0; i < index; i++) {
                if (vetor[i] == valor) {                    
                    System.out.println("O valor " + valor + " já existe no vetor. Digite outro valor.");
                    index--;
                    return;
                }
            }
            vetor[index] = valor;
            System.out.println("Valor " + valor + " inserido com sucesso!");
        }
              

        public static void ordenarValores(int[] vetor) {
            int aux = 0;
            for(int i = 0; i < vetor.length; i++){
                for(int j = 0; j < vetor.length; j++){
                    if(vetor[i] < vetor[j]){
                        aux = vetor[j];
                        vetor[j] = vetor[i];
                        vetor[i] = aux;
                    }
                }
            }
            
        }
        public static void resultadoVetor(int[] vetor) {
            for(int valores : vetor){
                System.out.print(valores + " ");
            }
            
        }
    
    
}
