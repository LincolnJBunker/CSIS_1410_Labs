package textManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class LabTextManipulation {
	/**
	 * Main Method that creates an ArrayList of national parks and uses Class Scanner to accept user input
	 * 
	 * @param args an array of strings
	 */
	public static void main(String[] args) {
		ArrayList<String> parks = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String input;
		
		//find out if user is still inputting or not
		
		while (true) {
			System.out.println("Please enter your favorite National Park or DONE to stop: ");
			input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("done")) {
				break;
			}
			
			parks.add(input);
			
		}
		
		scanner.close();
		
		StringBuilder sb = new StringBuilder("Favorite National Parks: ");
		
		//loop through the array of parks, and append the park to sb using the updatedSpelling method
		for (int i = 0; i < parks.size(); i++) {
			String park = parks.get(i);
			sb.append(updateSpelling(park));
			
			if (i < parks.size() - 1) {
				sb.append(" | ");
			}
		}
		
		System.out.println(sb.toString());
		
	}
	/**
	 * updates the spelling of a given word to begin with an uppercase with all other characters being in lowercase
	 * 
	 * @param str a national park inputed by a user
	 * @return the park formatted to begin with an uppercase and all other characters in lowercase
	 */
	private static String updateSpelling(String str) {
		String[] words = str.split(" ");
		StringBuilder correctedStr = new StringBuilder();
		
		for (String word : words) {
			correctedStr.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
		}
		
		return correctedStr.toString().trim();
	}

}
