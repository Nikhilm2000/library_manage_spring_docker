package com.demo.librarymanagementsystem.service.impl;

import java.util.List;



import org.springframework.stereotype.Service;


import com.demo.librarymanagementsystem.entity.Author;
import com.demo.librarymanagementsystem.entity.Book;
import com.demo.librarymanagementsystem.exception.NotFoundException;

import com.demo.librarymanagementsystem.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchBooks(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findBookById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}
