package com.app.entities;

import javax.persistence.*;


@Entity
@Table(name="categories")
public class Categaries {

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 20)
	private String description;
	@Column(length = 10 )
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Categaries [id=" + id + ", description=" + description + ", name=" + name + "]";
	}

	public Categaries( String description, String name) {
		super();
		this.description = description;
		this.name = name;
	}

}
