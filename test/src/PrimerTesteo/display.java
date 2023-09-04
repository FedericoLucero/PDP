package PrimerTesteo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class display extends JFrame implements ActionListener {
    private JPanel panelMain;
    private JButton cambiarPosicionButton;
    private JButton rotarBarcoButton;
    private JButton guardarBarcoButton;

    public display() {
        setTitle("Control de Barco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Crear un JPanel
        panelMain = new JPanel();
        panelMain.setLayout(new FlowLayout());

        // Crear botones
        cambiarPosicionButton = new JButton("Cambiar Posición");
        rotarBarcoButton = new JButton("Rotar Barco");
        guardarBarcoButton = new JButton("Guardar Barco");

        // Agregar acción a los botones
        cambiarPosicionButton.addActionListener(this);
        rotarBarcoButton.addActionListener(this);
        guardarBarcoButton.addActionListener(this);

        // Agregar botones al JPanel
        panelMain.add(cambiarPosicionButton);
        panelMain.add(rotarBarcoButton);
        panelMain.add(guardarBarcoButton);

        // Agregar el JPanel a la ventana
        getContentPane().add(panelMain);

        // Hacer visible la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cambiarPosicionButton) {
            // Lógica para cambiar la posición del barco
            JOptionPane.showMessageDialog(this, "Cambiando la posición del barco");
        } else if (e.getSource() == rotarBarcoButton) {
            // Lógica para rotar el barco
            JOptionPane.showMessageDialog(this, "Rotando el barco");
        } else if (e.getSource() == guardarBarcoButton) {
            // Lógica para guardar el estado del barco
            JOptionPane.showMessageDialog(this, "Guardando el estado del barco");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new display();
        });
    }
}
