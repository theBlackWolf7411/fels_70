package framgiavn.project01.web.model;

import java.io.Serializable;

public class Lesson implements Serializable {
    private static final long serialVersionUID = 1L;
    private int lessonId;
    private int categoryId;
    private int userId;
    private int result;

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
