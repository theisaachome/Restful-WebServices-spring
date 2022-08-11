package com.pbc.student;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Student {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;
	private Address address;
	private List<String> favouriteSubject;
	private BigDecimal totalSpentInBooks;
	private LocalDateTime created;

	public Student(
			String firstName,
			String lastName,
			String email,
			Gender gender,
			Address address,
			List<String> favouriteSubject,
			BigDecimal totalSpentInBooks,
			LocalDateTime created) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.favouriteSubject = favouriteSubject;
		this.totalSpentInBooks = totalSpentInBooks;
		this.created = created;
	}

}
