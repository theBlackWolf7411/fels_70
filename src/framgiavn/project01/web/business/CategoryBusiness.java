package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.Category;

public interface CategoryBusiness {
    public Category findCategory(int categoryId) throws Exception;

    public List<Category> selectAllCategory() throws Exception;

    public void create(Category category) throws Exception;

    public void update(Category category) throws Exception;

    public void destroy(Category category) throws Exception;
}
