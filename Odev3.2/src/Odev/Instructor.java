package Odev;

public class Instructor extends User {

	//private fields
	private int id;
	private int instructorNumber;
	private String branch;

	//This is the empty constructor
	public Instructor()
	{
		
	}

	//parameterized constructor with 3 parameters
	public Instructor(int id, int instructorNumber, String branch) {
		super();
		this.id = id;
		this.instructorNumber = instructorNumber;
		this.branch = branch;
	}

	//Encapsulate fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
