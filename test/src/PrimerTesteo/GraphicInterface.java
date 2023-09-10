package PrimerTesteo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.CountDownLatch;

public class GraphicInterface extends JPanel {
    private String imageURL;
    private String buttonPressed;
    private JFrame window;

    public GraphicInterface(String titleOfLabel, String[] arrayButtons) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        addTitle(titleOfLabel);
        addButtons(arrayButtons);
    }

    private void addTitle(String titleOfLabel) {
        JPanel panelBackground = new JPanel();
        panelBackground.setBackground(Color.WHITE);
        panelBackground.setLayout(new BoxLayout(panelBackground, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(titleOfLabel);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelBackground.add(Box.createVerticalGlue());
        panelBackground.add(title);
        panelBackground.add(Box.createVerticalGlue());

        add(Box.createVerticalStrut(10));
        add(panelBackground);
        add(Box.createVerticalStrut(25));
    }

    private void addButtons(String[] arrayButtons) {

        for (int i = 0; i < arrayButtons.length; i++) {
            addButton(String.valueOf(arrayButtons[i]),"Button " + (i + 1));
            add(Box.createVerticalStrut(5));
        }
        add(Box.createVerticalStrut(15));
    }

    private void addButton(String text, final String buttonName) {
        JButton button = new JButton(text);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setButtonPressed(buttonName);
                window.dispose();
            }
        });
        add(button);
        add(Box.createVerticalStrut(5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon image = new ImageIcon(getClass().getResource(getImageURL()));
        g.drawImage(image.getImage(), 0, 0, getWidth(), getHeight(), this);
    }

    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public String getButtonPressed() {
        return buttonPressed;
    }
    public void setButtonPressed(String buttonPressed) {
        this.buttonPressed = buttonPressed;
    }
    public String showWindow(String title, int width, int height,String ImageURL) {
        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(this);
        window.setSize(width, height);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        setImageURL(ImageURL);

        final CountDownLatch latch = new CountDownLatch(1);

        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                latch.countDown();
            }
        });

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return getButtonPressed();
    }
}
