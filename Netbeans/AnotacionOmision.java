/*
 * Es un programa donde se suman 2 números
 * En un método sumar se realiza con ints por lo que
 * ésta solo puede sumar valores enteros, mientras que
 * la otra al usar double, se pueden usar decimales
 */
package ejercicio0000335;

/**
 * version 1.0 desde Classroom
 * since 2023
 * @author Andrés
 */
public class AnotacionOmision {
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Suma: " + calculadora.sumar(2, 3));
        System.out.println("Suma: " + calculadora.sumar((double)2, 3));
    }
}


class Calculadora {
    @Deprecated
    /**
     * Este método suma valores enteros
     */
   
    public int sumar(int a, int b){
        return a + b;
    }
    
    /**
     * Este método suma valores enteros y con decimales.
     * @param a
     * @param b
     * @return 
     */
    public double sumar(double a, double b){
        return a + b;
    }
}
