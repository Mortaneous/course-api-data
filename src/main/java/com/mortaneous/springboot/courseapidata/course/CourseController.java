package com.mortaneous.springboot.courseapidata.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}

	@PostMapping
	public Course createCourses(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

	@GetMapping("/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@PutMapping("/{id}")
	public Course updateCourse(@PathVariable String id, @RequestBody Course course) {
		course.setId(id);
		return courseService.addCourse(course);
	}
	
	@DeleteMapping("/{id}")
	public Course deleteCourse(@PathVariable String id) {
		return courseService.deleteCourse(id);
	}
}
