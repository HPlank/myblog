package nuc.edu.hkj.myblog.execption;

import nuc.edu.hkj.myblog.common.ResponseBody;
import nuc.edu.hkj.myblog.common.ResultCode;
import nuc.edu.hkj.myblog.common.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {
    @Autowired
    private ResultGenerator resultGenerator;

    @ExceptionHandler({nuc.edu.hkj.myblog.execption.LoginExecption.class})
    public ResponseBody loginException(Exception e){
        return resultGenerator.getFreeResult(ResultCode.LOGIN_NO);
    }

    @ExceptionHandler({java.lang.Exception.class})
    public ResponseBody execptionHandler(Exception e){
        return resultGenerator.getFreeResult(ResultCode.NOERROR);
    }

}
