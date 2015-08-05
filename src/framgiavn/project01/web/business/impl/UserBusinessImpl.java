package framgiavn.project01.web.business.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.model.User;

public class UserBusinessImpl implements UserBusiness {

    private UserDAO userDAO;
    private Map<String, Object> session;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findByUserId(Integer userId) throws Exception {
        try {
            return getUserDAO().findByUserId(userId);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public User login(String username, String password) throws Exception {
        try {
            User user = getUserDAO().findByUsername(username);
            if (user != null && user.getPassword().equals(password))
                return user;
            else
                return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<User> selectAllUser() throws Exception {
        try {
            return getUserDAO().selectAllUser();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void accessSession() {
        session = ActionContext.getContext().getSession();
    }
}