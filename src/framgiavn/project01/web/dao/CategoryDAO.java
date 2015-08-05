package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.Category;

public interface CategoryDAO {
    Category findByCategoryId(int categoryId);

    List<Category> selectAllUser();

    void create(Category category);

    void update(Category category);

    void destroy(Category category);
}
