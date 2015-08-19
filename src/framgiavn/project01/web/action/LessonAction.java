package framgiavn.project01.web.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.CategoryBusiness;
import framgiavn.project01.web.business.LessonBusiness;
import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.model.Answer;
import framgiavn.project01.web.model.Category;
import framgiavn.project01.web.model.Lesson;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.model.Word;

public class LessonAction extends ActionSupport {
    private LessonBusiness lessonBusiness = null;
    private CategoryBusiness categoryBusiness = null;
    private UserBusiness userBusiness = null;
    private Lesson lesson = null;
    private List<Lesson> lessons = new ArrayList<Lesson>();
    private List<Category> categories = new ArrayList<Category>();
    private List<User> users = new ArrayList<User>();

    public void setCategoryBusiness(CategoryBusiness categoryBusiness) {
        this.categoryBusiness = categoryBusiness;
    }

    public void setUserBusiness(UserBusiness userBusiness) {
        this.userBusiness = userBusiness;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void setLessonBusiness(LessonBusiness lessonBusiness) {
        this.lessonBusiness = lessonBusiness;
    }

    public String index() {
        try {
            lessons = lessonBusiness.selectAllLesson();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String show() {
        try {
            lesson = lessonBusiness.findLesson(lesson.getLessonId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String newLesson() {
        try {
            categories = categoryBusiness.selectAllCategory();
            users = userBusiness.selectAllUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String create() {
        try {
            lessonBusiness.create(lesson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String edit() {
        try {
            lesson = lessonBusiness.findLesson(lesson.getLessonId());
            categories = categoryBusiness.selectAllCategory();
            users = userBusiness.selectAllUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String update() {
        try {
            lessonBusiness.update(lesson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String destroy() {
        try {
            lessonBusiness.destroy(lessonBusiness.findLesson(lesson.getLessonId()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
