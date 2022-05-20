package com.demo.librarymanagementsystem.entity;

import java.util.HashSet;

import java.util.Set;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Category {


	private Long id;

	private String name;

	
	private Set<Book> books = new HashSet<Book>();

	public Category(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

}
