package framgiavn.project01.web.model;

import java.io.Serializable;
import java.util.List;

public class Word implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int wordId;
	private Category category;
	private String wordContent;
	private String audio;
//	private String answer;
	private List<Answer> answers;

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public int getWordId() {
		return wordId;
	}

	public void setWordId(int wordId) {
		this.wordId = wordId;
	}

	public String getWordContent() {
		return wordContent;
	}

	public void setWordContent(String wordContent) {
		this.wordContent = wordContent;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getAnswerContent() {
		for (int i = 0; i < getAnswers().size(); i++) {
			Answer temp_answer = getAnswers().get(i);
			if (temp_answer.getIsCorrect())
				return temp_answer.getAnswerContent();
		}
		return null;
	}
}
