package labJUnit;

/**
 * Simple class to demonstrate automated testing with JUnit Jupiter (JUnit 5).
 * 
 * @author Lincoln Bunker
 *
 */
public class SimpleClass {

   /**    
   * Determines whether a given year is a leap year.    
   * <p>    
   * @param y year     
   * @return true if <code>year</code> is a leap year and false otherwise.    
   * @throws IllegalArgumentException if <code>year</code> is not positive.   
   */
   public static boolean isLeapYear(int year) {
	   if (year <= 0) {
		   throw new IllegalArgumentException();
	   } 
	   
	   if (year % 400 == 0) {
		   return true;
	   }
	   
	   if (year % 100 == 0) {
		   return false;
	   }
	   if (year % 4 == 0) {
		   return true;
	   }
	   return false;
   }
}