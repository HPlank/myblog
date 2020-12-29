package nuc.edu.hkj.myblog.pojo;

import java.util.List;

public class User {

    private Integer username;

    private String u_name;

    private String password;

    private String u_roles;

    private List<Context> contexts;

    private List<Comment> comments;

    private List<Mboard> mboards;

    public List<Mboard> getMboards() {
        return mboards;
    }


    @Override
    public String toString() {
        return "User{" +
                "username=" + username +
                ", u_name='" + u_name + '\'' +
                ", password='" + password + '\'' +
                ", u_roles='" + u_roles + '\'' +
                ", contexts=" + contexts +
                ", comments=" + comments +
                ", mbroads=" + mboards +
                '}';
    }

    public void setMboards(List<Mboard> mboards) {
        this.mboards = mboards;
    }

    public User() {
    }


    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getU_roles() {
        return u_roles;
    }

    public void setU_roles(String u_roles) {
        this.u_roles = u_roles;
    }

    public List<Context> getContexts() {
        return contexts;
    }

    public void setContexts(List<Context> contexts) {
        this.contexts = contexts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}