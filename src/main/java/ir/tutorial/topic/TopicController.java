package ir.tutorial.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();

    }

    @RequestMapping("/topics/{id}")
    public Topic getDesiredTopic(@PathVariable String id){
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void addTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void addTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
