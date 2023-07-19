package day10.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day10.practice.EmailValidator;
import day10.practice.InvalidEmailException;

public class TestEmailValidator{

	@Test
	public void TestisValidEmail() throws InvalidEmailException {

		Assertions.assertTrue(EmailValidator.isValidEmail("gokul@gmail.com"));
	}
	
	@Test
	public void TestInvalidEmail() {
	
		try {
		boolean result = EmailValidator.isValidEmail("gokulgamil");
		
		}
		catch(InvalidEmailException e) {
			Assertions.assertEquals("Email does not match", e.getMessage());
			
		} 
	}
	
	 
	
	
	
}

