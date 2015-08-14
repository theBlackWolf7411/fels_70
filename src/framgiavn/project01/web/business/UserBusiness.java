package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.User;

public interface UserBusiness {
    public User show(Integer userId) throws Exception;

    public User login(String username, String password) throws Exception;

    public List<User> index() throws Exception;
}