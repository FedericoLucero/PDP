package battleship;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de juego:
 * Define el punto de entrada al juego creando el marco,
 * y llenándolo con un GamePanel.
 */

public class Game implements KeyListener {
    private Player player1;
    private Player player2;
    private GamePanel gamePanel1;
    private GamePanel gamePanel2;

    /**
     * Crea el JFrame de p1 y p2 con un GamePanel dentro, adjunta un key listener,
     * y hace que _todo sea visible.
     */
    public Game() {
        player1 = null;
        player2 = null;

        init();
        // todo: battleship.Game loop
        System.out.println("Rounds starting!");

    }
    private void init(){
        // Initializes game constants
        // todo add user input

        player1 = new Player();
        player2 = new Player();
        player1.setName("Player1");
        player2.setName("Player2");

        // todo Ask for ship count
        int shipCount = 3;

        JFrame frame1 = new JFrame("Battleship1");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame frame2 = new JFrame("Battleship2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gamePanel1 = new GamePanel();
        frame1.getContentPane().add(gamePanel1);
        gamePanel2 = new GamePanel();
        frame2.getContentPane().add(gamePanel2);

        frame1.addKeyListener(this);
        frame1.pack();
        frame1.setVisible(true);
        frame2.addKeyListener(this);
        frame2.pack();
        frame2.setVisible(true);

        // todo ask for ship lengths
        List<Integer> shipLengths = new ArrayList<Integer>();
        shipLengths.add(1);     // 1 ship of length 1
        shipLengths.add(2);     // 1 ship of length 2
        shipLengths.add(3);     // 1 ship of length 3

        // Loads maps
        loadPlayerMap(player1, shipLengths);
        loadPlayerMap(player2, shipLengths);
    }

    private void loadPlayerMap(Player player, List<Integer> shipLengths){
        System.out.println("Loading map of player: " + player.getName());
        // Displays the map and lets the user place each Ship
        Map map = player.getMap();
        for (int shipLength : shipLengths) {
            // Creates new ship and places on the map
            placeShip(map, shipLength);
        }
    }
    private void placeShip(Map map, int shipLength)
    {
        System.out.println("Placing ship of length: " + Integer.toString(shipLength));
        Ship ship = new Ship(shipLength);

        // Starts as HorizontalLeftToRight ->
        ship.setOrientationDx(1);
        ship.setOrientationDy(0);
        int shipColumn = 0, shipRow = 0;

        boolean placingShip = false;
        while (placingShip){

            int quadrantColumn = shipColumn;
            int quadrantRow = shipRow;
            boolean validPosition = true;

            // Checks if current position is valid. Iterates through all the ship quadrants
            for (int quadrantIndex = 0; quadrantIndex < shipLength; quadrantIndex++) {

                // Quadrant out of bounds
                if (!map.inBounds(quadrantColumn, quadrantRow))
                {
                    validPosition = false;
                    break;
                }

                // Gets Quadrant and tests if it is surrounding or containing Ship
                Quadrant quadrant = map.getQuadrant(quadrantColumn, quadrantRow);
                if (quadrant.containsShip()){
                    // todo tell user that Ships are overlapping
                    validPosition = false;
                    break;
                }
                if (quadrant.surroundsShip())
                {
                    // todo: Tell user that ships should be surrounded by water
                    validPosition = false;
                    break;
                }

                // Valid quadrant, moves to next Quadrant
                quadrantColumn += ship.getOrientationDx();
                quadrantRow += ship.getOrientationDy();
            }

            // todo: Let user rotate ship
            // todo: Let user move ship origin modifies (shipColumn, shipRow)

            if (validPosition)
            {
                // todo: Ask user to place Ship
                boolean wantToPlace = false;

                if (wantToPlace){
                    map.addShip(ship, shipColumn, shipRow);
                    placingShip = false;
                }
            }
        }

        // Lets user move and select specific ship position
    }

    /**
     * Se llama cuando se presiona la tecla. Pasa la pulsación de la tecla al GamePanel.
     *
     * @param e Información sobre qué tecla se presionó.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        gamePanel1.handleInput(e.getKeyCode());
        gamePanel2.handleInput(e.getKeyCode());
    }
    /**
     * No utilizado.
     *
     * @param e No utilizado.
     */
    @Override
    public void keyTyped(KeyEvent e) {}
    /**
     * No utilizado.
     *
     * @param e No utilizado.
     */
    @Override
    public void keyReleased(KeyEvent e) {}
}
