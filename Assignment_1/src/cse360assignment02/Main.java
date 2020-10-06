package cse360assignment02;

public class Main {
	public static void main(String[] args) {
		//new AddingMachine object
		AddingMachine myCalculator = new AddingMachine();
		
		//add and subtract
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		//print results
		System.out.println(myCalculator);
	}

}
