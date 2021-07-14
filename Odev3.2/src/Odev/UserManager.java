package Odev;

public class UserManager {

	//To add a new user to DB
	public void addNewUser(User user) {
		System.out.println("The user was added succesfully to DB : "+user.getUserNumber());
	}

	//bulk operation (Multiple users add)
	public void addMultipleUser (User[] users){
		for (User user: users){
		addNewUser(user);
		}
	}
	
	
}
