package docComments;
/**
 * Represents a Car being used for a trip with its make, model, and mpg
 */
public class Car {
	private String make;
	private String model;
	private int mpg;
	/**
	 * 
	 * @param make the make of the car
	 * @param model the model of the car
	 * @param mpg the mpg the car gets
	 */
	public Car (String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}
	/**
	 * 
	 * @return make of car
	 */
	public String getMake() {
		return make;
	}
	/**
	 * 
	 * @return model of car
	 */
	public String getModel() {
		return model;
	}
	/**
	 * 
	 * @return mpg the car gets
	 */
	public int getMpg() {
		return mpg;
	}
	
}
