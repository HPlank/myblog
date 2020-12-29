package nuc.edu.hkj.myblog.dao;

import nuc.edu.hkj.myblog.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> selectComments(Integer cid);

    void insertComment(Comment comment);

    void delComment(Integer c_commentid);
}
