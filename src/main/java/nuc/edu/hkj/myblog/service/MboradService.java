package nuc.edu.hkj.myblog.service;

import nuc.edu.hkj.myblog.pojo.Mboard;

import java.text.ParseException;
import java.util.List;

public interface MboradService {

    List<Mboard> mboradShow();

    void addMboard(Mboard mboard) throws ParseException;

    void delMboard(Integer m_id);
}
