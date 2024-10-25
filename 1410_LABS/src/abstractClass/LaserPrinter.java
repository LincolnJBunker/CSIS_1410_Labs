package abstractClass;

/**
 * class LaserPrinter is a subclass of class Printer
 * 
 * Contains the field remaining toner, calls the constructor of the superclass and sets the amount of toner to 100
 * getter method for toner, and refill method to reset toner 
 */
public class LaserPrinter extends Printer {
	
	/**
	 * field of remainingToner which is of type int.
	 */
	public int remainingToner;
	
	/**
	 * Calls the constructor of the superclass Printer, and sets the remainingToner to 100
	 * 
	 * @param model The model of the printer
	 */
	public LaserPrinter(String model) {
		super(model);
		this.remainingToner = 100;
	}
	
	/**
	 * Getter method for remainingToner.
	 * 
	 * @return remainingToner
	 */
	public int getRemainingToner() {
		return remainingToner;
	}
	
	/**
	 * Method to refill any given amount of toner to 100.
	 * 
	 * @return remainingToner with the value of 100
	 */
	public int refillToner() {
		return remainingToner = 100;
	}
	
	@Override
	public void print() {
		if (remainingToner <= 0) {
			System.out.println("The toner is empty");
		} else {
			remainingToner -= 10;
			System.out.println("HP LaserJet Pro is printing. Remaining Toner: " + remainingToner +"%");
		}
	}
}
