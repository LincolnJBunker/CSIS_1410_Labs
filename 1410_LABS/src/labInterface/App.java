package labInterface;

import java.util.ArrayList;

/**
 * class App contains the main method for this lab
 * 
 * contains a main method that creates instances of Plane, Hangglider, and Bird and prints them out.
 */
public class App
{

	/**
	 * Main method for this applicaiton
	 * 
	 * Creates instances of Plane, Hangglider, and Bird and prints their information
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		System.out.println();
		
		ArrayList<Flyable>  flyingThings = new ArrayList<>();
		
		flyingThings.add(myPlane);
		flyingThings.add(myHangglider);
		flyingThings.add(myBird);
		
		for (Flyable flyingThing : flyingThings) {
			System.out.println(flyingThing);
			flyingThing.launch();
			flyingThing.land();
			System.out.println();
		}
	}

}