package day07.test;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day07.practice.RemoveDuplicateTask;

public class TestRemoveDuplicateTask {

	@Test
	public void testValidTask() {

		Assertions.assertTrue(RemoveDuplicateTask.validateName("Taskplay"));

	}

	@Test
	public void testInValidTask() {

		try {
			RemoveDuplicateTask.validateName(" ");

			Assertions.fail("Validatepriority failed");

		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The Name should be  minimum 2 letters and maximum 100 letters", ex.getMessage());
		}

	}

	@Test
	public void testValidDate() {

		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = currentDate.plusDays(7);

		Assertions.assertTrue(RemoveDuplicateTask.validateDate(futureDate));

	}

	@Test
	public void testInValidDate() {

		LocalDate currentDate = LocalDate.now();
		LocalDate lastDate = currentDate.minusDays(7);

		try {
			RemoveDuplicateTask.validateDate(lastDate);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Date cannot be in the past.", ex.getMessage());
		}

	}

	@Test
	public void testValidTaskMethod() {

		ArrayList<RemoveDuplicateTask> taskList = new ArrayList<>();
		taskList.add(new RemoveDuplicateTask(2, "Rc", LocalDate.of(2023, 7, 15)));
		taskList.add(new RemoveDuplicateTask(1, "Junit Test Case", LocalDate.of(2023, 7, 17)));

		Assertions.assertTrue(RemoveDuplicateTask.validateDuplicatemethod(taskList));

	}

	@Test
	public void testInValidTaskMethod() {

		ArrayList<RemoveDuplicateTask> taskList = new ArrayList<>();
		RemoveDuplicateTask task1 = new RemoveDuplicateTask(1, "taskplay", LocalDate.of(2023, 7, 15));
		taskList.add(task1);
		taskList.add(task1);
		taskList.add(new RemoveDuplicateTask(2, "Rc", LocalDate.of(2023, 7, 15)));
		taskList.add(new RemoveDuplicateTask(3, "Junit Test Case", LocalDate.of(2023, 7, 17)));
		try {
			Assertions.assertTrue(RemoveDuplicateTask.validateDuplicatemethod(taskList));
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("duplicate task found", e.getMessage());
		}
	}

}