package nuc.edu.hkj.myblog.dao;


import nuc.edu.hkj.myblog.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUserByUid(Integer uid);
}
