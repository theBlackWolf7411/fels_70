package framgiavn.project01.web.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.WordDAO;
import framgiavn.project01.web.model.Answer;
import framgiavn.project01.web.model.Word;
import framgiavn.project01.web.ulti.Logit2;

public class WordDAOImpl extends HibernateDaoSupport implements WordDAO {
    private static final Logit2 log = Logit2.getInstance(WordDAOImpl.class);

    @Override
    public Word show(int wordId) {
        return show(wordId, false);
    }

    public Word show(int wordId, boolean lock) {
        try {
            Query query = getSession().getNamedQuery("Word.SelectWordByWordId");
            if (lock)
                query.setLockMode("Word", LockMode.UPGRADE);
            query.setParameter("wordId", wordId);
            return (Word) query.uniqueResult();
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public void create(Word word) {
        try {
            for (Answer answer : word.getAnswers()) {
                answer.setWord(word);
            }
            getHibernateTemplate().save(word);
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public void update(Word word) {
        try {
            for (Answer answer : word.getAnswers()) {
                answer.setWord(word);
            }
            getHibernateTemplate().update(word);
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public void destroy(Word word) {
        try {
            getHibernateTemplate().delete(word);
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    @Override
    public List<Word> index() {
        try {
            return getSession().getNamedQuery("Word.SelectAllWord").list();
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
