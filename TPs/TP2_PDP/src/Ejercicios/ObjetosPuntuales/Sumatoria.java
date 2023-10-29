package Ejercicios.ObjetosPuntuales;

public class Sumatoria {

    private int[] vector;

    // Constructor por defecto
    public Sumatoria(){
        vector = new int[2];
        // Asignar valores aleatorios entre 1 y 10
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10) + 1;
        }
    }

    // Constructor para ingresar valores
    public Sumatoria(int valor1,int valor2){
        vector = new int[2];
        vector[0] = valor1;
        vector[1] = valor2;
    }

    // Método para mostrar la tabla de multiplicar
    public void mostrarTablaDeMultiplicar() {
        for (int i = 1; i <= 10; i++){
            System.out.println(vector[0] + " X " + i + " = " + vector[0]*i);
            System.out.println(vector[1] + " X " + i + " = " + vector[1]*i);
        }
    }

    // Método para calcular la suma
    public void calcularSuma(){
        System.out.println(vector[0] + " + " + vector[1] + " = " + vector[0]+vector[1]);
    }
}
