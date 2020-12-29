package nuc.edu.hkj.myblog.service.impl;

import nuc.edu.hkj.myblog.common.Tool;
import nuc.edu.hkj.myblog.dao.MboradMapper;
import nuc.edu.hkj.myblog.pojo.Mboard;
import nuc.edu.hkj.myblog.service.MboradService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class MboradServiceImpl implements MboradService {

    @Autowired
    private MboradMapper mboradMapper;

    @Override
    public List<Mboard> mboradShow() {
        return mboradMapper.selectMborad();
    }

    @Override
    public void addMboard(Mboard mboard) throws ParseException {
        mboard.setM_intime(Tool.getNowTime());
        mboradMapper.insertMboard(mboard);
    }

    @Override
    public void delMboard(Integer m_id) {
        mboradMapper.delMboard(m_id);
    }
}
