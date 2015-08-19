package framgiavn.project01.web.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.model.Answer;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.Logit2;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
    private static final Logit2 log = Logit2.getInstance(UserDAOImpl.class);
    public static final String NAME = "customerName";

    protected void initDAO() {
        // Do nothing
    }

    public User show(Integer userId) throws Exception {
        return show(userId, false);
    }

    public User show(Integer userId, boolean lock) throws Exception {
        try {
            Query query = getSession().getNamedQuery("User.SelectUserByUserId");
            if (lock)
                query.setLockMode("User", LockMode.UPGRADE);
            query.setParameter("userId", userId);
            return (User) query.uniqueResult();
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    public User findByUsername(String username) throws Exception {
        try {
            Query query = getSession().getNamedQuery("User.FindByUsername");
            query.setParameter("username", username);
            return (User) query.uniqueResult();
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    public List<User> index() {
        try {
            Query query = getSession().getNamedQuery("User.SelectAllUser");
            return query.list();
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public void create(User user) throws Exception {
        try {
            getHibernateTemplate().save(user);
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public void update(User user) throws Exception {
        try {
            getHibernateTemplate().update(user);
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public void destroy(User user) throws Exception {
        try {
            getHibernateTemplate().delete(user);
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}