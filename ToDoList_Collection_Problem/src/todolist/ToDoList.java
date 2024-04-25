package todolist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ToDoList {

	Queue <Task> taskQueue;
	Stack <Task> completedStackTask;
	
	public ToDoList() {
		this.taskQueue = new LinkedList<>();
	    this.completedStackTask = new Stack<>();	
	}
	
	public void addNewTask(Task task) {
		taskQueue.offer(task);
		System.out.println("Task added : " +task);
	}
	
	public void process() {
		while(!taskQueue.isEmpty()) {
			Task task = taskQueue.poll();
			System.out.println("Processing task : ");
			task.markAsCompleted();
			completedStackTask.push(task);
		}
	}
	
	 public void displayCompletedTasks() {
	        System.out.println("Completed Task :" );
	        for(Task task : completedStackTask) {
	        	System.out.println(task);
	        }
	    }
	 
	 public class Main {
		    public static void main(String[] args) {
		        ToDoList todoList = new ToDoList();

		        // Adding tasks
		        todoList.addNewTask(new Task("Task 1", 30));
		        todoList.addNewTask(new Task("Task 2", 45));
		        todoList.addNewTask(new Task("Task 3", 60));

		        // Processing tasks
		        todoList.process();

		        // Displaying completed tasks
		        todoList.displayCompletedTasks();
		    }
		}
	}


