package com.finda.demott.courses;

import com.finda.demott.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    CoursesService coursesService;

    //Get All Courses belonging to a particular topic
    @GetMapping("/topics/{topicId}/courses")
    public List<CourseModel> getAllTopics(@PathVariable String topicId){

        return coursesService.getAllCourses(topicId);
    }

    //Get One Course
    @GetMapping("topics/{topicId}/courses/{courseId}")
    public CourseModel getOneTopic(@PathVariable String courseId){
         return coursesService.getOneCourse(courseId);
    }

    //Add course to courses
    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody CourseModel course, @PathVariable String topicId){
        //use topic to create new topic object. Ex
        course.setTopic(new Topic(topicId, "", ""));
        coursesService.addCourse(course);
    }
    //Update Course
    @PutMapping("/topics/{topicId}/courses/{courseId}")
    public void updateCourse(@RequestBody CourseModel course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        coursesService.updateCourse(course);
    }

        //Delete course
    @RequestMapping(value = "/topics/{topicId}/courses/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id){
        coursesService.deleteCourse(id);

    }

}
