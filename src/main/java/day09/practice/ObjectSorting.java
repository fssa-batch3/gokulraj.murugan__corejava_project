package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ObjectSorting implements Comparable<ObjectSorting> {

	private int id;
	private String name;
	private LocalDate deadline;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public ObjectSorting(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deadline, id, name);
	}

	@Override

	public int compareTo(ObjectSorting o) {

		if (deadline.equals(o.getDeadline())) {
			return 0;
		} else {
			if (deadline.isAfter(o.getDeadline())) {
				return 1;
			} else {
				return -1;
			}
			// return ( this.balance > o.getBalance()) ? 1: -1;
		}
	}

	@Override
	public String toString() {
		return "SortingTask " + id + " " + name + " " + deadline;
	}

	public static ArrayList<ObjectSorting> sortNumberTask(ArrayList<ObjectSorting> taskList)
			throws IllegalArgumentException {
		if (taskList == null) {
			throw new IllegalArgumentException("The array cannot be empty");

		}

		Collections.sort(taskList);
		for (ObjectSorting task : taskList) {
			System.out.println(task);

		}
		return taskList;

	}

	public static void main(String[] args) {

		ArrayList<ObjectSorting> taskList = new ArrayList<>();

		taskList.add(new ObjectSorting(1, "taseat", LocalDate.of(2023, 7, 19)));
		taskList.add(new ObjectSorting(5, "tasklearn", LocalDate.of(2023, 7, 11)));
		taskList.add(new ObjectSorting(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new ObjectSorting(3, "tasklearn", LocalDate.of(2023, 7, 17)));
//		System.out.println(taskList);
		sortNumberTask(taskList);
	}

}