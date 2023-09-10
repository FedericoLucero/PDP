package PrimerTesteo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.CountDownLatch;

public class GraphicInterfacePlayAgainOp extends JPanel {
    private String buttonPressed; // Initialized with an empty string
    private JFrame window; // Move the window as an instance variable

    public GraphicInterfacePlayAgainOp() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        addTitle();
        addButtons();
    }

    private void addTitle() {
        // Create a JPanel for the white background with a vertical BoxLayout
        JPanel panelBackground = new JPanel();
        panelBackground.setBackground(Color.WHITE);
        panelBackground.setLayout(new BoxLayout(panelBackground, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(" desea volver a jugar? ");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelBackground.add(Box.createVerticalGlue()); // Vertical space above the text
        panelBackground.add(title); // Add the JLabel to the panel
        panelBackground.add(Box.createVerticalGlue()); // Vertical space below the text

        add(Box.createVerticalStrut(10));
        add(panelBackground);
        add(Box.createVerticalStrut(25));
    }

    private void addButtons() {
        addButton("Yes ", "Button 1");
        addButton("No  ", "Button 2");
        add(Box.createVerticalStrut(20)); // Vertical space between buttons
    }

    private void addButton(String text, final String buttonName) {
        JButton button = new JButton(text);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setButtonPressed(buttonName);
                window.dispose(); // Close the window
            }
        });
        add(button);
        add(Box.createVerticalStrut(5)); // Vertical space between buttons
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon image = new ImageIcon(getClass().getResource("images/soldier.jpg"));
        g.drawImage(image.getImage(), 0, 0, getWidth(), getHeight(), this);
    }

    // Getter to get the pressed button
    public String getButtonPressed() {
        return buttonPressed;
    }

    public void setButtonPressed(String buttonPressed) {
        this.buttonPressed = buttonPressed;
    }

    // Public method to show the window and get the pressed button
    public String showWindow() {
        window = new JFrame("Boat Control");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(this);
        window.setSize(600, 160);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        final CountDownLatch latch = new CountDownLatch(1); // Initialize the CountDownLatch

        window.addWindowListener(new WindowAdapter() {
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

        return getButtonPressed();
    }
}
