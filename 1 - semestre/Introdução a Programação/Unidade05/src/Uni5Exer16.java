import java.util.Scanner;

public class Uni5Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double altura = 0.1, rpt = 1, alturaMasc = 0, alturaFem = 0;    
        String sexo = "";

            while (altura != 0){
                rpt++;

                altura = scan.nextDouble();
                sexo = scan.next();

                if(sexo.equalsIgnoreCase("m")){
                    alturaMasc+=altura;
                }else sexo.equalsIgnoreCase("f");
                    alturaFem+=altura;

            }
            System.out.println("média da altura das mulheres = " + (alturaFem/rpt));
            System.out.println("média de altura do grupo = " + ((alturaMasc + alturaFem)/rpt));
            scan.close();
        }
    
}
