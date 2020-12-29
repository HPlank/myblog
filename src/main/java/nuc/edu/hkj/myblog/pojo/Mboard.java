package nuc.edu.hkj.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Mboard {

    private Integer m_id;
    private String m_context;
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH-mm-ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH-mm-ss")
    private Date m_intime;
    private Integer m_userid;

    private User user;

    @Override
    public String toString() {
        return "Mborad{" +
                "m_id=" + m_id +
                ", m_context='" + m_context + '\'' +
                ", m_intime=" + m_intime +
                ", m_userid=" + m_userid +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_context() {
        return m_context;
    }

    public void setM_context(String m_context) {
        this.m_context = m_context;
    }

    public Date getM_intime() {
        return m_intime;
    }

    public void setM_intime(Date m_intime) {
        this.m_intime = m_intime;
    }

    public Integer getM_userid() {
        return m_userid;
    }

    public void setM_userid(Integer m_userid) {
        this.m_userid = m_userid;
    }
}
