package docComments;
/**
 * Represents a trip with a location of departure and arrival, the distance of the trip in miles, and the car used for the trip
 */
public class TripPlanner {
	private String departure;
	private String arrival;
	private int distance;
	private Car car;
	/**
	 * 
	 * @param departure the city where the trip starts
	 * @param arrival the city where the trip ends
	 * @param distance total distance of trip in miles
	 * @param car which car was used for the trip
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}
	/**
	 * Returns a string representation of the TripPlanner
	 * 
	 * @return the departure, arrival, distance, and car for a given trip
	 */
	public String toString() {
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car=" + car.getModel() + ']';
	}
	/**
	 * Calculates the amount of fuel consumed in a trip
	 * 
	 * @return the amount of fuel consumed in gallons
	 */
	public double fuelConsumption() {
		return (double) distance / car.getMpg();
	}
	
}
