package nuc.edu.hkj.myblog.controller.userController;

import nuc.edu.hkj.myblog.common.ResponseBody;
import nuc.edu.hkj.myblog.common.ResultGenerator;
import nuc.edu.hkj.myblog.pojo.Context;
import nuc.edu.hkj.myblog.service.impl.CommentServiceImpl;
import nuc.edu.hkj.myblog.service.impl.ContextServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UContextController {

    @Autowired
    private ContextServiceImpl contextService;
    @Autowired
    private ResultGenerator resultGenerator;
    @Autowired
    private CommentServiceImpl commentService;

    //博文列表
    @RequestMapping("/contextList")
    public ResponseBody contextList(){
        List<Context> contexts = contextService.showContext();
        return resultGenerator.getSuccessResult(contexts);
    }

    //博文详情
    @RequestMapping("/doContextDetail")
    public ResponseBody doContectDetail(Integer c_id){
        Context context = contextService.showContextDetail(c_id);
        return resultGenerator.getSuccessResult(context);
    }



}
