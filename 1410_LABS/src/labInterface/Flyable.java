package labInterface;

/**
 * This interface represents the ability for an object to be flyable.
 * Implementing classes need to define how an object launches and lands.
 */
public interface Flyable {
	
	/**
	 * Descrives how the flyable object launches
	 */
	void launch();
	
	/**
	 * Describes how the flyable object lands
	 */
	void land();
}
