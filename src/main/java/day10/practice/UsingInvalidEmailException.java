package day10.practice;

import java.util.Scanner;

class EmailDetails {

	private String email;

	public void setEmail(String email) {
		this.email = email;
	} 

	public String getEmail() {
		return email;
	}
} 


public class UsingInvalidEmailException {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		task.setName("Creating test case"); Commenting this so that exception is thrown

		try {

			System.out.println("Enter Your email");

			String email = scan.nextLine();
			boolean valid = EmailValidator.isValidEmail(email);
 
			if (valid) {

				System.out.println("Given email id " + email.trim() + " is valid");
			}

		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
	}
}
