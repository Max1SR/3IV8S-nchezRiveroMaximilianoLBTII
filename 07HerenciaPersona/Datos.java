import javax.swing.JOptionPane;

public class Datos {

    // NECESITAMOS PODER ALMACENAR UNA LISTA DE ESTUDIANTES
    Estudiante obj[] = new Estudiante[5];

    int x = 0;

    void menu() {
        /*
         * Crear dos opciones
         * 1.- Registrar nuevo estudiante
         * 2.- Mostrar lista de estudiantes
         */
        String var = "si";
        while (var.equalsIgnoreCase("si")) {
            /*
             * Cuando se solicite una entrad de informacion debemos de utilizar JOptionPnain
             * el metodo de showInputDialog pero
             * debemos de entender que todas las entradas de una interfaz son de tipo cadena
             */
            int op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n" + "Ingresa la opcion deseada: \n"
                    + "1.- Registrar nuevo estudiante. \n" + "2.- Mostrar la lista de estudiantes. \n"));
            // variable = llamar a su clase primitiva.convertirlo a entero()

            switch (op) {
                case 1:
                    pedirEstudiante();
                    break;

                case 2:
                    mostrarEstudiante();
                    break;

                default:
                    // Aqui ya no existe el System.out.printl!!! Para eso se usa:
                    // JOptionPane.showMessageDialog/ parentComponent hace referencia a una ventana,
                    // en este caso es necesario poner null ya que no hacemos referencia a una
                    // ventana
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
            var = JOptionPane.showInputDialog("¿Desea registrar un nuevo estudiante?");
        }
    }

    public void pedirEstudiante() {
        /* Debemos declarar primero los datos que vamos a necesitar del estudiante */
        int boleta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta del estudiante"));
        String nom = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante"));
        char gen = JOptionPane.showInputDialog("Ingresa el genero del estudiante").charAt(0);

        // debo de ocupar mi arreglo de objetos

        obj[x] = new Estudiante(boleta, nom, edad, gen);
        x++;
    }

    public void mostrarEstudiante() {
        //
        for (int i = 0; i < x; i++) {
            JOptionPane.showMessageDialog(null,
                    "La boleta del estudiante es: " + obj[i].getNumBoleta() + "\n" + "El nombre del estudiante es: "
                            + obj[i].getNombre() + "\n" + "La edad del estudiante es: " + obj[i].getEdad() + "\n"
                            + " El genero del estudiante es: " + obj[i].getGenero() + "\n");
        }
    }
}
