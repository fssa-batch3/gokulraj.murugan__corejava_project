package day09.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day09.practice.SortedList;

public class TestSortedList {

	@Test
	public void testValidateArrayList() {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 6, 10));

		Assertions.assertTrue(SortedList.validateArrayList(list));
	}

	@Test
	public void TestInvalidArrayList() {

		try {
			ArrayList<Integer> list = new ArrayList<Integer>();

			SortedList.validateArrayList(list);

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("ArrayList cannot be null or empty", e.getMessage());
		}
	}

	@Test
	public void TestSortArrayList() {

		ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(5, 3, 1, 2, 4));

		ArrayList<Integer> sortedList = SortedList.sortArrayList(result);

		Assertions.assertEquals(answer, sortedList);
	}

	public void TestInvalidSortArrayList() {
		
		ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(5, 3, 1, 2, 4));

		ArrayList<Integer> sortedList = SortedList.sortArrayList(result);

		Assertions.assertEquals(answer, sortedList);

	}

}
