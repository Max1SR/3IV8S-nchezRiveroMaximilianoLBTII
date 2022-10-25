
public class Animal {

    /*
     * Es poder restringir el acceso a los tipos de dato. Vamos a poder agrupar el
     * acceso a los diferentes metodos u objetos de clase, para que no puedan ser
     * modificados.
     */

    private String nombre, raza, tipo_alimento;
    private int edad;

    /*
     * Definimos el contructor
     * Este nos sirve para poder declarar la existencia de una clase, e inicializar
     * las variables y poder crear las instancias de objetos
     */

    public Animal() {
        // Vacio
    }

    // sobrecarga de metodo
    public Animal(String nombre, String raza, String tipo_alimento, int edad) {
        // para poder definir los parametros de acceso a las variables
        this.nombre = nombre;
        // el valor de la variable "nombre" (va a tener el valor)= del parametro nombre
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;

    }
    /*
     * Poder enviar y obtener los valores correspondientes de las variables
     * getter y setter
     * get-> obtener -> recibir
     * set-> asignar -> enviar
     */

    // get
    public String getNombre() {
        return nombre;
        // si es un metodo que es una cadena debe de retornar una cadena
    }

    // set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // get
    public String getRaza() {
        return raza;
        // si es un metodo que es una cadena debe de retornar una cadena
    }

    // set
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // get
    public String getTipo_alimento() {
        return tipo_alimento;
        // si es un metodo que es una cadena debe de retornar una cadena
    }

    // set
    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    // get
    public int getEdad() {
        return edad;
        // si es un metodo que es un entero debe de retornar un entero
    }

    // set
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
