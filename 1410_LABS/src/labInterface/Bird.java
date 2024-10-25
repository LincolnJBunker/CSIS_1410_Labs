package labInterface;

/**
 * class Bird with its field (type), constructor, and toString method
 */
public class Bird implements Flyable
{
	private final String type;
	
	/**
	 * Constructor for class Bird
	 * 
	 * Initates the field type
	 * @param t the type of the bird
	 */
	public Bird(String t)
	{
		type = t;
	}

	@Override
	public String toString()
	{
		return type;
	}

	@Override
	public void launch() {
		System.out.println("Flapping the wings to take off");
		
	}

	@Override
	public void land() {
		System.out.println("Flapping the wings until landing");
		
	}
}