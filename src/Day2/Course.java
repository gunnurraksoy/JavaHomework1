package Day2;


public class Course {
	

	 int id;
	 String name;
	 int percent;
	 String instructor;
	
	public Course() {
		
	}

	public Course(int id, String name, int percent, String instructor) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
		this.instructor = instructor;
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

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}

}