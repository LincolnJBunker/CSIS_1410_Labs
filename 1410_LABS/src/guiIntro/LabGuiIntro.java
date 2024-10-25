package guiIntro;

import javax.swing.*;
import java.awt.*;

/**
 * class LabGuiIntro which utilizes JFrame
 * 
 * creates a simple GUI that displays the title 'My First Gui'
 * contains a button labeled 'west' and text in the middle saying 'Hi'
 * Contains an input field labled 'Name'
 */
public class LabGuiIntro extends JFrame {
	
	/**
	 * new JLabel field named lblTitle
	 */
    private JLabel lblTitle;
    
	/**
	 * new JButton field named btnWest
	 */
    private JButton btnWest;
    
	/**
	 * new JPanel field named textPanel
	 */
    private JPanel textPanel;
    
	/**
	 * new JLabel field named redLabel
	 */
    private JLabel redLabel;

    /**
     * Constructor for LabGuiIntro
     * defines the basic JFrame methods
     */
    public LabGuiIntro() {
        // Set up the JFrame properties
        setTitle("Lab GUI Intro");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add the title label (refactored into a method)
        lblTitle = newLblTitle();
        add(lblTitle, BorderLayout.NORTH);

        // Add the button to the west (refactored into a method)
        btnWest = newBtnWest();
        add(btnWest, BorderLayout.WEST);

        // Add the text panel at the bottom (refactored into a method)
        textPanel = newTextPanel();
        add(textPanel, BorderLayout.SOUTH);

        // Add the red label in the center (refactored into a method)
        redLabel = newRedLabel();
        add(redLabel, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
    }

    /**
     * Method to create the title Label
     * @return the title label 'My First Gui'
     */
    private JLabel newLblTitle() {
        JLabel label = new JLabel("My First Gui", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Arial", Font.BOLD, 33));

        // Add padding (margins) around the label for spacing
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        return label;
    }

    /**
     * Method to create a button on the west side
     * @return a button on the west side labeled 'WEST'
     */
    private JButton newBtnWest() {
        JButton button = new JButton("WEST");
        return button;
    }

    /**
     * Method to create the text panel with a label and text field
     * @return the text panel and text field labeled 'Name:'
     */
    private JPanel newTextPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Create label and set font
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        // Create text field and set font
        JTextField textField = new JTextField(16);
        textField.setFont(new Font("Arial", Font.PLAIN, 16));

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(textField);

        // Add padding/margins around the panel for spacing
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        return panel;
    }

    /**
     * Method to create the red label in the center
     * @return 'Hi' in the center of the red label
     */
    private JLabel newRedLabel() {
        JLabel label = new JLabel("Hi", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.RED);
        label.setForeground(Color.ORANGE);
        label.setFont(new Font("Arial", Font.BOLD, 77));

        return label;
    }

    /**
     * Main method for this application
     * calls the new LabGuiIntro constructor to create the GUI
     * @param args (unused params)
     */
    public static void main(String[] args) {
        new LabGuiIntro();
    }
}
