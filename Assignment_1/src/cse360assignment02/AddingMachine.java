package cse360assignment02;

public class AddingMachine {
	//Declare private variables
	private int total;
	private String history = "0";
	
	//Constructor
	public AddingMachine () {
		total = 0;	// not needed - included for clarity
	}
	
	//The getTotal method returns the current total
	int getTotal () {
		return total;
	}
	
	//The add method adds the parameter to the total variable and updates history
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	//The subtract method subtracts the parameter from the total variable and updates history
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	//prints the history of the calculations
	public String toString () {
		return history;
	}
	
	//The clear method clears your history and sets total to 0
	public void clear() {
		total = 0;
		history = "0";
	}
}