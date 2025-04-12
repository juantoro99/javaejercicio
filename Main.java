import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        double  numero1;
        double  numero2 ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" ingresa el primer numero :");
        numero1 = sc.nextDouble();
        
        System.out.print(" ingresa el seundo numero :");
         numero2 = sc.nextDouble();
         
         System.out.println(" la suma es :" + (numero1 + numero2));
          System.out.println(" la resta  es : "+ (numero1 - numero2));
         System.out.println(" la multiplicacion  es :" + (numero1 * numero2));
          System.out.println(" la division  :"+ (numero1 / numero2));
          System.out.println(" modulo  :"+ (numero1 % numero2));
          
        
         
        
    }
}
