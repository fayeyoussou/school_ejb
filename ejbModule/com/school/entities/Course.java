package com.school.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "courses")

@Data
public class Course implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true,length = 100)
	private String name;
	@OneToMany(mappedBy = "course",fetch = FetchType.EAGER)
	private List<Inscription> inscriptions;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	public Course(String name) {
		super();
		this.name = name;
	}
	public Course() {
		super();
	}
	
	
	
}
