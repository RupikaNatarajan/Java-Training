package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task{
	private int taskId;
	private String taskName;
	private boolean isCompleted;
	
	public Task(int taskId,String taskName) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.isCompleted = false;
	}
	
	
	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	public String toString() {
		String completionStatus = isCompleted ? "Completed" : "Not Completed";
        return "TaskID : " + taskId + ", TaskName : " + taskName +  ", TaskCompletedStatus : " + completionStatus ;
    }
	
	
}

class TaskAssignment{
	static List<Task> taskList = new ArrayList<>();
	static int taskId = 1;
	
	void addTask(String taskName) {
		Task newTask = new Task(taskId++, taskName);
		taskList.add(newTask);
		System.out.println("Task added Successfully");
		System.out.println(newTask);
	}
	
	void viewTasks() {
		if(taskList.isEmpty()) {
			System.out.println("No tasks in the list");
		}
		else {
			for(Task tasks : taskList) {
				System.out.println(tasks);
			}
		}
	}
	
	void markTaskAsCompleted(int taskId){
		for(Task tasks : taskList) {
			if (tasks.getTaskId() == taskId) {
				if (tasks.isCompleted()) {
					System.out.println("Task is already completed.");
				} else {
					tasks.setCompleted(true);
					System.out.println("Task marked as completed: " + tasks);
				}
				return;
			}
        }
		System.out.println("Task with ID " + taskId + " not found.");
    }
	
	
	void deleteTask(int taskId) {
		for(Task tasks : taskList) {
			if(tasks.getTaskId() == taskId) {
				taskList.remove(tasks);
				System.out.println("Task Deleted..");
				return;
			}
		}
		System.out.println("Task with " + taskId + " not present in the task list");
	}
	
	void searchTask(int taskId) {
		for(Task tasks : taskList) {
			if(tasks.getTaskId() == taskId) {
				System.out.println("Task found");
				System.out.println("TASK ID : " + taskId);
				System.out.println("TASK NAME : " + tasks.getTaskName());
				
				
				return;
			}
		}
		System.out.println("Task does not found");
		
	}
} 

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     TaskAssignment taskassignment = new TaskAssignment();
	     
	     
	     while(true) {
	    	 System.out.println("Enter 1 -> add new task..");
	    	 System.out.println("Enter 2 -> view all tasks..");
	    	 System.out.println("Enter 3 -> delete any task..");
	    	 System.out.println("Enter 4 -> make task as completed...");
	    	 System.out.println("Enter 5 -> search for a task..");
	    	 System.out.println("Enter 6 -> To Exit");
	    	 
	    	 System.out.println("Enter the choice");
	    	 int choice = sc.nextInt();
	    	 
	    	 switch(choice) {
	    	 case 1:
	    		 System.out.println("Enter the task name: ");
	    		 String taskName = sc.next();
	    		 taskassignment.addTask(taskName);
	    		 System.out.println("----------------------------");
	    		 break;
	    		
	    	 case 2:
	    		 taskassignment.viewTasks();
	    		 System.out.println("----------------------------");
	    		 break;
	    		 
	    	 case 3:
	    		 System.out.println("Enter the id of the task to delete from the list: ");
	    		 int id = sc.nextInt();
	    		 taskassignment.deleteTask(id);
	    		 System.out.println("----------------------------");
	    		 break;
	    		 
	    	 case 4:
	    		 System.out.println("Enter the id of the task to make it as completed: ");
	    		 int taskid = sc.nextInt();
	    		 taskassignment.markTaskAsCompleted(taskid);
	    		 System.out.println("----------------------------");
	    		 break;
	    		 
	    	 case 5:
	    		 System.out.println("Enter the id of the task to search: ");
	    		 int ID = sc.nextInt();
	    		 taskassignment.searchTask(ID);
	    		 System.out.println("----------------------------");
	    		 break;
	    	 case 6:
	    		 System.out.println("Exiting..");
	    		 System.exit(0);
	    	 }
	     }


	}

}
