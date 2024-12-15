package com.furkanyanik.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
	
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	

	private Integer id;
	
	
	@Column(name = "first_Name",nullable = false)
	private String firstName;
	
	
	@Column(name = "last_Name", nullable = false)
	private String lastName;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
