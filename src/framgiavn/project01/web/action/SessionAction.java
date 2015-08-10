package framgiavn.project01.web.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.model.User;

public class SessionAction extends ActionSupport implements SessionAware {
    private UserBusiness userBusiness = null;
    private User user = null;
    private Map<String, Object> session;

    public void setUserBusiness(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String newSession() {
        return SUCCESS;
    }

    public String login() {
        try {
            user = userBusiness.login(user.getUsername(), user.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user != null) {
            session.put("logged", "true");
            session.put("userId", user.getUserId());
            session.put("username", user.getUsername());
            return SUCCESS;
        } else {
            addActionError("Please Enter Valid Username and Password");
            return ERROR;
        }
    }

    public String logout() {
        session.remove("userId");
        session.remove("username");
        session.remove("logged");
        session.clear();
        addActionMessage("You Have Been Successfully Logged Out");
        return SUCCESS;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}