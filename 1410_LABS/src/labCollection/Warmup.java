package labCollection;
import java.util.ArrayList;
import java.util.List;

public class Warmup {
	
	/**
	 * Main method for class Warmup
	 * Creates an ArrayList of type integer
	 * Uses a forloop to add numers 2-50 adding 2 per interation to the ArrayList
	 * @param args
	 */
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 50; i += 2) {
            numbers.add(i);
        }

        System.out.print("Numbers: ");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();  // To move to the next line

        System.out.println("Removing multiples of three . . .");
        numbers.removeIf(x -> x % 3 == 0);

        printNumbers(numbers);

	}
	
	/**
	 * Method to print out the list of integers
	 * Uses a for each loop to go through the ArrayList of numbers to print the number with a space inbetween
	 * @param numbers an ArrayList of numbers.
	 */
	private static void printNumbers(List<Integer> numbers) {
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();
	}

}
