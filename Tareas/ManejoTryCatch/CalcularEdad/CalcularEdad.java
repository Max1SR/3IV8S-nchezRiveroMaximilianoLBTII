import java.util.Scanner;

class CalcularEdad{

  Scanner entrada = new Scanner(System.in);
  
    int año, mes, dia, añoac, mesac, diaac, edad, edadfinal;
    
    public void menu(){
      System.out.println("Welcome to the los Pollos hermanos Family. My name is Maximiliano, but you can call me Max");
      Calculo();
    }

//metodo 1
public void Datos(){
  System.out.println("Por favor ingrese el Año en que nacio");
    año= entrada.nextInt();
  System.out.println("Por favor ingrese el Mes (numero) en que nacio");
    mes = entrada.nextInt();
  System.out.println("Por favor ingrese el Dia en que nacio");
  dia = entrada.nextInt();
}

//metodo 2
public void Calculo(){
  Datos();
  System.out.println("Por favor ingrese el Año actual en el que se encuentra");
    añoac= entrada.nextInt();
  System.out.println("Por favor ingrese el Mes (numero) actual en el que se encuentra");
    mesac= entrada.nextInt();
  System.out.println("Por favor ingrese el Dia actual en el que se encuentra");
    diaac= entrada.nextInt();

 do{
  try{
    
    if (año<=añoac){
      
        if (mes<13 && mes>0 && mesac<13 && mesac>0 && mes>mesac){
          if(dia<=30 && dia>0 && diaac<=30 && diaac>0 && dia>diaac){
            edad = añoac - año;
            edadfinal= edad + 1;
            System.out.println("Usted tiene: "+edadfinal+" años");
            
          }else if(dia<=30 && dia>0 && diaac<=30 && diaac>0){
            edad = añoac - año;
            System.out.println("Su edad es: "+edad);
          
        }else{System.out.println("El dia es incorrecto");}
        }else if (mes<13 && mes>0 && mesac<13 && mesac>0){
          edad = añoac - año;
          System.out.println("Usted tiene: "+edad+" años");
          }else {System.out.println("El mes es incorrecto");

                }
    }else if (año<=(añoac-200)){
        System.out.println("La edad es incorrecta");
    }else {
      System.out.println("El año de nacimiento no puede ser mayor al año actual");
    }
    
  }catch(Exception e){
    System.out.println("Ingrese solo numeros");
    System.out.println("Error: " + e.getMessage());
  }

    
  } while (edad>0 && edadfinal > 0);

  

  
}
}