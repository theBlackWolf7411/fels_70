package framgiavn.project01.web.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.LessonDAO;
import framgiavn.project01.web.model.Lesson;
import framgiavn.project01.web.ulti.Logit2;

public class LessonDAOImpl extends HibernateDaoSupport implements LessonDAO {
    private static final Logit2 log = Logit2.getInstance(LessonDAOImpl.class);

    @Override
    public Lesson findLesson(int lessonId) throws Exception {
        return findLesson(lessonId, false);
    }

    public Lesson findLesson(int lessonId, boolean lock) throws Exception {
        try {
            Query query = getSession().getNamedQuery(
                    "Lesson.SelectLessonByLessonId");
            if (lock)
                query.setLockMode("Lesson", LockMode.UPGRADE);
            query.setParameter("lessonId", lessonId);
            return (Lesson) query.uniqueResult();
        } catch (RuntimeException re) {
            log.error("show lesson get failed", re);
            throw re;
        }
    }

    @Override
    public List<Lesson> selectAllLesson() throws Exception {
        try {
            Query query = getSession().getNamedQuery("Lesson.SelectAllLesson");
            return query.list();
        } catch (RuntimeException re) {
            log.error("index lesson get failed", re);
            throw re;
        }
    }

    @Override
    public void create(Lesson lesson) throws Exception {
        try {
            getHibernateTemplate().save(lesson);
        } catch (RuntimeException re) {
            log.error("create lesson get failed", re);
        }
    }

    @Override
    public void update(Lesson lesson) throws Exception {
        try {
            getHibernateTemplate().update(lesson);
        } catch (RuntimeException re) {
            log.error("update lesson get failed", re);
        }
    }

    @Override
    public void destroy(Lesson lesson) throws Exception {
        try {
            getHibernateTemplate().delete(lesson);
        } catch (RuntimeException re) {
            log.error("destroy lesson get failed", re);
        }
    }

}