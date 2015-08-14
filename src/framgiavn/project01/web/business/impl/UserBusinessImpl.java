package framgiavn.project01.web.business.impl;

import java.util.List;
import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.model.User;

public class UserBusinessImpl implements UserBusiness {

    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User show(Integer userId) throws Exception {
        try {
            return getUserDAO().show(userId);
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
    public List<User> index() throws Exception {
        try {
            return getUserDAO().index();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}