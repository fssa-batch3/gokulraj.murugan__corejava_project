package day08.test;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day08.practice.HashMapPractice;

public class TestCountNames {

	@Test
	public void testValidCount() {

		String input = "Ram,Ram,Superman,Spider,hey,hello,Spider";
		Map<String, Integer> countMap = HashMapPractice.countRepetation(input);

		Assertions.assertEquals(2, countMap.get("Ram"));
		Assertions.assertEquals(1, countMap.get("Superman"));
		Assertions.assertEquals(2, countMap.get("Spider"));
		Assertions.assertEquals(1, countMap.get("hey"));
		Assertions.assertEquals(1, countMap.get("hello"));

	}

	@Test
	public void testInValidCount() {

		try {
			HashMapPractice.countRepetation(null);
			Assertions.fail("Validatevcount failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("A string cannot be null or empty", ex.getMessage());
		}

	}

}