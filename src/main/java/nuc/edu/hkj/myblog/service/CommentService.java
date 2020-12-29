package nuc.edu.hkj.myblog.service;

import nuc.edu.hkj.myblog.pojo.Comment;

import java.text.ParseException;
import java.util.List;

public interface CommentService {

    List<Comment> showComments(Integer cid);

    void addComment(Comment comment) throws ParseException;


    void delComment(Integer c_commentid);
}
