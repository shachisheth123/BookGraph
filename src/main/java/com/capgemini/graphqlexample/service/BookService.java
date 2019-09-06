package com.capgemini.graphqlexample.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.graphqlexample.entity.Book;
import com.capgemini.graphqlexample.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	@PostConstruct
	public void initBooks() {

		List<Book> books = new ArrayList<>();

		books.add(new Book("fiction" , "abc" , "abc"));
		bookRepository.saveAll(books);

	}

	public List<Book> findAllBooks() {

		return bookRepository.findAll();
	}

}
