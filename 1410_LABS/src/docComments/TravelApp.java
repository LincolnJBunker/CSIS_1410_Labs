package docComments;
/**
 * The class TravelApp is a test client that uses the classes Car and TripPlanner by creating instances
 * where trips are created given information about the Car and TripPlanner
 */
public class TravelApp {
	public static void main(String[] args) {
		Car m4 = new Car("BMW", "M4", 25);
		Car civic = new Car("Honda", "Civic", 42);
		
		System.out.println("Cars:");
		System.out.println(m4.getMake() + " " + m4.getModel() + " " + m4.getMpg() + " mpg");
		System.out.println(civic.getMake() + " " + civic.getModel() + " " + civic.getMpg() + " mpg");
		
		TripPlanner californiaTrip = new TripPlanner("SF", "LA", 382, m4);
		TripPlanner floridaTrip = new TripPlanner("Tampa", "Miami", 280, civic);
		
        System.out.println("\nCalifornia Trip:");
        System.out.println(californiaTrip);
        System.out.printf("fuel consumption: %.1f gallons%n", californiaTrip.fuelConsumption());

        System.out.println("\nFlorida Trip:");
        System.out.println(floridaTrip);
        System.out.printf("fuel consumption: %.1f gallons%n", floridaTrip.fuelConsumption());
				
	}
}
