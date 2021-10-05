package core.concretes;

import GoogleService.GoogleLogin;
import core.abstracts.GoogleLoginService;

public class GoogleLoginServiceAdapter implements GoogleLoginService {
    @Override
    public void login(String message) {
        GoogleLogin googleLogin = new GoogleLogin();
        googleLogin.login(message);
    }
}
