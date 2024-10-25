package labInterface;

/**
 * Class Hangglider with its field (isRigidWing), constructor that intiates that field, and toString method
 */
public class Hangglider implements Flyable
{
	private final boolean isRigidWing;
	
	
	/**
	 * Constructor for class Hanggliders
	 * 
	 * intiates the field rigidWing
	 * @param rigidWing the boolean value of isRigidWing
	 */
	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}

	@Override
	public void launch() {
		System.out.println("Running until take-off");
		
	}

	@Override
	public void land() {
		System.out.println("Gliding to a land");
		
	}
}