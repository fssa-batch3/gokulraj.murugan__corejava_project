package day06.test;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day06.practice.Task;
import day06.practice.TaskFindMethod;

public class TestTaskMethod {

	@Test
	public void testValidFindTask() throws Exception {

		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("play", 3));
		taskList.add(new Task("eating", 2));
		taskList.add(new Task("studying", 1));
		taskList.add(new Task("takingnotes", 4));
		taskList.add(new Task("exercise", 5));

		boolean findTask = TaskFindMethod.findTaskByName("play", taskList);

		Assertions.assertTrue(findTask);

	}

	@Test
	public void testInValidFindTask() {

		try {
			ArrayList<Task> taskList = new ArrayList<>();
			taskList.add(new Task("play", 3));
			taskList.add(new Task("eating", 2));
			taskList.add(new Task("studying", 1));
			taskList.add(new Task("takingnotes", 4));
			taskList.add(new Task("exercise", 5));

			boolean findTask = TaskFindMethod.findTaskByName("playing", taskList);

			Assertions.fail("testInValidFindTask failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Not found", ex.getMessage());
		}

	}

}