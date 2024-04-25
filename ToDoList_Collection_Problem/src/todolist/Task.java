package todolist;

public class Task {
   
	String description;
    int duration;
    String status;
	
    public Task(String description, int duration) {
		super();
		this.description = description;
		this.duration = duration;
		this.status = "pending";
	}
    
    public void markAsCompleted() {
    	this.status = "completed";
    }
    
    @Override
   	public String toString() {
   		return "Task [description=" + description + ", duration=" + duration + ", status=" + status + "]";
   	} 
}
