package Ejercicios;

import java.util.Scanner;

public class Ejercicios6 {
    public static void main(String[] args) {
        Ejercicios6 ejercicios = new Ejercicios6();
        ejercicios.ejercicio1();
        ejercicios.ejercicio2();
        ejercicios.ejercicio3();
        ejercicios.ejercicio4();
    }

    Scanner scanner = new Scanner(System.in);

    // Ejercicio 6.1
    public void ejercicio1() {
        System.out.print("Ingresa un caracter(1:L, 2:M, 3:X, 4:J, 5:V, 6:S, 7:D ):");
        char dia = scanner.next().charAt(0);
        switch (dia) {
            case 'L': case '1':
                System.out.println("Lunes");
                break;
            case 'M': case '2':
                System.out.println("Martes");
                break;
            case 'X': case '3':
                System.out.println("Miércoles");
                break;
            case 'J': case '4':
                System.out.println("Jueves");
                break;
            case 'V': case '5':
                System.out.println("Viernes");
                break;
            case 'S': case '6':
                System.out.println("Sábado");
                break;
            case 'D': case '7':
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
        }
    }

    // Ejercicio 6.2
    public void ejercicio2() {
        int sumaFor = 0;
        for (int i = 1; i <= 10; i++) {
            sumaFor += i;
        }
        System.out.println("Suma usando for: " + sumaFor);

        int sumaWhile = 0;
        int i = 1;
        while (i <= 10) {
            sumaWhile += i;
            i++;
        }
        System.out.println("Suma usando while: " + sumaWhile);

        int sumaDoWhile = 0;
        int j = 1;
        do {
            sumaDoWhile += j;
            j++;
        } while (j <= 10);
        System.out.println("Suma usando do-while: " + sumaDoWhile);
    }

    // Ejercicio 6.3
    public void ejercicio3() {
        System.out.print("Ingrese true o false: ");
        String input = scanner.next();
        boolean valor = Boolean.parseBoolean(input);
        if (valor) {
            System.out.println("Es verdadero");
        } else {
            System.out.println("Es falso");
        }
    }

    // Ejercicio 6.4
    public void ejercicio4() {
        System.out.print("Ingrese un caracter para identificar si es un digito o no: ");
        char caracter = scanner.next().charAt(0);
        if (Character.isDigit(caracter)) {
            System.out.println("Es un dígito");
        } else {
            System.out.println("No es un dígito");
        }
    }
}
