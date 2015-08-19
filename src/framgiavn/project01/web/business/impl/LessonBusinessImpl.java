package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.LessonBusiness;
import framgiavn.project01.web.dao.LessonDAO;
import framgiavn.project01.web.model.Lesson;

public class LessonBusinessImpl implements LessonBusiness {
    private LessonDAO lessonDAO;

    public LessonDAO getLessonDAO() {
        return lessonDAO;
    }

    public void setLessonDAO(LessonDAO lessonDAO) {
        this.lessonDAO = lessonDAO;
    }

    @Override
    public Lesson findLesson(int lessonId) throws Exception {
        try {
            return getLessonDAO().findLesson(lessonId);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Lesson> selectAllLesson() throws Exception {
        try {
            return getLessonDAO().selectAllLesson();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void create(Lesson lesson) throws Exception {
        try {
            getLessonDAO().create(lesson);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Lesson lesson) throws Exception {
        try {
            getLessonDAO().update(lesson);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void destroy(Lesson lesson) throws Exception {
        try {
            getLessonDAO().destroy(lesson);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
