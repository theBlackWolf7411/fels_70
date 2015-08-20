package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.Lesson;

public interface LessonDAO {
    public Lesson findLesson(int lessonId) throws Exception;

    public List<Lesson> selectAllLesson() throws Exception;

    public void create(Lesson lesson) throws Exception;

    public void update(Lesson lesson) throws Exception;

    public void destroy(Lesson lesson) throws Exception;
}
