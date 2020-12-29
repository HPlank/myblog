package nuc.edu.hkj.myblog.service;

import nuc.edu.hkj.myblog.pojo.User;

import javax.security.auth.login.LoginException;

public interface LoginService {

    User doLogin(User user) throws LoginException;

}
