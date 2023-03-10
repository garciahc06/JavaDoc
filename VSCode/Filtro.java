package ejercicio0000270;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Este programa realiza un filtro de los núeros los cuales muestra por
 * pantalla aquellos que son pares
 * @version 1.0 ClassRoom
 * @since 2023
 * @author Andrés
 */
public class Filtro {
     /**
     * Método main (ejecutable).
     * Lo primero, se inicializa e instancia un ArrayList de valores.
     * Luego se llaman a una serie de funciones las cuales calculan si es un número par o no
     * (desconozco la verdadera función que realizan estas funciones)
     * Al final muestra por pantalla los números pares.
     * @param args para el metodo main (ejecutable)
     */
       public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 7, 13, 10, 6, 8);

        Predicate<Integer> esNumeroPar = x -> x % 2 == 0;

        numeros.stream().filter(esNumeroPar)
                .forEach(System.out::println);
    }
}
