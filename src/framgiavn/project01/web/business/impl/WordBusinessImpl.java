package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.WordBusiness;
import framgiavn.project01.web.dao.FileDAO;
import framgiavn.project01.web.dao.WordDAO;
import framgiavn.project01.web.model.Word;

public class WordBusinessImpl implements WordBusiness {
	private WordDAO wordDAO;
	private FileDAO fileDAO;

	public WordDAO getWordDAO() {
		return wordDAO;
	}

	public void setWordDAO(WordDAO wordDAO) {
		this.wordDAO = wordDAO;
	}

	public FileDAO getFileDAO() {
		return fileDAO;
	}

	public void setFileDAO(FileDAO fileDAO) {
		this.fileDAO = fileDAO;
	}

	@Override
	public List<Word> selectAllWord() throws Exception {
		try {
			return getWordDAO().selectAllWord();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public Word findWord(int wordId) throws Exception {
		try {
			return getWordDAO().findWord(wordId);
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

	@Override
	public void exportDBToExcelFile(String filePath)
			throws Exception {
		try {
			getFileDAO().exportDBToExcelFile(filePath);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void importDBFromExcelFile(String filePath) throws Exception {
		// TODO Auto-generated method stub
		try {
			getFileDAO().importDBFromExcelFile(filePath);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
