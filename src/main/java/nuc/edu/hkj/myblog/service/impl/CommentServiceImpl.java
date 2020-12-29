package nuc.edu.hkj.myblog.service.impl;

import nuc.edu.hkj.myblog.common.Tool;
import nuc.edu.hkj.myblog.dao.CommentMapper;
import nuc.edu.hkj.myblog.pojo.Comment;
import nuc.edu.hkj.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> showComments(Integer cid) {
        return commentMapper.selectComments(cid);
    }

    @Override
    public void addComment(Comment comment) throws ParseException {
        Date nowTime = Tool.getNowTime();
        comment.setC_mtime(nowTime);
        commentMapper.insertComment(comment);
    }

    @Override
    public void delComment(Integer c_commentid) {
        commentMapper.delComment(c_commentid);
    }


}
