package labCollection;

import java.awt.Color;

/**
 * class Couch 
 * has two methods, color of type color and material of type material
 * 
 */
public class Couch {
	private Color color;
	private Material material;
	
	/**
	 * Constructor for class Couch
	 * Instantiates the two fields color and material
	 * @param color the color of the couch
	 * @param material the material of the couch
	 */
	public Couch (Color color, Material material) {
		this.color = color;
		this.material = material;
	}
	
	/**
	 * Getter method for the field color
	 * @return color the color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Getter method for the field material
	 * @return material the material
	 */
	public Material getMaterial() {
		return material;
	}
	
    /**
     * Compares this Couch object with another object to check for equality.
     * Two Couch objects are considered equal if they have the same color and material.
     * 
     * @param obj the object to compare with this Couch
     * @return true if the two couches are equal, false otherwise
     */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Couch)) {
			return false;
		}
		
		Couch other = (Couch) obj;
		
		return this.color.equals(other.color) && this.material == other.material;
	}
	
    /**
     * Returns a string representation of the Couch object in the format:
     * "Couch #RRGGBB material", where #RRGGBB is the hexadecimal color code,
     * and material is the lowercase name of the material.
     * 
     * @return a string representation of the Couch object
     */
	@Override
	public String toString() {
		int red = color.getRed();
		int blue = color.getBlue();
		int green = color.getGreen();
		
		String colorString = String.format("#%02x%02x%02x", red, green, blue);
		String materialString = material.name().toLowerCase();
		
		return "Couch " + colorString + " " + materialString;
	}
}
