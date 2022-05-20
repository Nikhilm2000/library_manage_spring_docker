package com.demo.librarymanagementsystem.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;


import com.demo.librarymanagementsystem.entity.Book;
import com.demo.librarymanagementsystem.entity.Category;
import com.demo.librarymanagementsystem.exception.NotFoundException;

import com.demo.librarymanagementsystem.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Override
	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findCategoryById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}
