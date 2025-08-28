import java.util.Scanner;

public class beecrowd1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A =scan.nextLine();
        String B =scan.nextLine();
        String C =scan.nextLine();

        if(A.equalsIgnoreCase("vertebrado")){
            if(B.equalsIgnoreCase("ave")){
                if(C.equalsIgnoreCase("carnivoro")){
                System.out.println("aguia");
                }else if(C.equalsIgnoreCase("onivoro")){
                System.out.println("pomba");
                }

            }else if(B.equalsIgnoreCase("mamifero")){
                if(C.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }else if(C.equalsIgnoreCase("herbivoro")){
                    System.out.println("vaca");
                }
            }
            
        }else if(A.equalsIgnoreCase("invertebrado")){

            if(B.equalsIgnoreCase("inseto")){
                if(C.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }else if(C.equalsIgnoreCase("herbivoro")){
                    System.out.println("lagarta");
                }

            }else if(B.equalsIgnoreCase("anelideo")){
                if(C.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                }else if(C.equalsIgnoreCase("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
        scan.close();

    }
    
}
