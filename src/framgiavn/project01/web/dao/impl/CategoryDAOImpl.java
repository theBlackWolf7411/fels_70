package framgiavn.project01.web.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.CategoryDAO;
import framgiavn.project01.web.model.Category;
import framgiavn.project01.web.ulti.Logit2;

public class CategoryDAOImpl extends HibernateDaoSupport implements CategoryDAO {
    private static final Logit2 log = Logit2.getInstance(CategoryDAOImpl.class);

    @Override
    public Category findByCategoryId(int categoryId) {
        return findByCategoryId(categoryId, false);
    }

    public Category findByCategoryId(int categoryId, boolean lock) {
        try {
            Query query = getSession().getNamedQuery(
                    "Category.SelectCategoryByCategoryId");
            if (lock)
                query.setLockMode("User", LockMode.UPGRADE);
            query.setParameter("categoryId", categoryId);
            return (Category) query.uniqueResult();
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public List<Category> selectAllUser() {
        try {
            Query query = getSession().getNamedQuery(
                    "Category.SelectAllCategory");
            return query.list();
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public void create(Category category) {
        try {
            getHibernateTemplate().save(category);
        } catch (RuntimeException re) {
            log.error("get failed", re);
        }
    }

    @Override
    public void update(Category category) {
        try {
            getHibernateTemplate().update(category);
        } catch (RuntimeException re) {
            log.error("get failed", re);
        }
    }

    @Override
    public void destroy(Category category) {
        try {
            getHibernateTemplate().delete(category);
        } catch (RuntimeException re) {
            log.error("get failed", re);
        }
    }
}