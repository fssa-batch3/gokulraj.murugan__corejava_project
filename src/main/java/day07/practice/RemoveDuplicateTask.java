package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateTask {

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

	
	public RemoveDuplicateTask(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	
	
	public static boolean  validateName (String name)throws IllegalArgumentException {
		
		if(name==null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty");
		}
		String nameregex = "^[a-zA-Z]{2,100}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(name);
		Boolean isMatch = matcher.matches();



		 if (!isMatch) {
			throw new IllegalArgumentException("The Name should be  minimum 2 letters and maximum 100 letters");

		}
		 return true;

		
	}
	
	
	public static boolean  validateDate(LocalDate deadline)throws IllegalArgumentException {
		LocalDate currentDate = LocalDate.now();
		if(deadline==null) {
			throw new IllegalArgumentException("Date cannot be null");
		}
		if(deadline.isBefore(currentDate)) {
			throw new IllegalArgumentException("Date cannot be in the past.");
			
		}
		return true;
		
	}
	
	
    @Override
    public String toString() {
        return "TaskDuplicate id=" + id + ", name=" + name + ", deadline=" + deadline ;
    }

    
	@Override
	public int hashCode() {
		
		return Objects.hash(deadline, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		
		
		RemoveDuplicateTask other = (RemoveDuplicateTask) obj;
		return Objects.equals(deadline, other.deadline) && id == other.id && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {

		ArrayList<RemoveDuplicateTask> taskList = new ArrayList<>();

		RemoveDuplicateTask task1 = new RemoveDuplicateTask(1, "taskplay", LocalDate.of(2023, 7, 15));
		taskList.add(task1);
		taskList.add(task1);
		
		
		taskList.add(new RemoveDuplicateTask(2, "Rc", LocalDate.of(2023, 7, 15)));
		taskList.add(new RemoveDuplicateTask(3, "Rc", LocalDate.of(2023, 7, 17)));

		System.out.println(taskList);

		taskRemoveDuplicate(taskList);

	}

	public static void taskRemoveDuplicate(ArrayList<RemoveDuplicateTask> taskList) {
		
		HashSet<RemoveDuplicateTask> set = new HashSet<RemoveDuplicateTask>(taskList);
		System.out.println(set);

	}
	
	public static boolean validateDuplicatemethod(ArrayList<RemoveDuplicateTask> taskList) throws IllegalArgumentException{
		
		HashSet<String> taskSet = new HashSet<>();
		
		for(RemoveDuplicateTask task:taskList) {
			
			   String taskKey = task.getName() + "_" + task.getDeadline();
			   if(taskSet.contains(taskKey)) {
				   throw new IllegalArgumentException("duplicate task found");
			   }
			   taskSet.add(taskKey);
		
		}
		return true;
	}
	
	
}