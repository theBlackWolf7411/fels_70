package framgiavn.project01.web.dao;

import java.io.File;
import java.util.List;

import framgiavn.project01.web.model.User;

public interface UserDAO {
    public User findUser(Integer userId) throws Exception;

    public User findByUsername(String username) throws Exception;

    public List<User> selectAllUser() throws Exception;

    public void create(User user) throws Exception;

    public void update(User user) throws Exception;

    public void destroy(User user) throws Exception;
}