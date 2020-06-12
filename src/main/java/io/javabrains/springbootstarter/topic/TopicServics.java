package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServics {
	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("abc","abc Framework","abc Framework Description"),
			new Topic("def","def Framework","def Framework Description"),
			new Topic("ghi","ghi Framework","ghi Framework Description")
			));
public List<Topic> getAllTopics(){
	return topics;
}
public Topic getTopic(String id) {
	return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
}
public void addTopic(Topic topic) {
	topics.add(topic);
	
	
	
}
}
