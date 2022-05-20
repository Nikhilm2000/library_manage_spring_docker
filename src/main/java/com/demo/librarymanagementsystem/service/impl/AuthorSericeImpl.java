package com.demo.librarymanagementsystem.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.demo.librarymanagementsystem.entity.Author;
import com.demo.librarymanagementsystem.exception.NotFoundException;

import com.demo.librarymanagementsystem.service.AuthorService;


@Service
public class AuthorSericeImpl implements AuthorService {


	

	@Override
	public void createAuthor(Author author) {
		
	}

	@Override
	public void updateAuthor(Author author) {
	
	}

	@Override
	public void deleteAuthor(Long id) {
		
	}

	@Override
	public List<Author> findAllAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author findAuthorById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
//	@Override
//	public Page<Author> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
//		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
//			Sort.by(sortField).descending();
//		
//		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
//		return this.authorRepository.findAll(pageable);
//	}

}
