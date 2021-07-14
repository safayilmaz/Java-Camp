package Odev;

public class Main {
	public static void main(String[] args) {

		//Creating a new user from object Student and Instructor
		Student newStudent = new Student();
		newStudent.setUserNumber(0001);
		newStudent.setCourse("Math");
		Student newStudent2 = new Student();
		newStudent2.setUserNumber(0002);
		Instructor newInstructor = new Instructor();
		newInstructor.setUserNumber(0003);
		Instructor newInstructor2 = new Instructor();
		newInstructor2.setUserNumber(0004);

		//Creating a new obj to do bulk operations or to add a new user
		UserManager userManager = new UserManager();
		User[] users = {newStudent, newStudent2, newInstructor, newInstructor2};
		userManager.addMultipleUser(users);

		//
		StudentManager studentManager = new StudentManager();
		studentManager.enrollNewCourse(newStudent);


	}

}
