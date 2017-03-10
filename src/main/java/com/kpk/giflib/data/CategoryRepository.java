package com.kpk.giflib.data;

import com.kpk.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by krasimir.karamazov on 3/10/2017.
 */
@Component
public class CategoryRepository {
    private List<Category> categories;

    public CategoryRepository() {
        categories = Arrays.asList(new Category(0, "Technology"), new Category(1, "People"), new Category(2, "Destruction"));
    }


    public Category getCategoryByName(String categoryName) {
        for(Category category : categories) {
            if(category.getName().equalsIgnoreCase(categoryName)) {
                return category;
            }
        }

        return null;
    }

    public Category getCategoryById(int categoryId) {
        for(Category category : categories) {
            if(category.getId() == categoryId) {
                return category;
            }
        }

        return null;
    }

    public List<Category> getAllCategories() {
        return categories;
    }
}
