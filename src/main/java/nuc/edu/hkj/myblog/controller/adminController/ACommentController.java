package nuc.edu.hkj.myblog.controller.adminController;

import nuc.edu.hkj.myblog.common.RequestDataUtils;
import nuc.edu.hkj.myblog.common.ResponseBody;
import nuc.edu.hkj.myblog.common.ResultGenerator;
import nuc.edu.hkj.myblog.pojo.Comment;
import nuc.edu.hkj.myblog.service.CommentService;
import nuc.edu.hkj.myblog.service.impl.CommentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

@RestController
@RequestMapping("/admin")
public class ACommentController {

    @Autowired
    private CommentServiceImpl commentService;
    @Autowired
    private ResultGenerator resultGenerator;
    private final static Logger logger = LoggerFactory.getLogger(ACommentController.class);


    @RequestMapping("/addComment")
    public ResponseBody addComment(Comment comment, HttpServletRequest request) throws ParseException {
        logger.debug(comment.toString());
        logger.debug(RequestDataUtils.request(request).toString());
        commentService.addComment(comment);
        return resultGenerator.getSuccessResult();
    }

    @RequestMapping("/delComment")
    public ResponseBody delComment(Integer c_commentid){
        commentService.delComment(c_commentid);
        return resultGenerator.getSuccessResult();
    }

}
