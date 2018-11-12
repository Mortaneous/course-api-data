package com.mortaneous.springboot.courseapidata.topic;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.mortaneous.springboot.courseapidata.course.Course;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String title;
	private String description;

	@OneToMany
	private List<Course> courses;
	
	public Topic() {
	}

	public Topic(String id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public Topic setId(String id) {
		this.id = id;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Topic setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Topic setDescription(String description) {
		this.description = description;
		return this;
	}

}
