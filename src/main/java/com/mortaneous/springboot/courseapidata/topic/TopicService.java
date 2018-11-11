package com.mortaneous.springboot.courseapidata.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	/* Create */
	/* Update */
	public Topic addTopic(Topic topic) {
		return topicRepository.save(topic);
	}

	/* Read */
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	/* Read (All) */
	public List<Topic> getAllTopics() {
		List<Topic> allTopics = new ArrayList<>();
		topicRepository.findAll().forEach(allTopics::add);
		return allTopics;
	}

	/* Delete */
	public Topic deleteTopic(String id) {

		Topic topic = topicRepository.findById(id).get();
		topicRepository.delete(topic);

		return topic;
	}

}
