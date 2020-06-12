package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TopicController {
	@Autowired
	private TopicServics topicService;
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() { //method 
		//return"all topics";//return object
	return topicService.getAllTopics(); 
			//Arrays.asList(
//				new Topic("spring","Spring Framework","Spring Framework Description"),
//				new Topic("abc","abc Framework","abc Framework Description"),
//				new Topic("spring","Spring Framework","Spring Framework Description")
//				);

}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
}
	@RequestMapping(method=RequestMethod.POST. value ="/topics/{id}")
	public void addTopic(@RequestBody Topic topic) {                 //new method same class
		topicService.addTopic(topic);
	}
}
