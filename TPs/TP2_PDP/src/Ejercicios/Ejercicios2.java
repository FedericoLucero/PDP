package Ejercicios;

public class Ejercicios2 {
    public static void main(String[] args) {
        ejercicio1(5, 10);
        ejercicio2(4, 3, 7, 2.8);
        ejercicio3(1, 2, 3, 4);
        ejercicio4(2.5);
        ejercicio5(5.0, 6.0, 7.0);
    }

    // Ejercicio 2.1
    public static void ejercicio1(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales.");
        }
    }

    // Ejercicio 2.2
    public static void ejercicio2(int x, int y, double n, double m) {
        System.out.println("Suma de X e Y: " + (x + y));
        System.out.println("Resta de N y M: " + (n - m));
        System.out.println("Producto de X y N: " + (x * n));
        System.out.println("División de Y entre M: " + (y / m));
    }

    // Ejercicio 2.3
    public static void ejercicio3(int a, int b, int c, int d) {
        System.out.println("Valores iniciales: A=" + a + ", B=" + b + ", C=" + c + ", D=" + d);
        int temp = b;
        b = c;
        c = a;
        a = d;
        d = temp;
        System.out.println("Valores finales: A=" + a + ", B=" + b + ", C=" + c + ", D=" + d);
    }

    // Ejercicio 2.4
    public static void ejercicio4(double radio) {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es: " + volumen);
    }

    // Ejercicio 2.5
    public static void ejercicio5(double a, double b, double c) {
        double semiPerimetro = 0.5 * (a + b + c);
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c));
        System.out.println("El área del triángulo es: " + area);
    }
}
