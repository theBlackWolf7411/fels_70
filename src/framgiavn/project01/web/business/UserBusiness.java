package framgiavn.project01.web.business;

import java.io.File;
import java.util.List;

import framgiavn.project01.web.model.User;

public interface UserBusiness {
    public User findUser(Integer userId) throws Exception;

    public User login(String username, String password) throws Exception;

    public List<User> selectAllUser() throws Exception;

    public void create(User user, File avatar) throws Exception;

    public void update(User user, File avatar) throws Exception;

    public void destroy(User user) throws Exception;
}