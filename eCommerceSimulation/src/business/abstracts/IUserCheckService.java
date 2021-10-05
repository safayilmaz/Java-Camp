package business.abstracts;

import entities.concretes.User;

public interface IUserCheckService {
    boolean checkName(User user);
    boolean checkLastname(User user);
    boolean checkPassword(User user);
    boolean checkEmail(User user);
    boolean checkUser(User user);
    boolean checkGoogleEmail(User user);
}
