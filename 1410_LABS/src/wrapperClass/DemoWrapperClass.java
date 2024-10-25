package wrapperClass;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 */
public class DemoWrapperClass {
	
	/**
	 * Method minMax() uses a StringBuilder to show the min and max values of all the number types
	 * and their ranges
	 * @return the ranges of the number types 
	 */
	public static String minMax() {
	    StringBuilder sb = new StringBuilder();

	    sb.append("Byte   : [").append(Byte.MIN_VALUE).append(" , ").append(Byte.MAX_VALUE).append("]\n");
	    sb.append("Short  : [").append(Short.MIN_VALUE).append(" , ").append(Short.MAX_VALUE).append("]\n");
	    sb.append("Integer: [").append(Integer.MIN_VALUE).append(" , ").append(Integer.MAX_VALUE).append("]\n");
	    sb.append("Long   : [").append(Long.MIN_VALUE).append(" , ").append(Long.MAX_VALUE).append("]\n");
	    sb.append("Float  : [").append(Float.MIN_VALUE).append(" , ").append(Float.MAX_VALUE).append("]\n");
	    sb.append("Double : [").append(Double.MIN_VALUE).append(" , ").append(Double.MAX_VALUE).append("]");

	    return sb.toString();
	}

	
	/**
	 * Method numberRepresentations() uses a StringBuilder add the bases of 10, 16, 8 and 2 together in columns.
	 * 
	 * @param number Any given number passed in 
	 * @return the base of 10, 16, 8, and 2 of the passed in number
	 */
	public static String numberRepresentations(int number) {
	    // Format each column to be left-aligned with width 7, separated by two spaces.
	    return String.format(
	        "%-7d  %-7s  %-7s  %s", 
	        number, 
	        Integer.toHexString(number), 
	        Integer.toOctalString(number), 
	        Integer.toBinaryString(number)
	    );
	}


	
	/**
	 * Method charProperties accepts a param of type char
	 * Uses a StringBuilder to append the character, to then check whether it is a digit, whitespace, lowercase, or uppercase
	 * @param character a given character (5, @, d, E)
	 * @return the characther with what properity it is
	 */
	public static String charProperties(char character) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(character);
		
		if (Character.isDigit(character)) {
			sb.append(" number");
		} else if (Character.isWhitespace(character)) {
			sb.append(" white space");
		} else if (Character.isLowerCase(character)) {
			sb.append(" lowercase letter");
		} else if (Character.isUpperCase(character)) {
			sb.append(" uppercase letter");
		}
		
		return sb.toString();
	}
	
	/**
	 * Method parseSum accepts an array of strings
	 * checks to see if it is null or empty (returns 0 if true)
	 * loops through the array, parses the string into double, and finds the sum
	 * @param arr
	 * @return
	 */
	public static double parseSum(String[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		
		double sum = 0;
		
		for (String str : arr) {
			sum += Double.parseDouble(str);
		}
		
		return sum;
	}
	
	/**
	 * Method getRandomThreeDigitNumber returns a random number between 100 and 999
	 * @return a random number between 100 and 999
	 */
	public static int getRandomThreeDigitNumber() {
		Random random = new Random();
		
		int randomThree = random.nextInt(900) + 100;
		
		return randomThree;
	}
	
	/**
	 * Method getRandomLetter returns a random uppercase or lowercase letter from a-z
	 * @return random letter from a-z
	 */
	public static char getRandomLetter() {
		Random random = new Random();
		
		boolean isUppercase = random.nextBoolean();
		
		if (isUppercase) {
			return (char) (random.nextInt(26) + 'A');
		} else {
			return (char)(random.nextInt(26) + 'a');
		}
	}
	
	/**
	 * Demonstrates the functionality provided in class DemoWrapperClass.
	 */

	public static void main(String[] args) {
	    Random rand = new Random();

	    // Method minMax:
	    System.out.println(minMax());
	    System.out.println();

	    // Method numberRepresentations:
	    int[] numbers = {9, 17, getRandomThreeDigitNumber(), 9876, 12345};
	    
	    System.out.printf("%-7s  %-7s  %-7s  %-7s%n", "Base 10", "Base 16", "Base 8", "Base 2");
	    System.out.printf("%-7s  %-7s  %-7s  %-7s%n", "-------", "-------", "------", "------");


	    for (int n : numbers) {
	        System.out.println(numberRepresentations(n));
	    }
	    System.out.println();

	    // Method charProperties:
	    char[] characters = {'8', '!', '#', 'a', 'M', getRandomLetter()};

	    for (char c : characters) {
	        System.out.println(charProperties(c));
	    }
	    System.out.println();

	    // Method parseSum:
	    String[] numberArray = {"1.1", "2.5", "3.14", "40.04", "5.325", "63.5"};

	    String[] wholeNumbers = new String[10];
	    for (int i = 0; i < wholeNumbers.length; i++) {
	        wholeNumbers[i] = "" + (rand.nextInt(90) + 10);
	    }

	    System.out.println(Arrays.deepToString(numberArray) + " .. sum = " + parseSum(numberArray));
	    
	}

 }
