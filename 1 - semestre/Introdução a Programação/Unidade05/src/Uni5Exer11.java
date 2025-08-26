

public class Uni5Exer11 {
    public static void main(String[] args) {
       
        int biscoito = 1, qtdQuebrados = 1;

        for(int i=0;i<16;i++){
            qtdQuebrados*=3;
            biscoito*=qtdQuebrados;
        }System.out.println("Total de biscoitos quebrados = " + biscoito);
        
    }
    
}
