package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.Category;

public interface CategoryBusiness {
    public Category show(int categoryId) throws Exception;

    public List<Category> index() throws Exception;

    public void create(Category category) throws Exception;

    public void update(Category category) throws Exception;

    public void destroy(Category category) throws Exception;
}
