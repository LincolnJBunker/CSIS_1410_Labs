package keyValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClient {

	public static void main(String[] args) {
		//Part 1
		System.out.println("Part 1:");
		System.out.println("---------");
		KeyValuePair <String, Integer> p1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair <String, Integer> p2 = new KeyValuePair<>("NY", 8244910);
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		
		KeyValuePair <String, Integer> p3 = p2;
		
		System.out.println();
		System.out.println("p3: " + p3);
		
		System.out.println("p1.equals(p2): " + p2.equals(p3));
		
		//Part 2
		System.out.println();
		System.out.println("Part 2:");
		System.out.println("---------");
		
		KeyValuePair <String, Integer> p4 = new KeyValuePair<>("LA", 3819702);
		KeyValuePair <String, Integer> p5 = new KeyValuePair<>("SF", 818826);
		
		List<KeyValuePair<String, Integer>> cities = new ArrayList<>();
		cities.add(p1);
		cities.add(p2);
		cities.add(p3);
		cities.add(p4);
		cities.add(p5);
		
		System.out.println("Unsorted list:");
        for (KeyValuePair<String, Integer> city : cities) {
            System.out.println(city);
        }

        // Sort the list
        Collections.sort(cities);

        // Print the sorted list
        System.out.println("\nSorted list:");
        for (KeyValuePair<String, Integer> city : cities) {
            System.out.println(city);
        }
	}

}
