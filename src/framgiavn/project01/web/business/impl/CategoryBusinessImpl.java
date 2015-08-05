package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.CategoryBusiness;
import framgiavn.project01.web.dao.CategoryDAO;
import framgiavn.project01.web.model.Category;

public class CategoryBusinessImpl implements CategoryBusiness {
    private CategoryDAO categoryDAO;

    public CategoryDAO getCategoryDAO() {
        return categoryDAO;
    }

    public void setCategoryDAO(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    public Category findByCategoryId(int categoryId) {
        try {
            return getCategoryDAO().findByCategoryId(categoryId);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Category> selectAllUser() {
        try {
            return getCategoryDAO().selectAllUser();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void create(Category category) {
        try {
            getCategoryDAO().create(category);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Category category) {
        try {
            getCategoryDAO().update(category);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void destroy(Category category) {
        try {
            getCategoryDAO().destroy(category);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
