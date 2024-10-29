package labCollection;
import java.util.ArrayList;
import java.util.List;

public class Warmup {

	public static void main(String[] args) {
        // Step 2: Create a list of even numbers from 2 to 50 (inclusive)
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 50; i += 2) {
            numbers.add(i);
        }

        // Step 4: Use forEach to print elements separated by single spaces
        System.out.print("Numbers: ");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();  // To move to the next line

        // Step 5: Remove multiples of three
        System.out.println("Removing multiples of three . . .");
        numbers.removeIf(x -> x % 3 == 0);

        // Step 6: Print the numbers again
        printNumbers(numbers);

	}
	
	private static void printNumbers(List<Integer> numbers) {
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();
	}

}
