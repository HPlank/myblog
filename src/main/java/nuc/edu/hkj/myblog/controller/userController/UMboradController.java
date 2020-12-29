package nuc.edu.hkj.myblog.controller.userController;

import nuc.edu.hkj.myblog.common.ResponseBody;
import nuc.edu.hkj.myblog.common.ResultGenerator;
import nuc.edu.hkj.myblog.pojo.Mboard;
import nuc.edu.hkj.myblog.service.impl.MboradServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UMboradController {

    @Autowired
    private MboradServiceImpl mboradService;
    @Autowired
    private ResultGenerator resultGenerator;

    @RequestMapping("/mboradShow")
    public ResponseBody mboradShow(){
        List<Mboard> mboards = mboradService.mboradShow();
        return resultGenerator.getSuccessResult(mboards);
    }

    @RequestMapping("/addMboard")
    public ResponseBody addMboard(Mboard mboard) throws ParseException {
        mboradService.addMboard(mboard);
        return resultGenerator.getSuccessResult();
    }
}
