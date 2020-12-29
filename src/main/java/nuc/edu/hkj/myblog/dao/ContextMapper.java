package nuc.edu.hkj.myblog.dao;

import nuc.edu.hkj.myblog.pojo.Context;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContextMapper {


    List<Context> selectContext();

    Context selectContextById(Integer cid);

    void insertContext(Context context);


    void updataContext(Context context);

    void delContext(int cid);
}
