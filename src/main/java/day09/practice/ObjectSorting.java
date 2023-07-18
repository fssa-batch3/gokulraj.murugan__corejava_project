package day09.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



class Task {

	private int id;
	private String name;
	private LocalDate deadline;

	Task(int id, String name, LocalDate deadline) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
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
}


/**
 * Comparator to compare each Task object by their Deadline
 */
class DeadLineComparator implements Comparator<Task> {

	@Override
	public int compare(Task o1, Task o2) {
		LocalDate first = o1.getDeadline();
		LocalDate second = o2.getDeadline();
		
		if ( first == second)
			return 0;
		else if (ChronoUnit.DAYS.between(first, second) > 0) { 
			return -1;
		}
		else
			return 1;
	}
}


public class ObjectSorting {
	
	public static void main(String[] args) {
		 
		Task task1 = new Task(3,"Coding",LocalDate.of(2022,10,22));
		Task task2 = new Task(5,"Product Design",LocalDate.of(2022,10,01));
		Task task3 = new Task(1,"Software Design",LocalDate.of(2022,10,07));
		Task task4 = new Task(3,"Coding",LocalDate.of(2022,10,22));
		
		ArrayList<Task> list = new ArrayList<Task>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);
		
		
		Collections.sort(list,new DeadLineComparator());
		
		Iterator<Task> itr2 = list.iterator();
		while (itr2.hasNext()) {
			Task st = itr2.next();
			System.out.println(st.getId() + "," + st.getName() + "," + st.getDeadline());
		}
		
		
		
	}

	

}
