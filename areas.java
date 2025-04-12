import java.util.Scanner;
class areas {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("a que figuras desea ayar el area" );
    System.out.println("1circulo");
    System.out.println("2triangulo");
    System.out.println("3rectangulo ");
    String opcion = sc.nextLine();
    double resultado = 0;
    switch(opcion){
        case "1":
             System.out.print("ingresa el radio de el circulos ");
             double radio  = sc.nextDouble();
              resultado = radio * radio * 3.1416;
              System.out.print("el radio de tu circulos es:"+resultado );
              break;
              
              case "2":
              
             System.out.print("ingresa la base de su triangulo  ");
              double base = sc.nextDouble();
              System.out.print("ingresa la altura de su triangulo ");
              double altura = sc.nextDouble();
              resultado = base * altura/2;
               System.out.print("el area de tu triangulo es:  "+ resultado);
               break;
               case "3":
                System.out.print("ingresa el ancho de su rectangulo  ");
                 double ancho = sc.nextDouble();
                  System.out.print("ingresa el largo de su rectangulo ");
                  double largo  = sc.nextDouble();
                  resultado = ancho * largo;
                  System.out.print("el area de tu rectangulo es :  "+ resultado); 
                  break;
                  
                 
     }
    
    }
}
