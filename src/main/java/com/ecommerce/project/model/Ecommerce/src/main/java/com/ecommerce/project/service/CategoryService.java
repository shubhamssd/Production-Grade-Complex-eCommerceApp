package com.ecommerce.project.service;

import com.ecommerce.project.exception.ResourceNotFoundException;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber,Integer pageSize, String sortBy, String sortOrder) ;
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId) throws ResourceNotFoundException;

    CategoryDTO updateCategory(Long categoryId, CategoryDTO categoryDTO) throws ResourceNotFoundException;
}
