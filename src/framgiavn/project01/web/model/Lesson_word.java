package framgiavn.project01.web.model;

import java.io.Serializable;

public class Lesson_word implements Serializable {
    private int lessonId;
    private int wordId;

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getWordId() {
        return wordId;
    }

    public void setWordId(int wordId) {
        this.wordId = wordId;
    }
}
