package nuc.edu.hkj.myblog.service;

import nuc.edu.hkj.myblog.pojo.Context;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;

public interface ContextService {

    List<Context> showContext();

    Context showContextDetail(Integer cid);

    void addContext(Context context) throws ParseException;

    void UpdataContext(Context context) throws ParseException;

    void delContext(int cid);
}
