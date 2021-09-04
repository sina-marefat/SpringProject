package ir.tutorial.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Stream;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;

    private List<Topic>  topics = new ArrayList<Topic>(Arrays.asList(new Topic("java","12","here")));
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        for (Topic topic:topicRepo.findAll()) {
            topics.add(topic);
        }
        return topics;
    }

    public Topic getTopicById(String id){
        Topic topic;
        if(topicRepo.findById(id).isPresent()){
            topic=topicRepo.findById(id).get();
            return topic;
        }
        return null;
    }

    public void addTopic(Topic topic){
        topicRepo.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        try {
            topicRepo.save(topic);
        } catch (NullPointerException e){
            return;
        }
    }

    public void deleteTopic(String id){
        topicRepo.deleteById(id);
    }
}
