import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da multa 1: ");
        Double multa1 = scan.nextDouble();
        System.out.print("Digite o valor da multa 2: ");
        Double multa2 = scan.nextDouble();
        System.out.print("Digite o valor da multa 3: ");
        Double multa3 = scan.nextDouble();

        System.out.print("Escolha uma opção do menu: ");
        System.out.println("Multa mais alta (1)");
        System.out.println("Multa mais baixa (2)");
        System.out.println("Multas impressas em ordem crescente (3)");
        System.out.println("Media das multas pagas (4)");
        int op=scan.nextInt();
        int maior, menor;

        switch (op) {
            case 1:  
            maior = (int) Math.max(multa1, Math.max(multa2, multa3));
            System.out.println("Multa mais alta = " + maior);
                break;
            case 2:
            menor = (int) Math.min(multa1, Math.min(multa2, multa3));
            System.out.println("Multa mais baixa = " + menor);
                break;
            case 3: 
                break;
            case 4:
                break;    
        
            default:
                break;
        }

        scan.close();
    }
    
}
