import java.text.DecimalFormat;
import java.util.Scanner;

public class testeProva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Quarto single: 120,00\n" + "Quarto double: 180,00" + "Quarto triplo: 250,00" + "Quarto master: 320,00");
        System.out.println("Quarto double: 180,00");
        System.out.println("Quarto triplo: 250,00");
        System.out.println("Quarto master: 320,00");
        System.out.println("Digite a qtd de pessoas: ");
        int qtdPesssoas = scan.nextInt();
        System.out.println("Digite a qtd de dias: ");
        int dias = scan.nextInt();
        double vDiaria = 0, taxa = 0 , total = 0;
        
        if(qtdPesssoas>=1&&qtdPesssoas<=4&&dias>0){
          
        switch(qtdPesssoas){
            case 1: 
            vDiaria = 120.00 * dias;break;            
            case 2:
            vDiaria = 180.00 * dias;break;            
            case 3: 
            vDiaria = 250.00 * dias;break;            
            case 4:
            vDiaria = 320 * dias;break;            
                     
        }
            System.out.println(qtdPesssoas + " pessoas com " + dias + " dias de hospedagem: R$ " + df.format(vDiaria) );            
            System.out.println("adicional da taxa de turismo (12%): R$ " + df.format(taxa = (vDiaria*12)/100) );            
            System.out.println("Total a pagar:                      R$ " + df.format(total = taxa + vDiaria) );
        
        }else{
            System.out.println("O número de pessoas ou dias é superior ou não existente.");
        }

    }
    
}
