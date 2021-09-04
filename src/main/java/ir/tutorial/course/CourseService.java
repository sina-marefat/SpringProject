package ir.tutorial.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getAllCourses(String id) {
        List<Course> courses = new ArrayList<>();
        for (Course course : courseRepo.findAll()) {
            if(course.getId().equals(id)){
                courses.add(course);
            }
        }
        return courses;
    }

    public Course getCourseById(String id){
        Course course;
        if(courseRepo.findById(id).isPresent()){
            course = courseRepo.findById(id).get();
            return course;
        }
        return null;
    }

    public void addCourse(Course course){
        courseRepo.save(course);
    }

    public void updateCourse(Course course) {
        try {
            courseRepo.save(course);
        } catch (NullPointerException e){
            return;
        }
    }

    public void deleteTopic(String id){
        courseRepo.deleteById(id);
    }
}
