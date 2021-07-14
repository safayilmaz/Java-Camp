package Odev;

public class Instructor extends User {

	//private fields
	private int id;
	private int instructorNumber;
	private String branch;

	//Empty Constructor
	public Instructor()
	{
		
	}
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
