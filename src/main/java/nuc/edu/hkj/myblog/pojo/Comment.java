package nuc.edu.hkj.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Comment {
    private Integer c_commentid;

    private String c_message;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH-mm-ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH-mm-ss")
    private Date c_mtime;

    private Integer c_contextid;

    private Integer c_userid;

    private String c_user_name;

    @Override
    public String toString() {
        return "Comment{" +
                "c_commentid=" + c_commentid +
                ", c_message='" + c_message + '\'' +
                ", c_mtime=" + c_mtime +
                ", c_contextid=" + c_contextid +
                ", c_userid=" + c_userid +
                ", c_user_name='" + c_user_name + '\'' +
                '}';
    }

    public String getC_user_name() {
        return c_user_name;
    }

    public void setC_user_name(String c_user_name) {
        this.c_user_name = c_user_name;
    }

    public Integer getC_commentid() {
        return c_commentid;
    }

    public void setC_commentid(Integer c_commentid) {
        this.c_commentid = c_commentid;
    }

    public String getC_message() {
        return c_message;
    }

    public void setC_message(String c_message) {
        this.c_message = c_message;
    }

    public Date getC_mtime() {
        return c_mtime;
    }

    public void setC_mtime(Date c_mtime) {
        this.c_mtime = c_mtime;
    }

    public Integer getC_contextid() {
        return c_contextid;
    }

    public void setC_contextid(Integer c_contextid) {
        this.c_contextid = c_contextid;
    }

    public Integer getC_userid() {
        return c_userid;
    }

    public void setC_userid(Integer c_userid) {
        this.c_userid = c_userid;
    }
}