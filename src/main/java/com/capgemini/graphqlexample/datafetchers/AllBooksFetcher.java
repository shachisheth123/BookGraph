package com.capgemini.graphqlexample.datafetchers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.graphqlexample.entity.Book;
import com.capgemini.graphqlexample.service.BookService;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class AllBooksFetcher implements DataFetcher<List<Book>> {

	@Autowired
	BookService bookService;

	@Override
	public List<Book> get(DataFetchingEnvironment environment) {

		return bookService.findAllBooks();
	}

}
