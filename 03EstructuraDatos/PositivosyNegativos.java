import java.util.Scanner;

class PositivosyNegativos {
  public static void main(String[] args) {
    System.out.println("Alumno: Sanchez Rivero Maximiliano");

  Scanner entrada = new Scanner(System.in);
    int opcion, c, n;
    int positivo = 0;
    int negativo = 0;
    int neutro = 0;
    
    
    System.out.println("Ingrese la cantidad de numeros a clasificar");
      c = entrada.nextInt();
    
        if (c > 0){
          for (int contador = 1; contador <= c; contador++){
                System.out.println("Ingrese un numero o una serie de numeros");
                  n = entrada.nextInt();
              if (n > 0){
                positivo++;
            
          } else if (n < 0) {
              negativo++;

          
          }else  {
              neutro++;
          
        } 
            
            }
            

          System.out.println("La cantidad de numeros positivos es: "+positivo);
          System.out.println("La cantidad de numeros negativos es: "+negativo);
          System.out.println("La cantidad de numeros neutros es: "+neutro);
        
       } else {
            System.out.println("La cantidad de numeros es incorrecta");
              
          }




  
  
  }
}