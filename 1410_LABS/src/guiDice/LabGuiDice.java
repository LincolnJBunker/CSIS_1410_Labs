package guiDice;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 * class LabGuiDice which extends JFrame
 * Creates a GUI interface that displays a button, when clicked will change the image of the dice
 */
public class LabGuiDice extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton rollEm;
    private JLabel diceLabel;
    private String[] diceImages = {
        "/Users/lincoln/Downloads/dice-1/die-1.png",
        "/Users/lincoln/Downloads/dice-1/die-2.png",
        "/Users/lincoln/Downloads/dice-1/die-3.png",
        "/Users/lincoln/Downloads/dice-1/die-4.png",
        "/Users/lincoln/Downloads/dice-1/die-5.png",
        "/Users/lincoln/Downloads/dice-1/die-6.png"
    };

    /**
     * Main Method of this application
     * Launch the application by calling the constructor
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LabGuiDice frame = new LabGuiDice();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Constructor for LabGuiDice
     * Create the frame and set the initial properties
     */
    public LabGuiDice() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);
        
        // Initialize and add button
        rollEm = newRollEm();
        contentPane.add(rollEm, BorderLayout.SOUTH);
        
        // Initialize and add label for the dice
        diceLabel = new JLabel();
        diceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        diceLabel.setIcon(new ImageIcon(diceImages[0]));  // Start with dice-1
        contentPane.add(diceLabel, BorderLayout.CENTER);
    }
    
    /**
     * Create the button labeled 'Roll Em'
     * Adds an event listener that calls method rollDice() on click
     * Styling for button
     * @return button the Button Roll Em
     */
    private JButton newRollEm() {
        JButton button = new JButton("Roll 'Em");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rollDice();
            }
        });
        button.setFont(new Font("Times New Roman", Font.BOLD, 50));
        button.setForeground(Color.PINK);
        button.setBackground(Color.BLACK);
        button.setBorder(new LineBorder(Color.BLACK, 2));
        button.setOpaque(true);
        button.setBorder(new EmptyBorder(10, 20, 10, 20));
        return button;
    }
    
    private int lastRoll = -1;  // Store the last rolled index
    
    /**
     * Method for the event handler on the Roll Em Button
     * Randomly selects a new dice image and ensures the image is not the same as the previous
     * Update the label to display the image.
     * 
     */
    private void rollDice() {
        Random random = new Random();
        int newRoll;

        // Ensure the new roll is different from the last roll
        do {
            newRoll = random.nextInt(diceImages.length);
        } while (newRoll == lastRoll);

        // Update the dice label with the new image
        diceLabel.setIcon(new ImageIcon(diceImages[newRoll]));
        lastRoll = newRoll;
    }
}
