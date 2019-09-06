package com.capgemini.graphqlexample.dataloader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.graphqlexample.entity.Book;
import com.capgemini.graphqlexample.repository.BookRepository;

@Component
public class BookDataLoader {

	@Autowired
	BookRepository bookRepository;

	@PostConstruct
	public void generateData() {

		List<Book> books = new ArrayList<>();
		books.add(new Book("fiction" , "abc" , "abc"));
		books.add(new Book("novel" , "def" , "def"));
		bookRepository.saveAll(books);
	}

}
