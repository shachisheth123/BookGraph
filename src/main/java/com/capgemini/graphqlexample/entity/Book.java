package com.capgemini.graphqlexample.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Book")
public class Book {

	private String bookType;
	private String bookName;
	private String bookAuthor;

	public Book(String bookType, String bookName, String bookAuthor) {
		super();
		this.bookType = bookType;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

}
