package business.concretes;

import business.abstracts.IUserCheckService;
import entities.concretes.User;

import java.util.regex.Pattern;

public class UserCheckManager implements IUserCheckService {


    String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    @Override
    public boolean checkName(User user) {
    if (user.getName().isEmpty()){
        System.out.println("Please type your name");
        return false;
    }
    return true;
    }

    @Override
    public boolean checkLastname(User user) {
        if (user.getName().isEmpty()){
            System.out.println("Please type your surname");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkPassword(User user) {
        if (user.getPassword().length()<6){
            System.out.println("Password must be include minimum 6 characters");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkEmail(User user) {

        if(user.getEmail().isEmpty()) {
            System.out.println("The email field cannot be empty");
            return false;
        }else if (pattern.matcher(user.getEmail()).find() == false) {
            System.out.println("The email must be a such as in example. Example: example@example.com ");
            return false;
            }
        return true;
    }

    @Override
    public boolean checkUser(User user) {
        if (checkEmail(user)&&checkName(user)&&checkLastname(user)&&checkPassword(user) == true){
            System.out.println();
            return true;
        }
        return false;
    }

    @Override
    public boolean checkGoogleEmail(User user) {
        String regex = "gmail.com";
        if(user.getEmail().contains(regex)) {
            return true;
        }else {
            return false;
        }
    }

}
