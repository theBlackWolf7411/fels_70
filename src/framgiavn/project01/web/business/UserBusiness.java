package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.User;

public interface UserBusiness {
    public User findByUserId(Integer userId) throws Exception;

    public User login(String username, String password) throws Exception;
    
    public List<User> selectAllUser() throws Exception;
}