package guiLayout;

//imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

/**
 * class LabGuiLayout which is a JFrame
 * Creates a GUI which displays a title 'Demo Layout' with two buttons on the side -- a left and a right button.
 * 4 tiles numbered 1 - 4 are displayed. One is colored blue, the other three are yellow. 
 * When a button is clicked, the blue tile is switched to the direction the arrow was clicked.
 */
public class LabGuiLayout extends JFrame {
	
	//pre-made fields
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//main panel fields
	private JPanel mainPanel;
	private JLabel[] tiles = new JLabel[4];
	private int blueTileIndex = 1;
	
	//layout field
	private JLabel layoutLabel;
	
	//button fields
	private JButton leftButton;
	private JButton rightButton;
	

	/**
	 * Main method for this application
	 * Launces the GUI by callling the constructor LabGuiLayout
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiLayout frame = new LabGuiLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor for this class
	 * Creates the frame of the GUI
	 * Calls 4 methods, createLayoutLabel, createControlPanel, createMainPanel, and addEventHandlers
	 */
	public LabGuiLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 275);
		contentPane = new JPanel(new BorderLayout(10, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		createLayoutLabel();
		createControlPanel();
		createMainPanel();
		addEventHandlers();
	}
	
	/**
	 * Method that creates the title of the GUI 'Demo Layout'
	 * Utilizes BorderLayout for styling
	 */
	private void createLayoutLabel() {
		layoutLabel = new JLabel("Demo Layout", SwingConstants.CENTER);
        layoutLabel.setFont(new Font("Monospaced", Font.PLAIN, 30));
        contentPane.add(layoutLabel, BorderLayout.NORTH);
	}
	
	/**
	 * Method that creates a new JPanel utilizing GridLayout
	 * Creates two buttons -- leftButton and rightButton -- which are added to the controlPanel
	 * controlPanel is added to the contentPane, on the 'west' side of the GUI
	 */
	private void createControlPanel() {
		JPanel controlPanel = new JPanel(new GridLayout(2, 1, 5, 5));
		leftButton = new JButton("<==");
		rightButton = new JButton("==>");
		
		controlPanel.add(leftButton);
		controlPanel.add(rightButton);
		
		contentPane.add(controlPanel, BorderLayout.WEST);
	}
	
	/**
	 * Method that creates the mainPanel, again utilizing GridLayout
	 * Creates a for loop which uses the tiles array to display 4 numbered tiles
	 * if the blueTileIndex matches the index of i, it is blue. otherwise it is yellow
	 */
	private void createMainPanel() {
		mainPanel = new JPanel(new GridLayout(1, 4, 5, 5));
		
		for (int i = 0; i < 4; i++) {
	        tiles[i] = new JLabel(String.valueOf(i + 1), SwingConstants.CENTER);
	        tiles[i].setFont(new Font("Monospaced", Font.BOLD, 40));
	        tiles[i].setOpaque(true);
	        tiles[i].setBackground(i == blueTileIndex ? Color.BLUE : Color.YELLOW);
	        mainPanel.add(tiles[i]);
		}
		
		contentPane.add(mainPanel, BorderLayout.CENTER);
	}
	
	/**
	 * Method for adding the event handlers to the left and right buttons
	 */
	private void addEventHandlers() {
		leftButton.addActionListener(e -> handleLeftButtonClicked());
		rightButton.addActionListener(e -> handleRightButtonClicked());
	}
	
	/**
	 * Event handler for when the left button is clicked
	 * Resets the current title, moves left and wraps around if needed, and sets the new tile as blue
	 */
	private void handleLeftButtonClicked () {
        tiles[blueTileIndex].setBackground(Color.YELLOW);
        blueTileIndex = (blueTileIndex - 1 + 4) % 4;
        tiles[blueTileIndex].setBackground(Color.BLUE);
	}
	
	/**
	 * Event handler for when the right button is clicked
	 * Resets the current title, moves right and wraps around if needed, and sets the new tile as blue
	 */
	private void handleRightButtonClicked () {
        tiles[blueTileIndex].setBackground(Color.YELLOW);
        blueTileIndex = (blueTileIndex + 1) % 4;
        tiles[blueTileIndex].setBackground(Color.BLUE);
	}

}
