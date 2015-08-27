package framgiavn.project01.web.business.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.dao.FileDAO;
import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.model.User;

public class UserBusinessImpl implements UserBusiness {

    private UserDAO userDAO;
    private FileDAO fileDAO;

    public FileDAO getFileDAO() {
        return fileDAO;
    }

    public void setFileDAO(FileDAO fileDAO) {
        this.fileDAO = fileDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findUser(Integer userId) throws Exception {
        try {
            return getUserDAO().findUser(userId);
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
    public void create(User user, File avatar) throws Exception {
        try {
            getUserDAO().create(user);
            if (avatar != null) {
                user.setAvatar("User" + user.getUserId() + ".jpg");
                getFileDAO().saveImage(avatar, user.getAvatar());
                getUserDAO().update(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(User user, File avatar) throws Exception {
        try {
            if (avatar != null) {
                user.setAvatar("User" + user.getUserId() + ".jpg");
                getFileDAO().saveImage(avatar, user.getAvatar());
            }
            getUserDAO().update(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void destroy(User user) throws Exception {
        try {
            getUserDAO().destroy(user);
            getFileDAO().deleteImage(user.getAvatar());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}