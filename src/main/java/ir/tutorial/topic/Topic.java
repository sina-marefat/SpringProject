package ir.tutorial.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Optional;

@Entity
public class Topic {

    @Id
    private String id;

    private String name;

    private String description;

    public Topic(String name, String id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public Topic() {
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
}
