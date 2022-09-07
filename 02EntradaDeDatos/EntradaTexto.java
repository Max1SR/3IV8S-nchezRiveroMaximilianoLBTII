//esto es un comentario

/*
 *Todo programa en java debe tener el combre de la clase tal cual como el archivo
 */

class EntradaTexto {
    // los limites de la clase

    // toda la clase debe de tener un metodo principal
    /**
     * vamos a realizar un programa mediante el cual podemos introducir texto a
     * nuestra conveniencia
     */

    // metodo principal
    public static void main(String[] args) {

        // tipo de dato
        String nombre;
        // el ; es el fin de linea

        // instancia, es un objeto
        System.out.println("Por favor introduce tu nombre asi bien kawaii");

        // vamos a obtener el nombre del usuario

        nombre = System.console().readLine();

        System.out.println("Hola " + nombre + " bienvenido a tu programita");
    }
}