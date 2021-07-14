package Odev;

public class UserManager {

	public void addNewUser(User user) {
		System.out.println("The user was added succesfully to DB : "+user.getUserNumber());
	}

	public void addMultipleUser (User[] users){
		for (User user: users){
		addNewUser(user);
		}
	}
	
	
}
