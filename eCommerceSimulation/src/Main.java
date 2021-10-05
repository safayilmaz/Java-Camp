import business.abstracts.IUserCheckService;
import business.abstracts.IUserManagerService;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUser;
import entities.concretes.User;

public class Main {

    public static void main (String[] args){

        IUserManagerService userCheckService = new UserManager(new HibernateUser(),new UserCheckManager());
        User newUser = new User();
        newUser.setId(1);
        newUser.setName("Sefa");
        newUser.setSurname("Yilmaz");
        newUser.setEmail("safa.yilmaz@yahoo.com");
        newUser.setPassword("123456");
        userCheckService.signUp(newUser);

    }
}
