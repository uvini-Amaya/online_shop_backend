package com.shop.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.demo.entity.Category;

@Service
public interface CategoryService {
    List<Category> getAllCategories();
    Category findCategoryById(Long id);
    Category createCategory(Category category);
}