public class Persona {
    private String nombre;
    private int edad;
    private char genero;

    public Persona() {

    }

    // sobrecargamos Persona:
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    // genero se puede dejar como String (cadena) sin embargo al ser la variable
    // tipo char se genera una vulnerabilidad en el sistema, alguien puede poner mal
    // una letra
    public void setGenero(char genero) {
        this.genero = genero;
    }
}
