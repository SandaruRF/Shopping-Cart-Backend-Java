package com.projects.springshop.service.category;

import com.projects.springshop.model.Category;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updatecategory(Category category, Long id);
    void deleteCategoryById(Long id);
}
