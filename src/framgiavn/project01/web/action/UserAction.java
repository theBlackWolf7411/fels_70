package framgiavn.project01.web.action;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.model.User;

public class UserAction extends ActionSupport {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    // private Logit2 log = Logit2.getInstance(UserAction.class);

    private UserBusiness userBusiness = null;
    private User user = null;
    private List<User> users = new ArrayList<User>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setUserBusiness(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String findByUserId() {
        try {
            user = userBusiness.findByUserId(user.getUserId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String showAllUser() {
        try {
            users = userBusiness.selectAllUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String homePage() {
        return SUCCESS;
    }

}