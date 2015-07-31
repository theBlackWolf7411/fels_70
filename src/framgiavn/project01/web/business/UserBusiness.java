package framgiavn.project01.web.business;

import framgiavn.project01.web.model.User;

public interface UserBusiness {
    public User findByUserId(Integer user_id) throws Exception;

    public User login(String username, String password) throws Exception;
}