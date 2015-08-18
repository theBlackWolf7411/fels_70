package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.WordBusiness;
import framgiavn.project01.web.dao.WordDAO;
import framgiavn.project01.web.model.Word;

public class WordBusinessImpl implements WordBusiness {
    private WordDAO wordDAO;

    public WordDAO getWordDAO() {
        return wordDAO;
    }

    public void setWordDAO(WordDAO wordDAO) {
        this.wordDAO = wordDAO;
    }

    @Override
    public List<Word> index() throws Exception {
        try {
            return getWordDAO().index();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Word show(int wordId) throws Exception {
        try {
            return getWordDAO().show(wordId);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void create(Word word) throws Exception {
        try {
            getWordDAO().create(word);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Word word) throws Exception {
        try {
            getWordDAO().update(word);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void destroy(Word word) throws Exception {
        try {
            getWordDAO().destroy(word);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
