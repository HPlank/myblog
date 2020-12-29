package nuc.edu.hkj.myblog.service.impl;

import nuc.edu.hkj.myblog.common.RequestDataUtils;
import nuc.edu.hkj.myblog.common.Tool;
import nuc.edu.hkj.myblog.controller.adminController.AContextController;
import nuc.edu.hkj.myblog.dao.ContextMapper;
import nuc.edu.hkj.myblog.pojo.Context;
import nuc.edu.hkj.myblog.service.ContextService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
public class ContextServiceImpl implements ContextService {

    @Autowired
    private ContextMapper contextMapper;

    private final static Logger logger = LoggerFactory.getLogger(AContextController.class);

    @Override
    public List<Context> showContext() {
        return contextMapper.selectContext();
    }

    @Override
    public Context showContextDetail(Integer cid) {
        return contextMapper.selectContextById(cid);
    }

    @Override
    public void addContext(Context context) throws ParseException {
        logger.debug(context.toString());
        Date nowTime = Tool.getNowTime();
        context.setC_intime(nowTime);
        contextMapper.insertContext(context);
    }

    @Override
    public void UpdataContext(Context context) throws ParseException {
        context.setC_intime(Tool.getNowTime());
        contextMapper.updataContext(context);
    }

    @Override
    public void delContext(int cid) {
        contextMapper.delContext(cid);
    }
}
