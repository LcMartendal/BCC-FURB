import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval2 {
    
    private static final int TAMANHO = 8;              // >> TAMANHO DO TABULEIRO
    private static final int NUMERO_DE_NAVIOS = 10;          // >> NUMERO DE NAVIOS NO TABULEIRO
    private static final int NUMERO_DE_TENTATIVAS = 30;      // >> NUMERO DE TENTATIVAS 

    // >> CRIEI ESSES DUAS VARIAVES PARA USAR NOS METODOS
    static int numNaviosRestantes = NUMERO_DE_NAVIOS;           
    static int numTentativasRestantes = NUMERO_DE_TENTATIVAS;

    static char[][] TABULEIRO = new char[TAMANHO][TAMANHO]; // >> TIPO DE ARRAY É "CHAR" POR SE NECESSITA SÓ UM CARACTERE
    
    
        private static void iniciarTabuleiro(char[][] TABULEIRO) {// >> INICIA O TABULEIRO PREENCHENDO COM "~" COMO SE FOSSE AGUA
            for (int i = 0; i < TAMANHO; i++) {
                for (int j = 0; j < TAMANHO; j++) {
                TABULEIRO[i][j] = '~';
                }
            }
        }
        private static void colocarNavios(char[][] TABULEIRO) {// >> COLOCA OS NAVIOS ALEATORIAMENTE NO TABULEIRO USANDO RADOM
            Random random = new Random();
            for (int i = 0; i < NUMERO_DE_NAVIOS; i++) {
                int x, y;
                do {
                    x = random.nextInt(TAMANHO);
                    y = random.nextInt(TAMANHO);
                } while (TABULEIRO[x][y] == 'N');
                TABULEIRO[x][y] = 'N';
            }
        }
        private static void exibirTabuleiro(boolean mostrarNavios) {// >> EXIBE O TABULEIRO, QUANDO FOR "TRUE" MOSTRA OS NAVIOS, 
            System.out.println("  0 1 2 3 4 5 6 7");                //    E "FALSE" SO AS INFORMAÇÕES CONSEGUIDAS ATÉ O MOMENTO
            for (int i = 0; i < TAMANHO; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < TAMANHO; j++) {
                    if (!mostrarNavios && TABULEIRO[i][j] == 'N') {
                        System.out.print("~ ");
                    } else {
                        System.out.print(TABULEIRO[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        
        private static boolean validarCoordenadas(int x, int y){      // >> AQUI SE VALIDA AS COORDENADAS DADAS, "TRUE" QUANDO 
            return x >= 0 && x < TAMANHO && y >= 0 && y < TAMANHO;   //     ESTIVER NA CONDIÇÃO E "FALSE" O INVERSO        
        }
        private static int lerInteiro(Scanner scan) {
            while (true) {
                try {
                    String input = scan.next();
                    int num = Integer.parseInt(input);
                    return num;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                }
            }
        }
    

        private static void jogar() { // >> É ONDE SE FAZ AS JOGADAS
            Scanner scan = new Scanner(System.in);
            while (numNaviosRestantes > 0 && numTentativasRestantes > 0) {// >> VERIFICAÇÃO DO NUM DE TENTATIVAS RESTANTES E NAVIOS RESTANTES
                System.out.println("Tentativas restantes: " + numTentativasRestantes);
                System.out.println("Navios restantes: " + numNaviosRestantes);
                exibirTabuleiro(false);  //  >> MOSTRA O TABULEIRO MAS NÃO AS POSIÇÕES DOS NAVIOS  
                System.out.print("Digite a linha do ataque (0-7): "); // >> ONDE O USUARIO DIGITA A LINHA QUE DESEJA
                int x = lerInteiro(scan);
                System.out.print("Digite a coluna do ataque (0-7): "); // >> ONDE O USUARIO DIGITA A COLUNA QUE DESEJA
                int y = lerInteiro(scan);
                System.out.println(""); // >> PULA LINHA 
                
    
                if (!validarCoordenadas(x, y)) {
                    System.out.println("Coordenadas inválidas. Tente novamente.\n");
                    continue; // >> QUANDO AS COORDENADAS FOREM INVALIDAS É VOLTADO IMEDIATAMENTE 
                }             //    PARA O TESTE DE CONDIÇÃO DO LAÇO DE REPETIÇÃO 
    
                if (TABULEIRO[x][y] == 'X' || TABULEIRO[x][y] == 'O') {
                    System.out.println("Você já atacou essa posição. Tente novamente.\n");
                    continue; // >>  QUANDO AS COORDENADAS JA FORAM ATACADAS É VOLTADO IMEDIATAMENTE 
                }             //     PARA O TESTE DE CONDIÇÃO DO LAÇO DE REPETIÇÃO 
    
                numTentativasRestantes--; 
    
                if (TABULEIRO[x][y] == 'N') {
                    System.out.println("Você acertou um navio!\n");
                    TABULEIRO[x][y] = 'X';
                    numNaviosRestantes--; // >> O NUMERO DE NAVIOS DIMINUE CONFORME É ACERTADO, MARCANDO UM "X" NA COORDENADA 
                } else {
                    System.out.println("Você errou o ataque. Tente novamente!\n");
                    TABULEIRO[x][y] = 'O'; // >> MARCA UM "O" NA COORDENADA ATACADA QUE NÃO É UM NAVIO 
                    
                }
            }
    
            exibirTabuleiro(true); // >> QUANDO FOR TRUE, MOSTRA A POSIÇÃO DOS NAVIOS 
            if (numNaviosRestantes == 0) {
                System.out.println("Parabéns! Você destruiu todos os navios!"); // >> MENSAGEM QUE GANHOU
            } else {
                System.out.println("Você perdeu! Tentativas esgotadas. Boa sorte na proxima!"); // MENSAGEM QUE PERDEU
                System.out.println("restaram " + numNaviosRestantes );
            }
            scan.close();
        }         
        public static void main(String[] args) {
            System.out.println("----------------");
            System.out.println("BATALHA NAVAL ");
            System.out.println("----------------\n");
            // >> CHAMANDO OS METODOS <<
            iniciarTabuleiro(TABULEIRO);
            colocarNavios(TABULEIRO);
            jogar();     
        }
}