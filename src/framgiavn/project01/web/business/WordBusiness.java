package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.Word;

public interface WordBusiness {

    public List<Word> index() throws Exception;

    public Word show(int wordId) throws Exception;

    public void create(Word word) throws Exception;

    public void update(Word word) throws Exception;

    public void destroy(Word word) throws Exception;

}
