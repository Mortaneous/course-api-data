package com.mortaneous.springboot.courseapidata.topic;

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
@RequestMapping("/topics")
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@PostMapping
	public Topic createTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}

	@GetMapping("/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PutMapping("/{id}")
	public Topic updateTopic(@PathVariable String id, @RequestBody Topic topic) {
		topic.setId(id);
		return topicService.addTopic(topic);
	}
	
	@DeleteMapping("/{id}")
	public Topic deleteTopic(@PathVariable String id) {
		return topicService.deleteTopic(id);
	}
}
