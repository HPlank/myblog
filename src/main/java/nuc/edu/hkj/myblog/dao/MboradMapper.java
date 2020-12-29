package nuc.edu.hkj.myblog.dao;

import nuc.edu.hkj.myblog.pojo.Mboard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MboradMapper {


    List<Mboard> selectMborad();

    void insertMboard(Mboard mboard);

    void delMboard(Integer m_id);
}
