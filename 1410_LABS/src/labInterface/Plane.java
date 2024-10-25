package labInterface;

/**
 * Class Plane with its fields, constructor, and toString method
 */
public class Plane implements Flyable
{
	private final int numberOfEngines;
	private final String model;
	
	/**
	 * Constructor of class planes 
	 * 
	 * instantiates the fields numberofEngines and models
	 * 
	 * @param engines the number of engines
	 * @param m the model of planes
	 */
	public Plane(int engines, String m)
	{
		numberOfEngines = engines;
		model = m;
	}

	@Override
	public String toString()
	{
		return String.format("%s with %d engines", model, numberOfEngines);
	}

	@Override
	public void launch() {
		System.out.println("Rolling until take-off");
		
	}

	@Override
	public void land() {
		System.out.println("Rolling to a stop");
		
	}
} 