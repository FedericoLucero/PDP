import Ejercicios.*;
import Ejercicios.ObjetosPuntuales.*;

public class Main {
    public static void main(String[] args) {

        Ejercicios1 ejercicios1 = new Ejercicios1();
        ejercicios1.ejercicio1();
        ejercicios1.ejercicio2();
        ejercicios1.ejercicio3();

        Ejercicios2 ejercicios2 = new Ejercicios2();
        ejercicios2.ejercicio1(5, 10);
        ejercicios2.ejercicio2(4, 3, 7, 2.8);
        ejercicios2.ejercicio3(1, 2, 3, 4);
        ejercicios2.ejercicio4(2.5);
        ejercicios2.ejercicio5(5.0, 6.0, 7.0);

        Ejercicios3 ejercicios3 = new Ejercicios3();
        ejercicios3.ejercicio1();
        ejercicios3.ejercicio2(3);
        ejercicios3.ejercicio3();
        ejercicios3.ejercicio4();
        ejercicios3.ejercicio5();

        Ejercicios4 ejercicios4 = new Ejercicios4();
        ejercicios4.ejercicio1();
        ejercicios4.ejercicio2();
        ejercicios4.ejercicio3();
        ejercicios4.ejercicio4();
        ejercicios4.ejercicio5();
        ejercicios4.ejercicio6();
        ejercicios4.ejercicio7();

        Ejercicios5 ejercicios5 = new Ejercicios5();
        ejercicios5.ejercicio1a();
        ejercicios5.ejercicio1b();
        ejercicios5.ejercicio1c();
        ejercicios5.ejercicio2a();
        ejercicios5.ejercicio2b();
        ejercicios5.ejercicio2c();


        Ejercicios6 ejercicios6 = new Ejercicios6();
        ejercicios6.ejercicio1();
        ejercicios6.ejercicio2();
        ejercicios6.ejercicio3();
        ejercicios6.ejercicio4();

        Ejercicios7 ejercicios7 = new Ejercicios7();
        ejercicios7.ejercicio1();

        Arbol arbol1 = new Arbol(4);
        Arbol arbol2 = new Arbol("Roble");
        Arbol arbol3 = new Arbol();
        Arbol arbol4 = new Arbol(5, "Pino");

        Persona persona1 = new Persona("Ana", 30, "Femenino", "Ingeniera");
        persona1.saludar();
        Punto P1 = new Punto(10,0);
        Punto P2 = new Punto(0,0);
        System.out.println("\ndistancia entre dos puntos " + P1.calcularDistancia(P2));
        Sumatoria sumatoria1 = new Sumatoria();
        System.out.println("\nTabla de multiplicar para sumatoria1:");
        sumatoria1.mostrarTablaDeMultiplicar();
        Libro libro1 = new Libro("978-0451524935", "Moby-Dick", "Herman Melville", 635);
        System.out.println("\nInformación del libro 1:");
        libro1.obtenerInformacion();
        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(3, 4);
        fraccion1.sumar(fraccion2);
    }
}