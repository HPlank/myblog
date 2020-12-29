package nuc.edu.hkj.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.soap.Text;
import java.util.Date;
import java.util.List;

public class Context {

    private Integer c_id;

    private String c_name;

    private String c_context;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH-mm-ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH-mm-ss")
    private Date c_intime;

    private Integer c_user_id;

    private List<Comment> comments;


    public Integer getC_user_id() {
        return c_user_id;
    }

    public void setC_user_id(Integer c_user_id) {
        this.c_user_id = c_user_id;
    }

    @Override
    public String toString() {
        return "Context{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_context='" + c_context + '\'' +
                ", c_intime=" + c_intime +
                ", c_user_id=" + c_user_id +
                ", comments=" + comments +
                '}';
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_context() {
        return c_context;
    }

    public void setC_context(String c_context) {
        this.c_context = c_context;
    }

    public Date getC_intime() {
        return c_intime;
    }

    public void setC_intime(Date c_intime) {
        this.c_intime = c_intime;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}