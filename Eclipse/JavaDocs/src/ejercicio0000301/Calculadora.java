package ejercicio0000301;
/** 
 * Este programa corresponde a una calculadora
 * @version 1.0 ClassRoom
 * @author Andrés
 */
public class Calculadora {
	/**
	 * @param PI constante double, número pi 
	 */
    private static final double PI = 3.14159265358979;
    /**
	 * @param E constante double, número e
	 */
    private static final double E = 2.718281828459;
    /**
	 * Método constructor, no contiene nada.
	 */
    public Calculadora() {
    }
    /**
	 * Metodo sumar, realiza la suma de dos valores.
	 * @param a double
	 * @param b double
	 * @return a + b
	 */
    public double sumar(double a, double b){
        return a + b;
    }
    /**
   	 * Metodo restar, realiza la resta de dos variables.
   	 * @param a double
   	 * @param b double
   	 * @return a - b
   	 */
    public double restar(double a, double b){
        return a - b;
    }
    /**
   	 * Metodo multiplicar, realiza la multiplicacion de dos variables.
   	 * @param a double
   	 * @param b double
   	 * @return a * b
   	 */
    public double multiplicar(double a, double b){
        return a * b;
    }
    /**
   	 * Metodo dividir, realizar la division de 2 variables.
   	 * @param a double
   	 * @param b double
   	 * @return a / b o AricmeticException si se divide por el valor 0
   	 */
    public double dividir(double a, double b){
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Intento de división entre cero.");
        }
    }
    /**
   	 * Metodo potencia,eleva el valor base al valor del exponente 
   	 * @param base double
   	 * @param exponente double
   	 * @return base^exponente
   	 */
    public double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }
    /**
   	 * Metodo valorAbsoluto
   	 * @param valor double
   	 * @return valor
   	 */
    public double valorAbsoluto(double valor){
        return Math.abs(valor);
    }
}