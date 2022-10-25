import java.util.Scanner;

import javax.print.attribute.standard.PageRanges;

import java.lang.Math;

public class AreayPerimetro {
   
    double lado, altura, area, perimetro, lado2, lado3, radio;
    int opcion;
    char letra;
    boolean pan = false;
    String a, b, c, d;

    // objeto
    Scanner entrada = new Scanner(System.in);

    // metodos
    public void menu() {
        do {
            System.out.println("Programa de calculo de areas y perimetros");
            System.out.println("Elija una opcion");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                    calcularTriangulo();
                    break;
                case 3:
                    calcularCirculo();
                    break;
                case 4:
                    calcularRectangulo();
                    break;
             
                default:
                    System.out.println("Gracias por su atencion");

            }
            System.out.println("Desea repetir el programa, S para repetir");
  letra = entrada.next().charAt(0);
        } while (letra == 's' || letra == 'S');
    }


  
     public void calcularCuadrado() {
  
        do {
            System.out.println("Ingrese el valor del lado del cuadrado");
            a = entrada.nextLine();
            try {
                lado = Double.parseDouble(a);
                pan = false;
            } catch (NumberFormatException ex) {
                pan = true;
                System.out.println("Valor no valido");
            }
        } while (pan);
        perimetro = lado * 4;
        area = lado * lado;
        System.out.println("El perimetro es de: " + perimetro + " el area es de : " + area);
    }


    public void calcularTriangulo(){
        do {
            System.out.println("Ingrese el valor del la base (lado 1) del triangulo");
      a = entrada.nextLine();

            System.out.println("Ingrese el valor del lado 2 del triangulo");
      b = entrada.nextLine();

          System.out.println("Ingrese el valor del lado 3 del triangulo");
      c = entrada.nextLine();
          
          System.out.println("Ingrese el valor del la altura del triangulo");
        d = entrada.nextLine();

          try{
              lado = Double.parseDouble(a);
              lado2 = Double.parseDouble(b);
              lado3 = Double.parseDouble(c);
              altura = Double.parseDouble(d);
              pan = false;
  
          } catch (NumberFormatException ex){
            pan = true;
            System.out.println("Valor no valido");
          }
        }while (pan);
    perimetro = lado + lado2 +lado3;
    area = (lado * altura)/2;
    System.out.println("El perimetro es de: " + perimetro + " el area es de : " + area);
  }



    public void calcularCirculo(){
  do{
    System.out.println("Ingrese el valor del radio del circulo");
    a = entrada.nextLine();

    try{
      radio = Double.parseDouble (a);
      pan = false;
    }catch (NumberFormatException ex){
      pan = true;
      System.out.println("Valor no valido");
    }
    
  }while (pan);
    perimetro = Math.PI * (2*radio);
    area = Math.PI * Math.pow(radio,2);
    System.out.println("El perimetro es de: " + perimetro + " el area es de : " + area);
  }


    public void calcularRectangulo(){
   do{ 
    System.out.println("Ingrese el valor de la base del rectangulo");
    a = entrada.nextLine();
    
    System.out.println("Ingrese el valor de la altura del rectangulo");
    b = entrada.nextLine();



     try{
        lado = Double.parseDouble(a);
        lado2 = Double.parseDouble(b);
       
        pan = false;
       
     }catch(NumberFormatException ex){
       pan = true;
       System.out.println("Valor no valido");
     }
   }while (pan);
    perimetro = (2*lado) + (2*lado2) ;
    area = lado * lado2;
    System.out.println("El perimetro es de: " + perimetro + " el area es de : " + area);
    
    
  }
}