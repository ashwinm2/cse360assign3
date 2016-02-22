package cse360assign3;

/**
 * Third and Final Version.
 * A Class to perform the basic function of a calculator such as
 * addition, subtraction, multiplication, division and
 * show the history of computation performed in a string format.
 * @author Ashwin Murthy PIN - 613  CSE360 Spring 2016
 *
 */
public class Calculator {
	
	private int total; 
	private String history = "0"; 
	
	/** Initializing the total to zero. */ 
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/** Functions that returns the total.
	 * @param none
	 */
	public int getTotal () {
		return total;
	}
	
	
	/** Function that performs the addition operation
	 * @param Value to be added.
	 */
	public void add (int value) {
		history += " + "; 
		total = total + value;
		history += Integer.toString(value);
	}
	
	
	/** Function that performs the subtraction operation
	 * @param Value to be subtracted.
	 */
	public void subtract (int value) {
		history += " - "; 
		total = total - value;
		history += Integer.toString(value);
	}
	
	
	/** Function that performs the multiplication operation
	 * @param Value to be multiplied.
	 */
	public void multiply (int value) {
		history += " * "; 
		total = total * value;
		history += Integer.toString(value);
	}
	
	
	/** Function that performs the division operation.
	 *  If the value is zero the total is reset.
	 * @param Value to be divided.
	 */
	public void divide (int value) {
		history += " / "; 
		if( value != 0 )
			total = total / value;
		else
			total = 0;
		history += Integer.toString(value);
	}
	 
	
	/** Function that returns the history of operation in string format.
	 * @param none.
	 */
	public String getHistory () {
		return history;
	}

}
