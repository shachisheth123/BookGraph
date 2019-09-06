package com.capgemini.graphqlexample.graphqlutilities;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.capgemini.graphqlexample.datafetchers.AllBooksFetcher;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

@Component
public class BookUtility {

	@Value("classpath : Bookql.graphqls")
	private Resource resource;

	private GraphQL graphQl;
	
	@Autowired
	private AllBooksFetcher allBooksFetcher;


	@PostConstruct
	public GraphQL createGraphqlObject() throws IOException {

		File schemas = resource.getFile();
		TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schemas);
		RuntimeWiring wiring = buildRuntimeWiring();
		GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeRegistry , wiring);

		return GraphQL(schema);

	}

	private RuntimeWiring buildRuntimeWiring() {
		// TODO Auto-generated method stub
		return null;
	}

	private graphql.GraphQL GraphQL(GraphQLSchema schema) {
		// TODO Auto-generated method stub
		return null;
	}

//	public RuntimeWiring buildRuntimeWiring() {
//	
//
//		return buildRuntimeWiring().type(typeName: "Query" , typeWiring -> "typewiring".dataFetchers(fieldName : "books" , allBooksFetcher) ));
//	}

}
