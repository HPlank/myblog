package nuc.edu.hkj.myblog.controller.userController;

import nuc.edu.hkj.myblog.common.ResponseBody;
import nuc.edu.hkj.myblog.common.ResultGenerator;
import nuc.edu.hkj.myblog.pojo.Comment;
import nuc.edu.hkj.myblog.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/user")
public class UCommentController {

    @Autowired
    private CommentServiceImpl commentService;
    @Autowired
    private ResultGenerator resultGenerator;

    @RequestMapping("/addComment")
    public ResponseBody addComment(Comment comment) throws ParseException {
        commentService.addComment(comment);
        return resultGenerator.getSuccessResult();
    }

}
