package Ejercicios.ObjetosPuntuales;

public class Fraccion {
    private int numerador;
    private int denominador;

    // Constructor
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
    }

    // Método para sumar dos fracciones
    public void sumar(Fraccion otraFraccion) {
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        int nuevoNumerador = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
        System.out.println("La suma es: " + nuevoNumerador + "/" + nuevoDenominador);
    }

    // Método para restar dos fracciones
    public void restar(Fraccion otraFraccion) {
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        int nuevoNumerador = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
        System.out.println("La resta es: " + nuevoNumerador + "/" + nuevoDenominador);
    }

    // Método para multiplicar dos fracciones
    public void multiplicar(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.numerador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        System.out.println("La multiplicación es: " + nuevoNumerador + "/" + nuevoDenominador);
    }

    // Método para dividir dos fracciones
    public void dividir(Fraccion otraFraccion) {
        if (otraFraccion.numerador != 0) {
            int nuevoNumerador = this.numerador * otraFraccion.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.numerador;
            System.out.println("La división es: " + nuevoNumerador + "/" + nuevoDenominador);
        } else {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
    }
}
