package nuc.edu.hkj.myblog.config;

import nuc.edu.hkj.myblog.controller.adminController.AContextController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class flitter extends HttpServlet {
    private final static Logger logger = LoggerFactory.getLogger(flitter.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("记录");
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("记录");
        super.doPost(req, resp);
    }
}
