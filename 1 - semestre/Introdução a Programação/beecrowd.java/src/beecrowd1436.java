import java.util.Scanner;

public class beecrowd1436 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        int teste = scan.nextInt(), cont = 0, idade = 1, qtd = 0, mediana = 0, idadeMediana = 0  ;

        while(cont < teste){
            cont++;
            qtd = scan.nextInt();

            if(qtd > 1 && qtd < 11){
                for(int i = 0; i < qtd; i++){
                    idade = scan.nextInt();

                    if(idade >= 11 && idade <= 20){                        
                        
                    }if(qtd % 2 !=0 ){
                        mediana = (qtd + 1) / 2;
                        if(i < mediana){
                            idadeMediana = idade;
                        }
            
                    }else{
                        mediana = (qtd / 2) + 1;
                        idadeMediana = idade;
                        if(i < mediana){
                            idadeMediana = idade;
                        }
                    }    
                }              
                                  
            }   
            System.out.println("case " + cont + ": " + idadeMediana);
        }
         
        scan.close();
        
    }
    
}
