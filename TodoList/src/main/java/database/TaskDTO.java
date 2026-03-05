package database;

public class TaskDTO {
	private int id;
	private String task;
	private Boolean done ;
	
	public TaskDTO(int id, String task, Boolean done) {
		super();
		this.id = id;
		this.task = task;
		this.done = done;
	}

	public TaskDTO(String task, Boolean done) {
		super();
		this.task = task;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "TaskDTO [id=" + id + ", task=" + task + ", done=" + done + "]";
	}
	
	
}
