package PrimerTesteo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dis extends JFrame implements ActionListener {
    private JPanel panelMain;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel backgroundImageLabel;

    public Dis() {
        setTitle("Superponer Botones sobre Imagen de Fondo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Crear un JPanel
        panelMain = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja la imagen de fondo
                g.drawImage(new ImageIcon("imagenes/soldier.jpg").getImage(), 0, 0, this);
            }
        };
        panelMain.setLayout(new BorderLayout());

        // Crear botones
        button1 = new JButton("Botón 1");
        button2 = new JButton("Botón 2");
        button3 = new JButton("Botón 3");

        // Agregar acción a los botones
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Agregar botones al JPanel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Agregar el JPanel con botones al centro del panelMain
        panelMain.add(buttonPanel, BorderLayout.CENTER);

        // Hacer visible la ventana
        getContentPane().add(panelMain);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(this, "Botón 1 presionado");
        } else if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(this, "Botón 2 presionado");
        } else if (e.getSource() == button3) {
            JOptionPane.showMessageDialog(this, "Botón 3 presionado");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Dis();
        });
    }
}
