package labCollection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * class CouchApp contains the main method and output for this application
 * creates an array of colors, and 2 lists -- couches and favorites
 * 
 */
public class CouchApp {

    public static void main(String[] args) {

        Color[] colors = {
            Color.BLACK, Color.BLUE, Color.DARK_GRAY, Color.GRAY, 
            Color.GREEN, Color.LIGHT_GRAY, Color.RED, Color.WHITE
        };


        List<Couch> couches = new ArrayList<>();


        for (Color color : colors) {
            couches.add(new Couch(color, Material.FABRIC));
            couches.add(new Couch(color, Material.LEATHER));
            couches.add(new Couch(color, Material.VINYL));
        }


        List<Couch> favorites = new ArrayList<>();
        favorites.add(new Couch(Color.RED, Material.FABRIC));
        favorites.add(new Couch(Color.BLACK, Material.LEATHER));
        favorites.add(new Couch(Color.WHITE, Material.VINYL));

        System.out.println("All couches:");
        couches.forEach(System.out::println);


        System.out.println("Number of elements in list couches: " + couches.size());

        if (couches.containsAll(favorites)) {
            System.out.println("All favorites are in the list.");
        } else {
            System.out.println("Not all favorites are in the list.");
        }

        System.out.println("\nRemoving all vinyl couches . . .");
        couches.removeIf(couch -> couch.getMaterial() == Material.VINYL);

        System.out.println("Remaining couches:");
        couches.forEach(System.out::println);

        System.out.println("Number of elements in list couches: " + couches.size());

        if (couches.containsAll(favorites)) {
            System.out.println("All favorites are in the list.");
        } else {
            System.out.println("Not all favorites are in the list.");
        }

        System.out.println("\nAdding all the favorites to the list couches . . .");
        couches.addAll(favorites);

        couches.forEach(System.out::println);
        System.out.println("Number of elements in list couches: " + couches.size());

        if (couches.containsAll(favorites)) {
            System.out.println("All favorites are in the list.");
        } else {
            System.out.println("Not all favorites are in the list.");
        }

        System.out.println("\nAdding all the couches to a set . . .");
        Set<Couch> couchSet = new HashSet<>(couches);

        couchSet.forEach(System.out::println);
        System.out.println("Number of elements in the set: " + couchSet.size());

        if (couchSet.containsAll(favorites)) {
            System.out.println("All favorites are in the list.");
        } else {
            System.out.println("Not all favorites are in the list.");
        }
    }
}
