package day11.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day11.practice.DAOException;
import day11.practice.SQlTask;
import day11.practice.TaskDo;

public class TestTaskDo1 {

	@Test
	public void testValidTask() throws DAOException {
		SQlTask task1 = new SQlTask("Learn java", "Completed");

		Assertions.assertTrue(TaskDo.createTask(task1));

	}

	@Test
	public void testInValidTask() {

		try {
			SQlTask task1 = null;
			TaskDo.createTask(task1);
		}

		catch (DAOException ex) {
			Assertions.assertEquals("Task object cannot be null", ex.getMessage());
		}
	}

}