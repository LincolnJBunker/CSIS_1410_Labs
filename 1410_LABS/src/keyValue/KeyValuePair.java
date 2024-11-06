package keyValue;

import java.util.Objects;

public class KeyValuePair<K extends Comparable<K>, V> implements Comparable<KeyValuePair<K, V>> {
	private K key;
	private V value;
	
	/**
	 * Constructor for class KeyValuePair
	 * initializes the fields key and value
	 * @param key the key
	 * @param value the value
	 */
	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	/**
	 * getter method for key
	 * @return key the key
	 */
	public K getKey() {
		return key;
	}
	
	/**
	 * getter method for value
	 * @return value the value
	 */
	public V getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValuePair other = (KeyValuePair) obj;
		return Objects.equals(key, other.key) && Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "(" + key + ", " + value + ")" ;
		
	}
	

    /**
     * Compares this KeyValuePair with another KeyValuePair based on the key
     * @param other the other KeyValuePair to compare with
     * @return a negative integer, zero, or a positive integer as this KeyValuePair
     *         is less than, equal to, or greater than the specified KeyValuePair
     */
    @Override
    public int compareTo(KeyValuePair<K, V> other) {
        return this.key.compareTo(other.key);
    }

}
