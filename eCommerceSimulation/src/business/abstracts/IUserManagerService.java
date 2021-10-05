package business.abstracts;

import entities.concretes.User;

public interface IUserManagerService {

    void signIn (User user);
    void signUp (User user);
    void signUpWithGoogle (User user);
}
