package framgiavn.project01.web.action.admin;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.CategoryBusiness;
import framgiavn.project01.web.model.Category;

public class CategoryAction extends ActionSupport {
    private CategoryBusiness categoryBusiness = null;
    private Category category = null;
    private List<Category> categories = new ArrayList<Category>();

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setCategoryBusiness(CategoryBusiness categoryBusiness) {
        this.categoryBusiness = categoryBusiness;
    }

    public String index() {
        try {
            categories = categoryBusiness.selectAllUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String show() {
        try {
            category = categoryBusiness.findByCategoryId(category
                    .getCategoryId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String newCategory() {
        return SUCCESS;
    }

    public String create() {
        try {
            categoryBusiness.create(category);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String edit() {
        try {
            category = categoryBusiness.findByCategoryId(category
                    .getCategoryId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String update() {
        try {
            categoryBusiness.update(category);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public String destroy() {
        try {
            categoryBusiness.destroy(category);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
