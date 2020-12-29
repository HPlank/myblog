package nuc.edu.hkj.myblog.controller;

import nuc.edu.hkj.myblog.common.ResponseBody;
import nuc.edu.hkj.myblog.common.ResultCode;
import nuc.edu.hkj.myblog.common.ResultGenerator;
import nuc.edu.hkj.myblog.pojo.User;
import nuc.edu.hkj.myblog.service.impl.ContextServiceImpl;
import nuc.edu.hkj.myblog.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;

@RestController
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;
    @Autowired
    private ContextServiceImpl contextService;
    @Autowired
    private ResultGenerator resultGenerator;

    @RequestMapping("/doLogin")
    public ResponseBody doLogin(User user) throws LoginException {
        User user1 = loginService.doLogin(user);
        if (user1.getU_name()!=null){
            return resultGenerator.getSuccessResult(user1);
        }else {
            return resultGenerator.getFreeResult(ResultCode.LOGIN_FAIL);
        }

    }

}
