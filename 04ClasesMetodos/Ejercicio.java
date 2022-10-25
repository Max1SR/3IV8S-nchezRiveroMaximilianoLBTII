import java.util.Scanner;

class Ejercicio {

    /*
     * Vamos a hacer un programa mediante el cual vamos a tener cuatro opciones que
     * son:
     * 1. Otra calculadora
     * 2. Conversion de unidades
     * 3. Creacion de un cuadrito magico
     * 4. Movimiento de un cuadro
     */

    // objetos
    Scanner entrada = new Scanner(System.in);

    // metodos o comporatamientos de la clase
    // Vamos a crear un metodo para el menu

    /*
     * public es el aceceso al tipo de dato, clase o metodo, cualquier elemento del
     * programa puede acceder a él
     * private es de acceso restringifo solo medianto reglas se puede acceder a el
     * protectedse puede tener acceso solo desde la misma clase y aplicando la
     * herencia de POO entre los hijos y padres
     * 
     * Un metodo tambien es un tipo de dato aplicado
     */
    char op;

    public void menu() {
        System.out.println("Bienvenido a los metodos");
        System.out.println("Elije una de las siguientes opciones");
        System.out.println("a. Calculadora");
        System.out.println("b. Conversion de Unidades");
        System.out.println("c. Creacion de Cuadros");
        System.out.println("d. Movimiento de un Cuadrado");
        op = entrada.next().charAt(0);
        switch (op) {
            case 'a':
                // vamos a hacer un metodo
                Ejercicio1();
                double num1 = 0.00, suma = 0.00, multi;

                char operacion;

                System.out.println("Seleccione la operacion que desea realizar: ");
                System.out.println("a. Suma y Resta ");
                System.out.println("b. Multiplicacion ");
                System.out.println("c. Division");

                operacion = entrada.next().charAt(0);
                switch (operacion) {
                    case 'a':
                        do {
                            System.out.println("Para detener la operacion escriba 0");
                            System.out.println("Escriba todos los numeros que quiera sumar o restar");
                            num1 = entrada.nextDouble();
                            suma += num1;
                            System.out.println("El resultado es: " + suma);

                        } while (num1 != 0);
                        break;
                    case 'b':
                }

                break;

            case 'b':
                // vamos a hacer un metodo
                Ejercicio2();
                break;

            case 'c':
                // vamos a hacer un metodo
                Ejercicio3();
                break;

            case 'd':
                // vamos a hacer un metodo
                Ejercicio4();
                break;

            default:
                System.out.println("Instruccion no valida");
        }

    }

    // metodo1
    public void Ejercicio1() {

    }

    // metodo2
    public void Ejercicio2() {
        /*
         * Realizar conversion de metros a cm y pugadas
         * 
         * 
         * m/s a km/h
         */

        double metros = 0.00, kg = 0.00, vel = 0.00, cm = 100.00, pulgadas = 39.37, gramos = 1000.00, libra = 2.20,
                ms = 0.00;
        double a, b;

        System.out.println("Seleccione la cantidad que desse convertir");
        System.out.println("a. Metros a cmm y pulgadas");
        System.out.println("b. Kg a libras y gramos");
        System.out.println("c. m/s a km/h");

        op = entrada.next().charAt(0);
        switch (op) {
            case 'a':
                System.out.println("Ingrese la cantidad de metros");
                metros = entrada.nextDouble();
                a = metros * cm;
                b = metros * pulgadas;
                System.out.println(
                        "La cantidad de metros son: " + metros + " en cm son: " + a + " en pulgadas son: " + b);
                break;

            case 'b':
                System.out.println("Ingrese la cantidad de kilogramos");
                kg = entrada.nextDouble();
                a = kg * gramos;
                b = kg * libra;
                System.out.println("La cantidad de kg son: " + kg + " en gramos son: " + a + " en libras son: " + b);
                break;

            case 'c':
                System.out.println("Ingrese la cantidad de m/s");
                ms = entrada.nextDouble();
                a = ms * (3600 / 1000);
                System.out.println("La conversion de m/s a km/h son: " + a);
                break;

            default:
                System.out.println("Opcion no valida ayos");
                break;
        }

    }

    // metodo3
    public void Ejercicio3() {
        /*
         * Realizar un programa que imprima un cuadrado de maximo 1000 *
         */
    }

    // metodo4
    public void Ejercicio4() {
        /*
         * Vamos a realizar un programa que se encarge de imprimir con
         *************************
         * 
         * ////////////////////////
         ************************
         * ////////////////////////
         ************************
         * 
         * un cuadrado de maximo 100 de dimension
         */
    }
}
