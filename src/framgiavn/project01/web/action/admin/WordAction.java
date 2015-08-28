package framgiavn.project01.web.action.admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.CategoryBusiness;
import framgiavn.project01.web.business.WordBusiness;
import framgiavn.project01.web.model.Answer;
import framgiavn.project01.web.model.Category;
import framgiavn.project01.web.model.Word;

public class WordAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private WordBusiness wordBusiness;
	private CategoryBusiness categoryBusiness = null;
	private Word word;
	private List<Word> words = new ArrayList<Word>();
	private List<Category> categories = new ArrayList<Category>();

	private File excelUploadedFile;
	private String excelUploadedFileContentType;
	private String excelUploadedFileFileName;

	private InputStream fileInputStream;

	public InputStream getFileInputStream() {
		return fileInputStream;
	}
	
	public void setCategoryBusiness(CategoryBusiness categoryBusiness) {
		this.categoryBusiness = categoryBusiness;
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

	public File getExcelUploadedFile() {
		return excelUploadedFile;
	}

	public void setExcelUploadedFile(File excelUploadedFile) {
		this.excelUploadedFile = excelUploadedFile;
	}

	public String getExcelUploadedFileContentType() {
		return excelUploadedFileContentType;
	}

	public void setExcelUploadedFileContentType(
			String excelUploadedFileContentType) {
		this.excelUploadedFileContentType = excelUploadedFileContentType;
	}

	public String getExcelUploadedFileFileName() {
		return excelUploadedFileFileName;
	}

	public void setExcelUploadedFileFileName(String excelUploadedFileFileName) {
		this.excelUploadedFileFileName = excelUploadedFileFileName;
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

	public String newWord() {
		try {
			word = new Word();
			List<Answer> answers = new ArrayList<>();
			answers.add(null);
			answers.add(null);
			answers.add(null);
			answers.add(null);
			word.setAnswers(answers);
			categories = categoryBusiness.selectAllCategory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String create() {
		try {
			wordBusiness.create(word);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String edit() {
		try {
			word = wordBusiness.findWord(word.getWordId());
			categories = categoryBusiness.selectAllCategory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String update() {
		try {
			wordBusiness.update(word);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String destroy() {
		try {
			wordBusiness.destroy(word);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String uploadExcelFile() {
		try {
			String fileUrl = "/home/wolffyzz/workspace_ee/test_upload";
			System.out.println("File path stored in server : " + fileUrl);
			System.out.println("File = " + excelUploadedFile);
			System.out.println("Filename = " + excelUploadedFileFileName);
			
			File tempFile = new File(fileUrl, "test.xls");
			
			FileUtils.copyFile(excelUploadedFile, tempFile);
			
			String filePath = fileUrl + "/test.xls";
			wordBusiness.importDBFromExcelFile(filePath);

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

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
}
