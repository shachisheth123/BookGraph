package com.capgemini.graphqlexample.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.graphqlexample.graphqlutilities.BookUtility;

import graphql.ExecutionResult;
import graphql.GraphQL;

@RestController
public class BookController {

	private GraphQL graphQL;

	private BookUtility bookUtility;

	@Autowired
	BookController(BookUtility bookUtility) throws IOException {
	        this.bookUtility = bookUtility;
	        graphQL = bookUtility.createGraphqlObject();
	    }

	@PostMapping(value = "/books")
	public ResponseEntity query(@RequestBody String query) {
		ExecutionResult result = graphQL.execute(query);
		return ResponseEntity.ok(result.getData());
	}
}
