package day09.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Task2 {

	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;

	Task2(int id, String name, LocalDate deadline, int priority) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}

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

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

}

/**
 * Comparator to compare each Task object by their Deadline
 */
class DeadLineComparator2 implements Comparator<Task2> {

	@Override
	public int compare(Task2 o1, Task2 o2) {
		LocalDate first = o1.getDeadline();
		LocalDate second = o2.getDeadline();

		if (first == second) {
			
			if (o1.getPriority() == o2.getPriority())
				return 0;
			else if (o1.getPriority() > o2.getPriority()) {
				return 1;
			} 
			else
				return -1;
		
		}
		else if (ChronoUnit.DAYS.between(first, second) > 0) {
			return -1;
		} else
			return 1;
	}}



public class ComparatorTask {
	
	public static void main(String[] args) {
		 
		Task2 task1 = new Task2(3,"Coding",LocalDate.of(2022,10,22) , 3);
		Task2 task2 = new Task2(5,"Product Design",LocalDate.of(2022,10,01) , 4);
		Task2 task3 = new Task2(1,"Software Design",LocalDate.of(2022,10,07) , 1);
		Task2 task4 = new Task2(3,"Coding",LocalDate.of(2022,10,22) , 2);
		
		ArrayList<Task2> list = new ArrayList<Task2>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);
		
		
		Collections.sort(list,new DeadLineComparator2());
		
		Iterator<Task2> itr2 = list.iterator();
		while (itr2.hasNext()) {
			Task2 st = itr2.next();
			System.out.println(st.getId() + "," + st.getName() + "," + st.getDeadline() + "," + st.getPriority() );
		} 
		
	}	

}
