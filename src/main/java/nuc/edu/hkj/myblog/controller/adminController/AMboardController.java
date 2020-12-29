package nuc.edu.hkj.myblog.controller.adminController;

import nuc.edu.hkj.myblog.common.RequestDataUtils;
import nuc.edu.hkj.myblog.common.ResponseBody;
import nuc.edu.hkj.myblog.common.ResultGenerator;
import nuc.edu.hkj.myblog.pojo.Mboard;
import nuc.edu.hkj.myblog.service.impl.MboradServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AMboardController {

    @Autowired
    private MboradServiceImpl mboradService;
    @Autowired
    private ResultGenerator resultGenerator;
    private final static Logger logger = LoggerFactory.getLogger(AMboardController.class);
    @RequestMapping("/mboradShow")
    public ResponseBody mboradShow(){
        List<Mboard> mboards = mboradService.mboradShow();
        return resultGenerator.getSuccessResult(mboards);
    }

    @RequestMapping("/addMboard")
    public ResponseBody addMboard(Mboard mboard, HttpServletRequest request) throws ParseException {
        logger.debug(mboard.toString());
        logger.debug(RequestDataUtils.request(request).toString());
        mboradService.addMboard(mboard);
        return resultGenerator.getSuccessResult();
    }

    @RequestMapping("/delMboard")
    public ResponseBody delMboard(Integer m_id){
        mboradService.delMboard(m_id);
        return resultGenerator.getSuccessResult();
    }

}
