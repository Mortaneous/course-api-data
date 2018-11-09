package com.mortaneous.springboot.courseapidata.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("java", "Java", "All about Java"),
			new Topic("cpp", "C++", "Everything C++"), new Topic("html", "HTML", "HTML pages")));
	
	/* Create */
	public Topic addTopic(Topic topic) {
		topics.add(topic);
		
		return topic;
	}

	/* Read */
	public Topic getTopic(String id) {
		return findTopic(id);
	}
	
	/* Read (All) */
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	/* Update */
	public Topic updateTopic(Topic topic) {
		Topic listTopic = findTopic(topic.getId());
		if(listTopic != null) {
			listTopic.setTitle(topic.getTitle())
					 .setDescription(topic.getDescription());
		}
		return listTopic;
	}
	
	/* Delete */
	public Topic deleteTopic(String id) {
		Topic topic = findTopic(id);
		if(topic != null) {
			topics.remove(topic);
		}
		
		return topic;
	}
	
	private Topic findTopic(String id) {
		return topics.stream().filter(
				(Topic t) -> id.equals(t.getId())
		).findFirst().get();
	}
}
