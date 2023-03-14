package com.school.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name = "inscriptions")
@Data
public class Inscription implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String details;
	@ManyToOne(cascade = CascadeType.MERGE,fetch =FetchType.EAGER)
	@JoinColumn(name = "course_id")
	private Course course;
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name = "year_id")
	private Year year;
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name = "student_id")
	private Student student;
	
}
