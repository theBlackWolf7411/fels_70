package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.Word;

public interface WordBusiness {

    List<Word> index() throws Exception;

    Word show(int wordId) throws Exception;

    void create(Word word) throws Exception;

    void update(Word word) throws Exception;

    void destroy(Word word) throws Exception;

}
