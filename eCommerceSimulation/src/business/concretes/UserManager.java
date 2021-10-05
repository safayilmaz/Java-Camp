package business.concretes;

import business.abstracts.IUserCheckService;
import business.abstracts.IUserManagerService;
import core.abstracts.GoogleLoginService;
import dataAccess.abstracts.IHibernateUserService;
import entities.concretes.User;

public class UserManager implements IUserManagerService {

    public UserManager(IHibernateUserService userService, IUserCheckService userCheckService) {
        this.userService = userService;
        this.userCheckService = userCheckService;
    }

    private IHibernateUserService userService;
    private IUserCheckService userCheckService;
    private GoogleLoginService googleLoginService;

    @Override
    public void signIn(User user) {
        if (userCheckService.checkEmail(user) && userCheckService.checkGoogleEmail(user)){
            if (user.getEmail()=="safa.yilmaz@yahoo.com"){
                if (user.getPassword()=="1234Sefa"){
                    System.out.println("You`ve successfully logged in.");
                }
            }
        }
    }

    @Override
    public void signUp(User user) {
        if (userCheckService.checkUser(user) && userCheckService.checkGoogleEmail(user)){
            System.out.println("You have successfully signed up");
        }
        else {
            System.out.println("Oops !");
        }
    }

    @Override
    public void signUpWithGoogle(User user) {
        if (userCheckService.checkGoogleEmail(user)){
            System.out.println("You`ve successfully signed up with your Google Account");
        }
    }

}
