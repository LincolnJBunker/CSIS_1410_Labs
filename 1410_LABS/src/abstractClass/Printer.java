package abstractClass;

/**
 * Class Printer with its corresponding fields, constructor, and methods. Is abstract
 * 
 * Contains 3 fields, model of type string, and count and serialNumber of type 
 * Constructor to  the model, and add a serialNumber to a given printer 
 */
public abstract class Printer {
	/**
	 * Field for model which is of type String
	 */
	private final String model;
	
	/**
	 * Field for count which is of type int
	 */
	private static int count = 0;
	
	/**
	 * Field for serialNumber which is of type int
	 */
	private final int serialNumber;
	
	/**
	 * Constructs a Printer with a specified model name.
	 * Updates the printer count and gives a serial number based on it
	 * 
	 * @param model The model of a printer
	 */
	public Printer(String model) {
		this.model = model;
		Printer.count++;
		this.serialNumber = 12345 + count;
	}
	
	/**
	 * Getter method for model
	 * @return The model of the printer
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Getter method for serialNumber
	 * @return The calculated serial number for a printer
	 */
	public int getSerialNumber() {
		return serialNumber;
	}
	
	/**
	 * Prints a document.
	 */
	public abstract void print();
	
	/**
	 * To string method
	 * returns the class name, model, and serial number of a given printer
	 */
	public String toString() {
		return this.getClass().getSimpleName() + ": " + model + " #" + serialNumber;
	}
	
}
