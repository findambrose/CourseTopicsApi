package com.finda.demott.courses;

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

    //Get One Course in a given topic given the id
    @GetMapping("/topics/{topicId}/courses/{courseId}")
    public CourseModel getOneTopic(@PathVariable String topicId, @PathVariable String courseId){
         return coursesService.getOneCourse(topicId, courseId);
    }

    //Add course to courses
    @PostMapping("/courses")
    public void addCourse(@RequestBody CourseModel course){
        coursesService.addCourse(course);
    }
    //Update Course
    @PutMapping("/courses/update")
    public void updateCourse(@RequestBody CourseModel course){
        coursesService.updateCourse(course);
    }

        //Delete course
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        coursesService.deleteCourse(id);

    }

}
