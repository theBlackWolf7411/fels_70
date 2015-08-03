package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.User;

public interface UserDAO {
    public User findByUserId(Integer userId) throws Exception;

    public User findByUsername(String username) throws Exception;

    public List<User> selectAllUser();
}