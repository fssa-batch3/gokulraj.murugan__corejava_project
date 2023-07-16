package day07.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day07.practice.HashSetPractice;

public class TestHashSetPractice {

	@Test
	public void testdArrayListValid() {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(7);

		HashSet<Integer> set = new HashSet<Integer>(arr);
		
		try {
			HashSetPractice.convertHashSet(arr);
			
			boolean valid = HashSetPractice.validateDuplicatemethod(arr, set);

			Assertions.assertTrue(valid);
			
			
		} catch (Exception ex) {
			
			Assertions.assertEquals("The array does not contain all unique elements.", ex.getMessage());
		}

	}
	

	@Test
	public void testInValidArray() {

		try {
			
			HashSetPractice.convertHashSet(null);
			
			Assertions.fail("Validatepriority failed");
			
		} catch (Exception ex) {
			
			Assertions.assertEquals("ArrayList cannot be null", ex.getMessage());
		}

	}

}
