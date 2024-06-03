package com.johncastle.pooclasemuestra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.sql.Array;


public class MainActivity extends AppCompatActivity {

    private String nombre;
    private int edad;
    private String carrera;

    static String estudiante1="Mateo";
    static String estudiante2="Josue";
    static String estudiante3="Roman";
    static String estudiante4="Andres";
    static String estudiante5="Rodolfo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] estudiantes=llenarEstudiantes();
        mostrarTodosEstudiantes(estudiantes);
        // Pedir al usuario que ingrese los datos de cada estudiante
        /*for (int i = 0; i < cantidadEstudiantes; i++) {
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
        }*/

        // Mostrar la información de todos los estudiantes
       // mostrarTodosEstudiantes(estudiantes);

        //scanner.close(); // Cerrar el scanner
    }


    // Método para mostrar la información del estudiante
    //TODO IMPRIMIR TODOS LOS VALORES DE LOS ESTUDIATES
    public static void mostrarInformacion(String nombre) {
        Log.d("HOLA","Nombre: " + nombre);
    }

    // Método para mostrar la información de todos los estudiantes
    public static void mostrarTodosEstudiantes(String[] estudiantes) {
        Log.d("HOLA","Información de los estudiantes:");

        for (String estudiante : estudiantes) {
            mostrarInformacion(estudiante);
        }
    }

    //TODO cambiar el tipo de retorno a [][] y a 5 estudiantes
    public static String[] llenarEstudiantes(){

        // Limitar la cantidad de estudiantes a 5
        int cantidadEstudiantes = 5;

        // Crear un arreglo para almacenar los estudiantes
        String[] estudiantes = new String[cantidadEstudiantes];
        estudiantes[0]=estudiante1;
        estudiantes[1]=estudiante2;
        estudiantes[2]=estudiante3;

        return estudiantes;
    }
}

