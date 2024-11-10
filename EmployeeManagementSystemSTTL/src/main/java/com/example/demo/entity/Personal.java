package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "tblPersonalMaster")
public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "FirstName",nullable = false )
	private String fname;
	
	@Column(name = "LastName",nullable = false)
	private String lname;
	
	@Column(name = "BirthDate",nullable = false)
	private LocalDate birthDate;
	
	@Column(name = "Gender",nullable = false)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	

}
