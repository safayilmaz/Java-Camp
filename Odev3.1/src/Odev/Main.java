package Odev;

public class Main {
	public static void main(String[] args) {
		Student newStudent = new Student();
		newStudent.setUserNumber(0001);
		Student newStudent2 = new Student();
		newStudent2.setUserNumber(0002);
		Instructor newInstructor = new Instructor();
		newInstructor.setUserNumber(0003);
		Instructor newInstructor2 = new Instructor();
		newInstructor2.setUserNumber(0004);
		UserManager userManager = new UserManager();

		User[] users = {newStudent, newStudent2, newInstructor, newInstructor2};
		userManager.addMultipleUser(users);


	}

}
