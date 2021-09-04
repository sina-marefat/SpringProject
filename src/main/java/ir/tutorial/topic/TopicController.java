package ir.tutorial.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(new Topic("JAVA","12","JAVA TUTORIAL"),
                new Topic("Spring","14","SPRING FULL COURSE"));

    }
}
