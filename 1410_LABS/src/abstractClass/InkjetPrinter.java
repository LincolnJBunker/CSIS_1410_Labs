package abstractClass;

/**
 * class InkjetPrinter is a subclass of class Printer
 * 
 * Contains the field remaining cartridge, calls the constructor of the superclass and sets the amount of cartridge to 100
 * getter method for cartridge, and refill method to reset cartridge 
 */
public class InkjetPrinter extends Printer {
	
	/**
	 * field of remainingCartridge which is of type int.
	 */
	public int remainingCartridge;
	
	/**
	 * Calls the constructor of the superclass Printer, and sets the remainingCartridge to 100
	 * 
	 * @param model The model of the printer
	 */
	public InkjetPrinter(String model) {
		super(model);
		this.remainingCartridge = 100;
	}
	
	/**
	 * Getter method for remainingCartridge
	 * 
	 * @return remainingCartrdige
	 */
	public int getRemainingCartridge() {
		return remainingCartridge;
	}
	
	/**
	 * Method to refill any given amount of cartridge to 100.
	 * 
	 * @return remainingCartridge with the value of 100
	 */
	public int refillCartridge() {
		return remainingCartridge = 100;
	}
	
	@Override
	public void print() {
		if (remainingCartridge <= 0) {
			System.out.println("The toner is empty");
		} else {
			remainingCartridge -= 10;
			System.out.println("Canon Pixma is Printing. Remaining Cartridge: " + remainingCartridge + "%");
		}
	}
}
