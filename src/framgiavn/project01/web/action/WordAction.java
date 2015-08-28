package framgiavn.project01.web.action;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.WordBusiness;
import framgiavn.project01.web.model.Word;

public class WordAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private WordBusiness wordBusiness;
	private Word word;
	private List<Word> words = new ArrayList<Word>();
	private InputStream fileInputStream;

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public Word getWord() {
		return word;
	}

	public void setWord(Word word) {
		this.word = word;
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	public void setWordBusiness(WordBusiness wordBusiness) {
		this.wordBusiness = wordBusiness;
	}

	public String index() {
		try {
			words = wordBusiness.selectAllWord();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String show() {
		try {
			word = wordBusiness.findWord(word.getWordId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String exportDBToExcelFile() {
		try {
			String filePath = "/home/wolffyzz/workspace_ee/test_upload/downloadFile.xls";
			wordBusiness.exportDBToExcelFile(filePath);
			
			fileInputStream = new FileInputStream(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
