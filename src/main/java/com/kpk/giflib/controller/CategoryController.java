package com.kpk.giflib.controller;

import com.kpk.giflib.data.CategoryRepository;
import com.kpk.giflib.data.GifRepository;
import com.kpk.giflib.model.Category;
import com.kpk.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by krasimir.karamazov on 3/10/2017.
 */

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categopries")
    public String getCategories(ModelMap modelMap) {
        final List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("category/{id}")
    public String getCategoryWithName(@PathVariable int categoryId,  ModelMap modelMap) {
        final Category category = categoryRepository.getCategoryById(categoryId);
        modelMap.put("category", category);
        final List<Gif> gifsByCategory = gifRepository.getAllGifsByCategoryId(categoryId);
        modelMap.put("gifs_by_category", gifsByCategory);
        return "category";
    }
}
