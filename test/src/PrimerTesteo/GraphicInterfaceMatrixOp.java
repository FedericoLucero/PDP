package PrimerTesteo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;

public class GraphicInterfaceMatrixOp extends JFrame {
    private JButton[][] botones;
    private int filas;
    private int columnas;
    private int filaClicada = -1;
    private int columnaClicada = -1;

    public GraphicInterfaceMatrixOp(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        botones = new JButton[filas][columnas];

        // Configuración de la ventana principal
        setTitle("Matriz Interfaz");
        setSize(650, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cargar la imagen de fondo
        try {
            BufferedImage backgroundImage = ImageIO.read(new File("ruta_de_tu_imagen.jpg"));
            setContentPane(new ImagePanel(backgroundImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setLayout(new GridLayout(filas, columnas));

        // Crear y configurar los botones
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                botones[i][j] = new JButton("(" + i + ", " + j + ")");
                botones[i][j].setOpaque(false); // Configura el botón como transparente
                botones[i][j].addActionListener(new BotonListener(i, j));
                add(botones[i][j]);
            }
        }
    }


    private class BotonListener implements ActionListener {
        private int fila;
        private int columna;

        public BotonListener(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            filaClicada = fila;
            columnaClicada = columna;
            dispose(); // Cierra la ventana
        }
    }
    private class ImagePanel extends JPanel {
        private BufferedImage image;

        public ImagePanel(BufferedImage image) {
            this.image = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
    public int getFilaClicada() {
        return filaClicada;
    }

    public int getColumnaClicada() {
        return columnaClicada;
    }

    public String showWindow() {
        int filas = 10;
        int columnas = 10;

        GraphicInterfaceMatrixOp matrizInterfaz = new GraphicInterfaceMatrixOp(filas, columnas);
        matrizInterfaz.setVisible(true);

        final CountDownLatch latch = new CountDownLatch(1); // Initialize the CountDownLatch
        matrizInterfaz.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                latch.countDown(); // When the window is closed, decrement the counter
            }
        });

        try {
            latch.await(); // Wait until the window is closed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int filaClicada = matrizInterfaz.getFilaClicada();
        int columnaClicada = matrizInterfaz.getColumnaClicada();

        System.out.println("Fila clicada: " + filaClicada);
        System.out.println("Columna clicada: " + columnaClicada);

        return (filaClicada + " " + columnaClicada);
    }
}
