import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BatalhaNavalRefactory {
    
    private static final int TAMANHO = 8;                    // >> TAMANHO DO TABULEIRO
    private static final int NUMERO_DE_NAVIOS = 10;          // >> NUMERO DE NAVIOS NO TABULEIRO
    private static final int NUMERO_DE_TENTATIVAS = 30;      // >> NUMERO DE TENTATIVAS 
    private char[][] TABULEIRO = new char[TAMANHO][TAMANHO]; // >> TIPO DE ARRAY É "CHAR" POR SE NECESSITA SÓ UM CARACTERE

    // >> CRIEI ESSES DUAS VARIAVES PARA TER CONTROLE DA QUANTIDADE ATUAL DE NAVIOS E TENTATIVAS
    private int numeroAtualDeNavios = NUMERO_DE_NAVIOS;           
    private int numeroAtualDeTentativas = NUMERO_DE_TENTATIVAS;
    
    public void jogar() { // >> É ONDE SE FAZ AS JOGADAS
        iniciarTabuleiro();
        colocarNavios();

        while (numeroAtualDeNavios > 0 && numeroAtualDeTentativas > 0) {// >> VERIFICAÇÃO DO NUM DE TENTATIVAS RESTANTES E NAVIOS RESTANTES
            System.out.println("Tentativas restantes: " + numeroAtualDeTentativas);
            System.out.println("Navios restantes: " + numeroAtualDeNavios);
            exibirTabuleiro(false);  //  >> MOSTRA O TABULEIRO MAS NÃO AS POSIÇÕES DOS NAVIOS  
            
            int x = pegarCoordenada("linha");
            int y = pegarCoordenada("coluna");


            System.out.println(""); // >> PULA LINHA 

            if (TABULEIRO[x][y] == 'X' || TABULEIRO[x][y] == 'O') {
                System.out.println("Você já atacou essa posição. Tente novamente.\n");
                continue; // >>  QUANDO AS COORDENADAS JA FORAM ATACADAS É VOLTADO IMEDIATAMENTE 
            }             //     PARA O TESTE DE CONDIÇÃO DO LAÇO DE REPETIÇÃO 

            numeroAtualDeTentativas--; 

            if (TABULEIRO[x][y] == 'N') {
                System.out.println("Você acertou um navio!\n");
                TABULEIRO[x][y] = 'X';
                numeroAtualDeNavios--; // >> O NUMERO DE NAVIOS DIMINUE CONFORME É ACERTADO, MARCANDO UM "X" NA COORDENADA 
            } else {
                System.out.println("Você errou o ataque. Tente novamente!\n");
                TABULEIRO[x][y] = 'O'; // >> MARCA UM "O" NA COORDENADA ATACADA QUE NÃO É UM NAVIO 
            }
        }

        if (numeroAtualDeNavios == 0) {
            System.out.println("Parabéns! Você destruiu todos os navios!"); // >> MENSAGEM QUE GANHOU
        } else {
            System.out.println("Você perdeu! Tentativas esgotadas. Boa sorte na proxima!"); // MENSAGEM QUE PERDEU
            System.out.println("Restaram " + numeroAtualDeNavios + " navios a serem destruidos!");
        }
        System.out.println("\nLocalização de todos os navios:");
        exibirTabuleiro(true); // >> QUANDO FOR TRUE, MOSTRA A POSIÇÃO DOS NAVIOS 
    }


    private void iniciarTabuleiro() {// >> INICIA O TABULEIRO PREENCHENDO COM "~" COMO SE FOSSE AGUA
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
            TABULEIRO[i][j] = '~';
            }
        }
    }
    
    private void colocarNavios() {// >> COLOCA OS NAVIOS ALEATORIAMENTE NO TABULEIRO USANDO RADOM
        Random random = new Random();
        for (int i = 0; i < numeroAtualDeNavios; i++) {
            int x, y;
            do {
                x = random.nextInt(TAMANHO);
                y = random.nextInt(TAMANHO);
            } while (TABULEIRO[x][y] == 'N');
            TABULEIRO[x][y] = 'N';
        }
    }

    private void exibirTabuleiro(boolean mostrarNavios) {// >> EXIBE O TABULEIRO, QUANDO FOR "TRUE" MOSTRA OS NAVIOS, 
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

    private int pegarCoordenada(String parametro) {
        Scanner scan;
        int coordenada = -1;
        while (!isValid(coordenada)) {
            System.out.print("Digite a " + parametro + " do ataque (0-7): "); // >> ONDE O USUARIO DIGITA 
            scan = new Scanner(System.in);
            // >> UTILIZANDO TRY CATCH PARA CAPTURAR ENTRADAS INVÁLIDAS PARA O SCANNER. EX. DIGITAR UMA LETRA AO INVÉS DE NÚMERO, QUE SERIA O QUE O SCANNER ESPERA
            try {
                coordenada = scan.nextInt();
                
            } catch (InputMismatchException e) { // >> A exceção InputMismatchException é lançada pela instância do Scanner quando o token recuperado não corresponde ao tipo esperado.
                System.out.println("Parametro passado deve ser um numero");
            }
        }
        return coordenada;
    }

    private boolean isValid(int coordenada) {
        return coordenada < 0 || coordenada > 7 ? false : true; 
    }
         
    public static void main(String[] args) {
        System.out.println("----------------");
        System.out.println("BATALHA NAVAL ");
        System.out.println("----------------\n");
        
        BatalhaNavalRefactory batalhaNaval = new BatalhaNavalRefactory();
        batalhaNaval.jogar();        
    }
}