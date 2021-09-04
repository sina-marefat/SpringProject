package ir.tutorial.topic;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Stream;

@Service
public class TopicService {

    private List<Topic>  topics = new ArrayList<Topic>(Arrays.asList(new Topic("java","12","here")));
    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(String id){
        try {
            return topics.stream().filter(topic -> topic.getId().equals(id.toLowerCase(Locale.ROOT))).findFirst().get();
        } catch (Exception e ){
            return null;
        }
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        try {
            topics.set(topics.indexOf(topics.stream().filter
                    (tp -> tp.getId().equals(id.toLowerCase(Locale.ROOT))).findFirst().get()),topic
            );
        } catch (NullPointerException e){
            return;
        }
    }

    public void deleteTopic(String id){
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
