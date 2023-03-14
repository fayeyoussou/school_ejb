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

import lombok.Data;


@Entity
@Table(name = "years")
@Data
public class Year implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true,length = 10,nullable = false)
	private String name;
	@OneToMany(mappedBy = "year",fetch = FetchType.EAGER)
	private List<Inscription> inscriptions;
}
