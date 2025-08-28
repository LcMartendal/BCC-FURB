import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("registre as medidas do odômetro: ");  double odômetroIn = scan.nextDouble();        
        System.out.print("Digite a qtd de combustivel antes de sair:  ");   double qtdCombAntes = scan.nextDouble();     
        System.out.println("Digite a qtd de paradas: ");    int qtdParadas = scan.nextInt();
        
        double odometroParadas=0, qtdCombParadas=0;

        for(int i = 1; i<=qtdParadas;i++){
            System.out.print("registre o valor do odômetro na parada:");    odometroParadas=scan.nextDouble();            
            odometroParadas+=odometroParadas;
            System.out.print("Digite a quantidade de combustível comprado para reabastecer ");  qtdCombParadas=scan.nextDouble();            
            qtdCombParadas+=qtdCombParadas;

            System.out.println("a quilometragem obtida por litro de combustível na parada " + i +": " + df.format(odometroParadas/qtdCombParadas));

        }
        System.out.println("Digite a qtd de combustivel apos a chegada: ");
        double qtdCombPos = scan.nextDouble();
        System.out.println("a quilometragem média obtida por litro de combustível em toda a viagem: " + df.format((odômetroIn + odometroParadas)/(qtdCombAntes + qtdCombPos + qtdCombParadas)));
        scan.close();
    }
    
}
