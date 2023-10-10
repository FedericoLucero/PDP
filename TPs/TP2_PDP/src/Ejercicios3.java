import java.util.Arrays;

public class Ejercicios3 {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2(3);
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    // Ejercicio 3.1
    public static void ejercicio1() {
        int[] vector = new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = i + 1;
        }
        System.out.println(Arrays.toString(vector));
    }

    // Ejercicio 3.2
    public static void ejercicio2(int numero) {
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    // Ejercicio 3.3
    public static void ejercicio3() {
        int[] vector = new int[20];

        int index = 0;
        int numero = 1;
        while (index < vector.length) {
            vector[index] = numero;
            index++;
            numero++;
        }

        int suma = 0;
        index = 0;
        while (index < vector.length) {
            suma += vector[index];
            index++;
        }
        System.out.println(Arrays.toString(vector));
        System.out.println("Vector completado y suma de valores: " + suma);
    }

    // Ejercicio 3.4
    public static void ejercicio4() {
        int[][] matriz = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = (2 * i) + (j + 3);
            }
        }
        System.out.println(Arrays.deepToString(matriz));
    }

    // Ejercicio 3.5
    public static void ejercicio5() {
        int[][] matriz = new int[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = i * 20 + j;
            }
        }
        System.out.println(Arrays.deepToString(matriz));
    }
}