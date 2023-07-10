package day03.misc;

public class Sand { // create a class

	// Declare the variable
	private static int numShovels;

	private int numRakes;

	
//	public static int getNumShovels() {
//		return numShovels;
//	}
//
//public static int getNumRakes() {
//		return numRakes;
//
//}

	public Sand() {  // Create a Constructor
		System.out.println("a"); // output
	}

	public void Sand() { // create a method
		System.out.println("b"); // output
	}

	public void run() { // create a method

		new Sand(); // create a  constructor

		Sand(); // call the method

	}

	public static void main(String[] args) { // main method starts

		new Sand().run(); // create a constructor and call the method 

	} // main method ends
}