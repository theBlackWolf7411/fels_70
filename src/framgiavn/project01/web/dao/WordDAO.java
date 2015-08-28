package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.Word;

public interface WordDAO {

    public Word findWord(int wordId) throws Exception;

    public void create(Word word) throws Exception;

    public void update(Word word) throws Exception;

    public void destroy(Word word) throws Exception;

    public List<Word> selectAllWord() throws Exception;
    
}
