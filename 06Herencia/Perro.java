
public class Perro extends Animal {
    /* La palabra reservada "extends" es para heredar */

    private String ladrido;

    public Perro() {

    }

    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido) {
        /*
         * Para poder acceder a los atributos heredados debemos de hacer uso de la
         * palabra resevada "Super"
         */
        super(nombre, raza, tipo_alimento, edad);
        this.ladrido = ladrido;
    }

    public String getLadrido() {
        return ladrido;
        // si es un metodo que es una cadena debe de retornar una cadena
    }

    // set
    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }

    public void mostrarPerro() {
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Se alimenta de: " + getTipo_alimento()
                + "\n" + "Su edad es: " + getEdad() + "\n" + "Su ladrido es: " + ladrido + "\n");
    }

}