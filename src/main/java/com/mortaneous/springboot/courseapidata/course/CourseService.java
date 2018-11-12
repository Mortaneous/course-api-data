package com.mortaneous.springboot.courseapidata.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortaneous.springboot.courseapidata.topic.Topic;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	/* Create */
	/* Update */
	public Course addCourse(String topicId, Course course) {
		course.setTopic(new Topic(topicId, "", ""));
		return courseRepository.save(course);
	}

	/* Read */
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	/* Read (All) */
	public List<Course> getAllTopicCourses(String topicId) {
		List<Course> allTopicCourses = new ArrayList<>();
		
		courseRepository.findByTopicId(topicId)
			.forEach(allTopicCourses::add);

		return allTopicCourses;
	}

	/* Delete */
	public Course deleteCourse(String id) {

		Course course = courseRepository.findById(id).get();
		courseRepository.delete(course);

		return course;
	}

}
