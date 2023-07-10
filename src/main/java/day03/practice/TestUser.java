package day03.practice;


class User{ // create a class
	
	// 	Initialize the variables
	private String name ;
	private String password;
	private String email;
	
	
	
	// Create a getter and Setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	// Creating a Constructor which accepts all the attributes: Constructor
		// Overloading
	User(String name , String password , String email){
		
		
		// assign the parameters to the variable
		
		this.name  = name;
		this.password = password;
		this.email = email;
		
	}
	
	
} 

public class TestUser { // create a public class
	
	public static void main(String[] args) { // main method starts
		
		User user1 = new User("Gokul","Luffy@123" , "gokul@gmail.com"); // create a object with parameters to call the Constructor
		
		System.out.println(user1.getName() + " - " + user1.getPassword() +" - " + user1.getEmail()); // output
	} // main method ends

} 
