
public class Gato extends Animal {
    /* La palabra reservada "extends" es para heredar */

    private int num_vidas;

    public Gato() {

    }

    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas) {
        /*
         * Para poder acceder a los atributos heredados debemos de hacer uso de la
         * palabra resevada "Super"
         */
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    public int getNum_vidas() {
        return num_vidas;
        // si es un metodo que es una cadena debe de retornar una cadena
    }

    // set
    public void setNum_vidas(int num_vidas) {
        this.num_vidas = num_vidas;
    }

    public void mostrarGato() {
        System.out.println("El nombre del gato es: " + getNombre() + "\n" + "Se alimenta de: " + getTipo_alimento()
                + "\n" + "Su edad es: " + getEdad() + "\n" + "Su numero de vidas es: " + num_vidas + "\n");
    }

}