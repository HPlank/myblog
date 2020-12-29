package nuc.edu.hkj.myblog.controller.adminController;

import nuc.edu.hkj.myblog.common.RequestDataUtils;
import nuc.edu.hkj.myblog.common.ResponseBody;
import nuc.edu.hkj.myblog.common.ResultGenerator;
import nuc.edu.hkj.myblog.pojo.Context;
import nuc.edu.hkj.myblog.service.impl.ContextServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AContextController {

    @Autowired
    private ContextServiceImpl contextService;
    @Autowired
    private ResultGenerator resultGenerator;

    private final static Logger logger = LoggerFactory.getLogger(AContextController.class);

    //博文列表
    @RequestMapping("/contextList")
    public ResponseBody contextList(){
        List<Context> contexts = contextService.showContext();
        return resultGenerator.getSuccessResult(contexts);
    }


    //博文详情
    @RequestMapping("/doContextDetail")
    public ResponseBody doContextDetail(Integer c_id){
        Context context = contextService.showContextDetail(c_id);
        return resultGenerator.getSuccessResult(context);
    }

    //添加博文
    @PostMapping("/doAddContext")
    public ResponseBody addContext(Context context,HttpServletRequest request) throws ParseException {
        logger.debug(RequestDataUtils.request(request).toString());
        contextService.addContext(context);
        return resultGenerator.getSuccessResult();
    }

    //预修改博文
    @RequestMapping("/beforeUpdateContext")
    public ResponseBody beforeUpdateContext(int c_id){
        logger.debug(String.valueOf(c_id));
        Context context = contextService.showContextDetail(c_id);
        return resultGenerator.getSuccessResult(context);
    }

    //修改博文
    @RequestMapping("/doUpdateContext")
    public ResponseBody doUpdateContext(Context context,HttpServletRequest request) throws ParseException {
        logger.debug(RequestDataUtils.request(request).toString());
        contextService.UpdataContext(context);
        return resultGenerator.getSuccessResult();
    }

    //删除博文
    @RequestMapping("/doDelContext")
    public ResponseBody doDelContext(int c_id){
        contextService.delContext(c_id);
        return resultGenerator.getSuccessResult();
    }



}
