package com.example.demo.collection;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;

@Data
@Builder
@Document(collection = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {

	@Id
	private String personId;
	private String firstName;
	private String lastName;
	private Integer age;
	private List<String> hobbies;
	private List<Address> addresses;
}
