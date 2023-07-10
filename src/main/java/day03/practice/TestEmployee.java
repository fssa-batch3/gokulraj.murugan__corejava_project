package day03.practice;

class Employee { // create  a class

	// Declare the variable
	private int id;
	private String name;

	
	// Creating a Constructor which accepts all the attributes: Constructor
		// Overloading
	public Employee(int id, String name) {
		
		// assign the parameters to the variable
		this.id = id;
		this.name = name;
	}

	
	// Create a Getter method
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}

public class TestEmployee { // create a class

	public static void main(String[] args) { // main method starts
		
		// create a new object with arguments
		Employee e1 = new Employee(1, "naresh");
		Employee e2 = new Employee(2, "suresh");

		
		// output
		System.out.println("id="+e1.getId()+", " + "name=" + e1.getName());
		System.out.println("id="+e2.getId()+", " + "name=" + e2.getName());
	}
}
