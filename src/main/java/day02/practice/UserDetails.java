package day02.practice;


class User{ // create a class
	 
	
	// declare the variable with private
	private int id;
	private String name;
	private String password;
	private String email;
	
	
	// Getters and Setters
	
	public int getId() {
		System.out.println("Id : "+id);
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("Name : "+ name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		System.out.println("Password : "+ password);
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		System.out.println("Email : "+ email);
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

public class UserDetails {  // create a public class
	
	public static void main(String[] args) { // main method starts
		
		User user = new User(); // create a new object
		
		
		// set the values for the variable using public method
		user.setId(2);
		user.setName("Gokul");
		user.setPassword("Luffy@123");
		user.setEmail("gokul@gmail.com");
		
//		get the value of the variable using public method
		user.getId();
		user.getName();
		user.getPassword();
		user.getEmail();
		
		
	}

}
