package PrimerTesteo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panelBase;
    private JPanel panelCuestionForButton;
    private JPanel PanelButtonOptions;
    private JPanel panelEnemyMatrix;
    private JPanel myPanelMatrix;
    private JPanel shootsPanel;
    private JLabel textForButtomOptions;
    private JButton shoot1;
    private JButton shoot2;
    private JButton shoot3;
    private JButton shoot4;
    private JPanel panelVerticalNum1;
    private JPanel panelHorizontalNum;
    private JPanel panelVerticalNum2;
    private JPanel panelCountShoots;
    private JPanel panelConsole;

    private int clickedRow = -1;
    private int clickedCol = -1;

    private boolean buttonsEnabled = false; // Variable para controlar si los botones son oprimibles

    private JButton[][] myButtons;
    private JButton[][] enemyButtons;

    public GUI() {
        // Crear matrices de botones para myPanelMatrix y panelEnemyMatrix
        int rows = 10;
        int cols = 10;

        myPanelMatrix.setLayout(new GridLayout(rows, cols));
        panelEnemyMatrix.setLayout(new GridLayout(rows, cols));

        myButtons = new JButton[rows][cols];
        enemyButtons = new JButton[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JButton myButton = new JButton();
                JButton enemyButton = new JButton();

                // Agregar ActionListener a los botones
                myButton.addActionListener(new ButtonClickListener(i, j));
                enemyButton.addActionListener(new ButtonClickListener(i, j));

                // Agregar botones a las matrices respectivas
                myButtons[i][j] = myButton;
                enemyButtons[i][j] = enemyButton;

                myPanelMatrix.add(myButton);
                panelEnemyMatrix.add(enemyButton);
            }
        }
    }

    public int getClickedRow() {
        return clickedRow;
    }

    public void setClickedRow(int clickedRow) {
        this.clickedRow = clickedRow;
    }

    public int getClickedCol() {
        return clickedCol;
    }

    public void setClickedCol(int clickedCol) {
        this.clickedCol = clickedCol;
    }

    // ActionListener personalizado para rastrear la posición del botón presionado
    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (buttonsEnabled) {
                clickedRow = row;
                clickedCol = col;
                System.out.println("Botón presionado en la fila: " + row + " columna: " + col);
            }
        }
    }

    // Método para cambiar el color de un botón en la matriz
    public void changeMyButtonColor(int row, int col, Color color) {
        if (row >= 0 && row < myButtons.length && col >= 0 && col < myButtons[0].length) {
            myButtons[row][col].setBackground(color);
        }
    }

    public void changeEnemyButtonColor(int row, int col, Color color) {
        if (row >= 0 && row < enemyButtons.length && col >= 0 && col < enemyButtons[0].length) {
            enemyButtons[row][col].setBackground(color);
        }
    }

    // Método para habilitar o deshabilitar la pulsación de botones
    public void setButtonsEnabled(boolean enabled) {
        buttonsEnabled = enabled;
    }

    // Método para obtener la fila y columna oprimidas como un objeto Point
    public Point getClickedPoint() {
        return new Point(clickedRow, clickedCol);
    }









    public static void main(String[] args) {

        JFrame frame = new JFrame("GUI");
        GUI gui = new GUI();
        frame.setContentPane(gui.panelBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        // todo: habilita las matrices

        gui.setClickedCol(-1);
        gui.setClickedRow(-1);

        // Habilitar la pulsación de botones cuando lo desees
        gui.setButtonsEnabled(true);

        // Esperar hasta que se haya oprimido un botón (clic en la interfaz gráfica)
        while (gui.getClickedRow() == -1 || gui.getClickedCol() == -1) {
            try {
                Thread.sleep(100); // Esperar un poco antes de verificar nuevamente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Obtener la fila y columna oprimidas en forma de un objeto Point
        Point clickedPoint = gui.getClickedPoint();
        int row = (int) clickedPoint.getX();
        int col = (int) clickedPoint.getY();
        System.out.println("Botón oprimido en la fila: " + row + " columna: " + col);

        // Luego puedes deshabilitarla nuevamente cuando lo necesites
        gui.setButtonsEnabled(false);

        // todo: ==================



        // todo: pinta de colores

        // Ejemplo de cómo cambiar el color de un botón en la matriz
        gui.changeMyButtonColor(0, 0, Color.ORANGE);
        gui.changeMyButtonColor(4, 4, Color.GREEN);
        gui.changeMyButtonColor(3, 4, Color.GREEN);

        // Ejemplo de cómo cambiar el color de un botón en la matriz de enemigos
        gui.changeEnemyButtonColor(0, 0, Color.RED);

        // todo ==================




        // todo: agrega panel de pregunta y agrega botones

        gui.textForButtomOptions.setText("Menu de posicionamiento:");
        String[] arrayButtons = {"Cambiar Posición ", "Rotar Barco     ", "Guardar Barco   "};


        // todo ==================

    }
}
