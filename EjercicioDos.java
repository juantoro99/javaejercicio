class EjercicioDos {
    public static void main(String[] args) {
        
        String nombre ;
        String correo;
        int edad;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" ingresa su nombre:");
        nombre = sc.nextLine();
        
        System.out.print(" ingresa su correo:");
          correo = sc.nextLine();
          
           System.out.print(" ingresa su edad:");
            edad= sc.nextInt();
         
         System.out.println(" el nombre es:" +nombre);
         
          System.out.println(" el correo electronico es:"+correo);
          
         System.out.println(" la edad es:" +edad);
    }
}
