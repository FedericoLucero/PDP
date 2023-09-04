package PrimerTesteo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int  numeroEntero = 1;
        double numeroDouble = 2.8;
        char letra = 'c';
        String frase = "hola mundo CRUEL";
        System.out.println(frase);

        int numeroChico = 1;
        int numeroGrande = 1000;

        if(numeroChico > numeroGrande){
            System.out.println("El numero chico es menor al numero grande");
        }else{
            System.out.println("No pasa nada");
        }

        int a = 0;
        int b = 10;

        while(a < b){
            System.out.println("correcto");
            a++;
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        gato();
        System.out.println(entero(10));
        System.out.println(suma(20,2));


        perro perrito = new perro();
        perrito.ladrar();
        System.out.println(perrito.edad());

        gato gatito = new gato();
        gatito.maullar();
        System.out.println(gatito.edad());









        ///////
        String nombre = JOptionPane.showInputDialog("nombre");
        if (nombre != null)
         JOptionPane.showMessageDialog(null,"tu nombres es: " + nombre );

    }

    public static void gato(){
        int variable = 0;
        System.out.println("miau " + variable);

    }

    public static int entero(int valor){
        int variable = valor;
        return variable;
    }

    public static int suma(int valor1, int valor2){
        return valor1+valor2;
    }

}