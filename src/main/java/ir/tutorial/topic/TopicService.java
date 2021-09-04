package ir.tutorial.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class TopicService {

    private List<Topic>  topics = Arrays.asList(new Topic("JAVA","12","JAVA TUTORIAL"),
                new Topic("Spring","14","SPRING FULL COURSE"));

    public List<Topic> getAllTopics() {
        return topics;
    }
}
