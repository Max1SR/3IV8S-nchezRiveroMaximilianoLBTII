import java.util.Scanner;
class DecimalBinario {
  public static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);

    int opcion;
    char letras;
    int numbinario;
    String binario = "";

    System.out.println("Alumno: Sanchez Rivero Maximiliano");

    do{
    System.out.println("Ingrese el numero postivo entero que desee converir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";

                    // Tengo que comprobar que el entero positivo
                    if (numbinario > 0) {
                        // Debo de aplicar el algoritmo
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;

                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "\n No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);

      System.out.println("Desea repetir el programa, si es así escriba s");
      letras = entrada.next().charAt(0);
    }while (letras == 's' || letras == 'S');
   }
}