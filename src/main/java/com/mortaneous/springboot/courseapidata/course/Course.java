package com.mortaneous.springboot.courseapidata.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private String id;
	private String title;
	private String description;

	public Course() {
	}

	public Course(String id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public Course setId(String id) {
		this.id = id;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Course setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Course setDescription(String description) {
		this.description = description;
		return this;
	}

}
