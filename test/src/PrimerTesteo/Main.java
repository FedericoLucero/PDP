package PrimerTesteo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int numeroEntero = 1;
        double numeroDouble = 2.8;
        char letra = 'c';
        String frase = "hola mundo CRUEL";
        System.out.println(frase);

        int numeroChico = 1;
        int numeroGrande = 1000;

        if (numeroChico > numeroGrande) {
            System.out.println("El numero chico es menor al numero grande");
        } else {
            System.out.println("No pasa nada");
        }

        int a = 0;
        int b = 10;

        while (a < b) {
            System.out.println("correcto");
            a++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        gato();
        System.out.println(entero(10));
        System.out.println(suma(20, 2));


        perro perrito = new perro();
        perrito.ladrar();
        System.out.println(perrito.edad());

        gato gatito = new gato();
        gatito.maullar();
        System.out.println(gatito.edad());





        // TODO =======================================

        //////////////////
        String[] arrayButtons = {"Cambiar Posición ", "Rotar Barco     ", "Guardar Barco   "};
        GraphicInterface window = new GraphicInterface("Menu de posicionamiento:", arrayButtons);
        String buttonPressed = window.showWindow("BattleShip",600,200,"images/SoldiersInc.jpg");
        System.out.println("Botón presionado: " + buttonPressed);
        /////////////////////////


        //////////////////
        String[] arrayButtons1 = {"Si ", "No "};
        GraphicInterface window1 = new GraphicInterface("Desea colocar el barco en el cuadrante <0"  + ", "  + "0>?", arrayButtons1);
        String buttonPressed1 = window1.showWindow("BattleShip",600,180,"images/soldier.jpg");
        System.out.println("Botón presionado: " + buttonPressed1);
        //////////////////

        //////////////////
        String[] arrayButtons2 = {"Horizontal derecha ➡ ", "Horizontal izquierda ", "Vertical arriba ⬆ ", "Vertical abajo ⬇ "};
        GraphicInterface window2 = new GraphicInterface("Rotación del barco:",arrayButtons2);
        String buttonPressed2 = window2.showWindow("BattleShip",700,250,"images/soldier.jpg");
        System.out.println("Botón presionado: " + buttonPressed2);
        //////////////////

        //////////////////
        String[] arrayButtons3 = {"Si ", "No "};
        GraphicInterface window3 = new GraphicInterface("Desea volver a jugar?",arrayButtons3);
        String buttonPressed3 = window3.showWindow("BattleShip",600,180,"images/soldier.jpg");
        System.out.println("Botón presionado: " + buttonPressed3);
        //////////////////

        // TODO =======================================



        //matris interactive
        GraphicInterfaceMatrixOp fondo4 = new GraphicInterfaceMatrixOp(10,10);
        String botonPresionado4 = fondo4.showWindow();
        System.out.println("Botón presionado: " + botonPresionado4);

        // play again yes no
        GraphicInterfacePlayAgainOp fondo3 = new GraphicInterfacePlayAgainOp();
        String botonPresionado3 = fondo3.showWindow();
        System.out.println("Botón presionado: " + botonPresionado3);

        // yes no
        GraphicInterfaceYesNoOp fondo2 = new GraphicInterfaceYesNoOp();
        String botonPresionado2 = fondo2.showWindow();
        System.out.println("Botón presionado: " + botonPresionado2);


        // 4 opciones de rotacion
        GraphicInterfaceRotateOp fondo1 = new GraphicInterfaceRotateOp();
        String botonPresionado1 = fondo1.showWindow();
        System.out.println("Botón presionado: " + botonPresionado1);




        /// tres opciones
        GraphicInterfaceThreeOp fondo = new GraphicInterfaceThreeOp();
        String botonPresionado = fondo.showWindow();
        System.out.println("Botón presionado: " + botonPresionado);


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