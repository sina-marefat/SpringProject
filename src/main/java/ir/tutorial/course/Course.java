package ir.tutorial.course;

import ir.tutorial.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String id;

    private String name;

    private String description;

    @ManyToOne
    private Topic topic;

    public Course(String name, String id, String description , String topicId) {
        this.name = name;
        this.id = id;
        this.description = description;
        topic = new Topic(topicId,"","");
    }

    public Course() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
