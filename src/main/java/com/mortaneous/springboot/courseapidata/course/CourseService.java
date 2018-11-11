package com.mortaneous.springboot.courseapidata.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	/* Create */
	/* Update */
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	/* Read */
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	/* Read (All) */
	public List<Course> getAllCourses() {
		List<Course> allCourses = new ArrayList<>();
		courseRepository.findAll().forEach(allCourses::add);
		return allCourses;
	}

	/* Delete */
	public Course deleteCourse(String id) {

		Course course = courseRepository.findById(id).get();
		courseRepository.delete(course);

		return course;
	}

}
