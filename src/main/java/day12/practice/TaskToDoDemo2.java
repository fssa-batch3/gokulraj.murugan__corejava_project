package day12.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.*;

import day11.practice.DAOException;
import day11.solved.ConnectionUtil;


public class TaskToDoDemo2 {

	public static boolean taskValidate(Task8 task) {
		if (task.name == null || "".equals(task.name)) {
			throw new IllegalArgumentException("Task name cannot null or empty");
		}
		if (task.status == null || "".equals(task.status)) {
			throw new IllegalArgumentException("Task status cannot null or empty ");
		}
		return true;
	}

	public static Connection getConnection() {

		Connection connection = null;
		try {

			String url = "jdbc:mysql://localhost:3306/Task";
			connection = DriverManager.getConnection(url, "root", "123456");

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to connect to the database");
		}
		return connection;
	}

	public static boolean createTask(Task8 task) throws DAOException, IllegalArgumentException {// User defined Exception
																								// {
		// Write code here to get connection
		// Create insert statement
		// Execute insert statement
		// close connection

		try {

			taskValidate(task);
		}

		catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException(ex.getMessage());

		}

		Connection con = null;

		try {

			String query = "INSERT INTO Task (name,status) VALUES (?,?)";
			con = getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, task.name);
			preparedStatement.setString(2, task.status);
			preparedStatement.executeUpdate();
		} catch (SQLException ex) {
			throw new DAOException("Cant run prepared statement");

		}

		finally {
			ConnectionUtil.close(con, null, null);
		}

		return true;
	}

	public static boolean updateTask(Task8 task) throws DAOException { // User defined Exception {
		// Write code here to get connection
		// Create update statement using task id
		// Execute update statement using task id
		// close connection

		try {

			taskValidate(task);
		}

		catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException(ex.getMessage());

		}

		if (task.id <= 0) {

			throw new IllegalArgumentException("Task id cannot be zero and less than 0");
		}

		Connection con = null;

		try {

			String query = "UPDATE task SET name = ?, status = ? WHERE id = ?";
			con = getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, task.name);
			preparedStatement.setString(2, task.status);
			preparedStatement.setInt(3, task.id);
			preparedStatement.executeUpdate();
		} catch (SQLException ex) {
			throw new DAOException("Cant run prepared statement");

		}

		finally {
			ConnectionUtil.close(con, null, null);
		}
		return true;

	}

	public static boolean deleteTask(int taskId) throws DAOException { // User defined Exception {
		// Write code here to get connection
		// Create delete statement using task id
		// Execute delete statement using task id
		// close connection

		if (taskId <= 0) {

			throw new IllegalArgumentException("Task id cannot be zero and less than 0");
		}

		Connection con = null;

		try {

			String query = "DELETE FROM task WHERE id = ?";
			con = getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setInt(1, taskId);

			preparedStatement.executeUpdate();
		} catch (SQLException ex) {
			throw new DAOException("Cant run prepared statement");

		}

		finally {
			ConnectionUtil.close(con, null, null);
		}
		return true;
	}

	public static List<Task8> getAllTasks() throws DAOException {// User defined Exception {
		// Write code here to get connection
		// Create a Select all query with each attribute listed as columns
		// Execute query
		// Iterate over the resultset and convert it to an ArrayList
		// close connection
		// Return the ArrayList of Tasks

		Connection con = null;

		try {

			String query = "SELECT * FROM task";
			con = getConnection();

			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);

			List<Task8> taskslist = new ArrayList<>();
			while (result.next()) {

				Task8 task = new Task8();
				task.id = result.getInt("id");
				task.name = result.getString("id");
				task.status = result.getString("id");
				taskslist.add(task);

			}
			return taskslist;

		} catch (SQLException ex) {
			throw new DAOException("Cant run prepared statement");

		}

		finally {
			ConnectionUtil.close(con, null, null);
		}
	}

	public static void main(String[] args) throws DAOException {
		List<Task8> taskslist = getAllTasks();

		for (Task8 element : taskslist) {

			System.out.println("Id:" + element.id + ",Task Name" + element.name + " Task Status" + element.status);
		}

	}

}