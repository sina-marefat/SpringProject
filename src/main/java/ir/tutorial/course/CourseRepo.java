package ir.tutorial.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepo extends CrudRepository<Course,String> {
    public List<Course> findByTopicId(String topicId);

}
