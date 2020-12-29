package nuc.edu.hkj.myblog.service.impl;

import nuc.edu.hkj.myblog.dao.UserMapper;
import nuc.edu.hkj.myblog.pojo.User;
import nuc.edu.hkj.myblog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User doLogin(User user) {
        User user1 = userMapper.selectUserByUid(user.getUsername());
        if(user1.getPassword().equals(user.getPassword())){
            return user1;
        }
            return new User();
    }
}
