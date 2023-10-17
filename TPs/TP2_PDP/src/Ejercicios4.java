import java.util.Scanner;

public class Ejercicios4 {
    public static void main(String[] args) {
        Ejercicios4 ejercicios = new Ejercicios4();
        ejercicios.ejercicio1();
        ejercicios.ejercicio2();
        ejercicios.ejercicio3();
        ejercicios.ejercicio4();
        ejercicios.ejercicio5();
        ejercicios.ejercicio6();
        ejercicios.ejercicio7();
    }
    Scanner scanner = new Scanner(System.in);

    // Ejercicio 4.1
    public void ejercicio1() {
        char caracter;
        do {
            System.out.print("Ingrese un caracter ('X' para detener): ");
            caracter = scanner.next().charAt(0);
        } while (caracter != 'X');
    }

    // Ejercicio 4.2
    public void ejercicio2() {
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Buenos días " + nombre);
    }

    // Ejercicio 4.3
    public void ejercicio3() {
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    // Ejercicio 4.4
    public void ejercicio4() {
        final double IVA = 0.21;
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        double precioFinal = precio * (1 + IVA);
        System.out.println("El precio final con IVA es: " + precioFinal);
    }

    // Ejercicio 4.5
    public void ejercicio5() {
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

    // Ejercicio 4.6
    public void ejercicio6() {
        System.out.print("Ingrese la cantidad de números a promediar: ");
        int cantidad = scanner.nextInt();
        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double promedio = suma / cantidad;
        System.out.println("El promedio de los números es: " + promedio);
    }

    // Ejercicio 4.7
    public void ejercicio7() {
        System.out.print("Ingrese un día de la semana (1:lunes,2:martes,3:miercoles,4:jueves,5:viernes,6:sabado,7:domingo): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Es un día laboral.");
                break;
            case 6: case 7:
                System.out.println("No es un día laboral.");
                break;
            default:
                System.out.println("Día inválido.");
        }
    }
}
