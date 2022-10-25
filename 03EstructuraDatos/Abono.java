import java.util.Scanner;

class Abono {
  public static void main(String[] args) {
    System.out.println("Alumno: Sanchez Rivero Maximiliano");

    Scanner entrada = new Scanner (System.in);
    double edad, precio, descuento;
		char continuar;
    char socios;
    

    System.out.println("Indique el precio del abono");
      precio = entrada.nextInt();

    do{
      
      System.out.println("Indique su edad");
      edad = entrada.nextInt();
      if (edad>65){
        descuento = precio - (precio * .40);
          System.out.println("El precio final con descuento aplicado es de: "+ descuento);

        
      }else if (edad<21){
        System.out.println("¿Sus padres son socios? S/N");
         socios= entrada.next().charAt(0);
          if(socios == 'S' || socios == 's'){
              descuento = precio - (precio * .45);
          System.out.println("El precio final con descuento aplicado es de: "+ descuento);
          }else {
            descuento = precio - (precio * .25);
             System.out.println("El precio final con descuento aplicado es de: "+ descuento);
          
          }

        
        
        
      } else {
        System.out.println("No se le aplica ningun descuento");
        
      }


    System.out.println("¿Desea repetir? (S/N)");
			continuar= entrada.next().charAt(0);
      
    }while (continuar == 's' || continuar == 'S');

    
  }
}