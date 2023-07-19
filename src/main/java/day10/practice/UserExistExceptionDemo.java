package day10.practice;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;

class User {
	private int id;
	private String name;
	private String emailId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.emailId = email;
	}

	// Override the equals method to compare the fields of User objects
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true; 
		if (o == null || getClass() != o.getClass())
			return false;
		User user = (User) o;
		return id == user.id && name.equals(user.name) && emailId.equals(user.emailId);
	}

	// Don't forget to override hashCode whenever you override equals
	@Override
	public int hashCode() {
		return Objects.hash(id, name, emailId);
	}
}

public class UserExistExceptionDemo {
	
	public static ArrayList<User> userList = new ArrayList<User>();

	public static boolean register(User user) throws UserAlreadyExistsException {
		
		if (UserExistExceptionDemo.userList.contains(user)) {
			throw new UserAlreadyExistsException("User already exist");
		}
		validateId(user.getId());
		validateEmail(user.getEmailId());
		UserExistExceptionDemo.userList.add(user);

		System.out.println(user.getId() + user.getEmailId());
		
		return true;
	}

	public static boolean validateId(int id) throws IllegalArgumentException {
		if (id < 0) {
			throw new IllegalArgumentException("id number cannot be negative");
		}
		return true;
	}

	public static boolean validateEmail(String email) throws IllegalArgumentException {
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		boolean matches = Pattern.compile(regex).matcher(email).matches();
		if (matches) {
			return true;
		} else {
			throw new IllegalArgumentException("Email is invalid");
		}
	}


	
	public static void main(String[] args) throws UserAlreadyExistsException {
		User user1 = new User(1, "gokul", "gokul@gamil.com");
		User user2 = new User(2, "luffy", "luffymail.com");
		try {
			
			boolean user1Match = register(user1);
			
			register(user2);
		} catch (UserAlreadyExistsException e) {
			throw new UserAlreadyExistsException(e.getMessage());
		}
	}
	
	
	
}
