package Ejercicios;

public class Ejercicios7 {
    public static void main(String[] args) {
        Ejercicios7 ejercicios = new Ejercicios7();
        ejercicios.ejercicio1();
    }

    class Ordenador {
        private double precio;
        public void precio(double valor) {
            precio = valor;
        }
    }

    // Ejercicio 7
    public void ejercicio1() {
        Ordenador escritorio; Ordenador portatil; //line1

        escritorio = new Ordenador(); //line2
        escritorio.precio(900); //line3

        portatil = new Ordenador(); //line4
        portatil.precio(1100); //line5

        System.out.println("Precio del escritorio: " + escritorio.precio + " Precio del portátil: " + portatil.precio);

        portatil = escritorio; //line6
        escritorio = null; //line7
        System.out.println("La objeto escritorio es: " + escritorio + " La objeto portatil es: " + portatil);
        System.out.println("Precio del portátil: " + portatil.precio);
    }
}