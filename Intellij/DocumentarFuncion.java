package ejercicio0000353;

/**
 * Clase que permite documentar una funcion
 * @version 1.0 Version Classroom
 * @since 2023
 * @author Andres
 */

public class DocumentarFuncion {
    /**
     * Funcion principal (ejecutable)
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        sumar(3, 2);
        System.out.println(sumar(3, 2));
    }
    /**
     * Funcion que permite sumar dos numeros
     * @param a primer numero
     * @param b segundo numero
     * @return suma de los dos numeros
     */
    public static int sumar (int a, int b) {
        return a + b;
    }
}

