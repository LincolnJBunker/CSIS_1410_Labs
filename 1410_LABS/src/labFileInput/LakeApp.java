package labFileInput;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Reads in data records from the csv file and prints the lakes.
 * 
 * @author Lincoln Bunker
 *
 */
public class LakeApp {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a list of lakes
        List<Lake> lakes = new ArrayList<>();

        // Try-with-resources to ensure the Scanner is closed
        try (Scanner input = new Scanner(LakeApp.class.getResourceAsStream("Lakes.csv"))) {
//            if (input.hasNextLine()) {
//                // Skip the header line
//                System.out.println(input.nextLine());
//            }

            // Read each line and process it
            while (input.hasNextLine()) {
                String line = input.nextLine();
                Lake lake = getLake(line); // Call the method to create a Lake object
                if (lake != null) {
                    lakes.add(lake); // Add valid lakes to the list
                }
            }
        }

        // Display all valid lakes
        for (Lake lake : lakes) {
            System.out.println(lake);
        }
    }

    /**
     * Creates a Lake object based on the data record passed as an argument.
     * The data record is expected to be of the following format: <br/>
     * {name of the lake},{depth},{has marina}<br/>
     * <p>
     * If the argument <code>line</code> doesn't match the expected format
     * and the instance of Lake cannot be created, then the string "Error: "
     * followed by the line should be printed to the standard error stream
     * (<code>System.err</code>) and the method should return null.
     * 
     * @param line a line from a csv file that includes data about a lake
     * @return Lake object corresponding to the argument <code>line</code>
     *         or null if <code>line</code> didn't match the expected format.
     */
    private static Lake getLake(String line) {
        try {
            // Split the line into parts
            String[] parts = line.split(",");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Invalid number of fields");
            }

            // Parse the fields
            String name = parts[0].trim();
            int depth = Integer.parseInt(parts[1].trim());
            boolean hasMarina = Boolean.parseBoolean(parts[2].trim());

            // Create and return the Lake object
            return new Lake(name, depth, hasMarina);

        } catch (Exception e) {
            // Print the error message to the error stream
            System.err.println("Error: " + line);
            return null;
        }
    }
}
