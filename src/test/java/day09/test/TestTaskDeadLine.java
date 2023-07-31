package day09.test;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day09.practice.ComparatorTask;
import day09.practice.ObjectSorting;

public class TestTaskDeadLine {
	
	
	@Test

	public void testValidarray1() {

		ArrayList<ObjectSorting> taskList = new ArrayList<>();
	
		taskList.add(new ObjectSorting(1, "taseat", LocalDate.of(2023, 7, 19)));
		taskList.add(new ObjectSorting(5, "tasklearn", LocalDate.of(2023, 7, 11)));
		taskList.add(new ObjectSorting(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new ObjectSorting(3, "tasklearn", LocalDate.of(2023, 7, 17)));

		ArrayList<ObjectSorting> taskList2 = new ArrayList<>();
		taskList2.add(new ObjectSorting(5, "tasklearn", LocalDate.of(2023, 7, 11)));
		taskList2.add(new ObjectSorting(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList2.add(new ObjectSorting(3, "tasklearn", LocalDate.of(2023, 7, 17)));
		taskList2.add(new ObjectSorting(1, "taseat", LocalDate.of(2023, 7, 19)));
		ArrayList<ObjectSorting> actualUniqueList1 = ObjectSorting.sortNumberTask(taskList);
		

		Assertions.assertIterableEquals(actualUniqueList1,taskList2);
		

	}
	
	
	
	@Test

	public void testInValid() {


		try {

			ComparatorTask.sortPriority(null);
			Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("The array cannot be empty", ex.getMessage());

		}
		
		


	}
	

}