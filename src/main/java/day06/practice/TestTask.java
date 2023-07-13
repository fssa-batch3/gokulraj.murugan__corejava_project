package day06.practice;

import java.util.ArrayList;

class Task {

	private String taskName;

	private int priority;
	
	Boolean equal;

	Task(String taskName, int priority){
		
		this.taskName = taskName;
		this.priority = priority;
		
	}
	
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
	public boolean findTaskByName(String name, ArrayList<Task> taskDetails) {
		
		for(int i =0 ; i < taskDetails.size() ; i++) {
			
			if(taskDetails.get(i).getTaskName().equals(name)) {
				return true;	
			}
		}
	
		
		return false;
		
	}

	

}

public class TestTask {

	public static void main(String[] args) {

		ArrayList<Task> taskDetails = new ArrayList<>();

		Task task1 = new Task("Practice",3);
		Task task2 = new Task("RC",2);
		
		taskDetails.add(task1);
		taskDetails.add(task2);
		
		
		System.out.println(taskDetails.get(0).getTaskName());
		
		
		System.out.println(task1.findTaskByName("RC", taskDetails));

	}
}
