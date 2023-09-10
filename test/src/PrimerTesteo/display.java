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
    private JLabel imagenLabel;  // JLabel para mostrar la imagen

    public display() {
        setTitle("Control de Barco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 200);

        // Crear un JPanel con null layout
        panelMain = new JPanel(null);

        // Crear un JLabel para mostrar la imagen
        imagenLabel = new JLabel(new ImageIcon("src/PrimerTesteo/imagenes/soldier.jpg"));  // Reemplaza con la ruta de tu imagen
        imagenLabel.setBounds(0, 0, 400, 200);  // Establecer posición y tamaño del JLabel

        // Crear botones
        cambiarPosicionButton = new JButton("Cambiar Posición");
        rotarBarcoButton = new JButton("Rotar Barco");
        guardarBarcoButton = new JButton("Guardar Barco");

        // Establecer posición y tamaño de los botones
        cambiarPosicionButton.setBounds(50, 210, 120, 30);
        rotarBarcoButton.setBounds(180, 210, 100, 30);
        guardarBarcoButton.setBounds(290, 210, 110, 30);

        // Agregar acción a los botones
        cambiarPosicionButton.addActionListener(this);
        rotarBarcoButton.addActionListener(this);
        guardarBarcoButton.addActionListener(this);

        // Agregar la imagen y los botones al JPanel
        panelMain.add(imagenLabel);
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
