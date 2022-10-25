
 import java.util.Scanner;

class Conversor {
	public static void main (String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			int opcion, escala;
      double celsius;
			double fahrenheit;
			double kelvine;
			double rankine;
		
			char continuar;
			
			
			
		
			System.out.println("Alumno: Sanchez Rivero Maximiliano");

        do{
				
				System.out.println ("Elija una opcion: ");
				System.out.println ("1. Celsius");
				System.out.println ("2. Fahrenheit");
				System.out.println ("3. Kelvine");
				System.out.println ("4. Rankien");
				opcion = entrada.nextInt();
				
				switch (opcion) {
					case 1:

            System.out.println ("Ingrese la cantidad de Grados Celsius");
            celsius =   entrada.nextDouble();
						System.out.println ("¿A que escala de temperatura desea convertir los grados Celsius?: ");
    				
    				System.out.println ("1. Fahrenheit");
    				System.out.println ("2. Kelvine");
    				System.out.println ("3. Rankien");
    				escala = entrada.nextInt();
            
            
                switch (escala) {
                  case 1:
                    fahrenheit = (celsius *(9/5)+32);
                    System.out.println ("Los grados convertidos a fahrenheit son: " + fahrenheit);
    
                    break;
                    
                  case 2:
                    kelvine = celsius + 273.15;
                    System.out.println ("Los grados convertidos a kelvine son: " + kelvine);
    
                    break;
                
    
                  case 3:
                     rankine = celsius * 9/5 + 491.67;
                    System.out.println ("Los grados convertidos a rankine son: " + rankine);
                  break;
                    }
            break;
            
					
					case 2:
						System.out.println ("Ingrese la cantidad de Grados Fahrenheit");
            fahrenheit =   entrada.nextDouble();
						System.out.println ("¿A que escala de temperatura desea convertir los grados Fahrenheit?: ");
    				
    				System.out.println ("1. Celsius");
    				System.out.println ("2. Kelvine");
    				System.out.println ("3. Rankien");
    				escala = entrada.nextInt();
            
            
                switch (escala) {
                  case 1:
                    celsius = (fahrenheit - 32)*(5/9);
                    System.out.println ("Los grados convertidos a celsius son: " + celsius);
    
                    break;
                    
                  case 2:
                    kelvine = (fahrenheit - 32) * 5/9 + 273.15;
                    System.out.println ("Los grados convertidos a kelvine son: " + kelvine);
    
                    break;
                
    
                  case 3:
                     rankine = fahrenheit + 459.67;
                    System.out.println ("Los grados convertidos a rankine son: " + rankine);
                  break;
                    }
            break;
        
					
					case 3:
					System.out.println ("Ingrese la cantidad de Grados Kelvine");
            kelvine =   entrada.nextDouble();
						System.out.println ("¿A que escala de temperatura desea convertir los grados Kelvine?: ");
    				
    				System.out.println ("1. Fahrenheit");
    				System.out.println ("2. Celsius");
    				System.out.println ("3. Rankien");
    				escala = entrada.nextInt();
            
            
                switch (escala) {
                  case 1:
                    fahrenheit = (kelvine - 273.15) * 9/5 + 32;
                    System.out.println ("Los grados convertidos a fahrenheit son: " + fahrenheit);
    
                    break;
                    
                  case 2:
                    celsius =  kelvine - 273.15;
                    System.out.println ("Los grados convertidos a celsius son: " + celsius);
    
                    break;
                
    
                  case 3:
                     rankine = kelvine * 9/5;
                    System.out.println ("Los grados convertidos a rankine son: " + rankine);
                  break;
                    }


          case 4: 
              System.out.println ("Ingrese la cantidad de Grados Kelvine");
            rankine =   entrada.nextDouble();
						System.out.println ("¿A que escala de temperatura desea convertir los grados Kelvine?: ");
    				
    				System.out.println ("1. Fahrenheit");
    				System.out.println ("2. Celsius");
    				System.out.println ("3. Kelvine");
    				escala = entrada.nextInt();
            
            
                switch (escala) {
                  case 1:
                    fahrenheit = rankine - 459.67;
                    System.out.println ("Los grados convertidos a fahrenheit son: " + fahrenheit);
    
                    break;
                    
                  case 2:
                    celsius =  (rankine - 491.67) * 5/9;
                    System.out.println ("Los grados convertidos a celsius son: " + celsius);
    
                    break;
                
    
                  case 3:
                     kelvine = rankine * 1.8;
                    System.out.println ("Los grados convertidos a rankine son: " + kelvine);
                  break;
                    }
				break;
          }
			
			
			System.out.println("¿Desea continuar? (S/N)");
			continuar= entrada.next().charAt(0);
			}while (continuar == 's' || continuar == 'S');
	}
}