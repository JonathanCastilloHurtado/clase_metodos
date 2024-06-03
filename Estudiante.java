import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println();
    }

    // Método para mostrar la información de todos los estudiantes
    public static void mostrarTodosEstudiantes(Estudiante[] estudiantes) {
        System.out.println("Información de los estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInformacion();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Limitar la cantidad de estudiantes a 5
        int cantidadEstudiantes = 5;

        // Crear un arreglo para almacenar los estudiantes
        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];

        // Pedir al usuario que ingrese los datos de cada estudiante
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad del estudiante " + (i + 1) + ":");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido para la edad.");
                scanner.next(); // Descarta la entrada inválida
            }
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del entero

            System.out.println("Ingrese la carrera del estudiante " + (i + 1) + ":");
            String carrera = scanner.nextLine();

            // Crear un nuevo objeto Estudiante con los datos proporcionados y almacenarlo en el arreglo
            estudiantes[i] = new Estudiante(nombre, edad, carrera);
        }

        // Mostrar la información de todos los estudiantes
        mostrarTodosEstudiantes(estudiantes);

        scanner.close(); // Cerrar el scanner
    }
}
