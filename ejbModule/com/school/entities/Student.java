package com.school.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "students")
@Data
public class Student implements Serializable {
	
	private static final long serialVersionUID = 2771287630848143516L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	@Column(nullable = false)
	private String phone;
	@OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
	private List<Inscription> inscriptions;


}
