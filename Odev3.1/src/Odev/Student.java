package Odev;

public class Student extends User {

	//private fields
	private int id;
	private int studentNumber;
	private String course;
	//Empty constructor
	public Student () {
		
	}

	public Student ( int id, int studentNumber, String course) {
		super();
		this.id = id;
		this.studentNumber = studentNumber;
		this.course = course;
	}

	//Encapsulate fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String courses) {
		this.course = courses;
	}
}
