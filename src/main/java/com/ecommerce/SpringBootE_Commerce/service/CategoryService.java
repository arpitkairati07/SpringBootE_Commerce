package com.ecommerce.SpringBootE_Commerce.service;

import com.ecommerce.SpringBootE_Commerce.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();
    void createCategory(Category category);
}
