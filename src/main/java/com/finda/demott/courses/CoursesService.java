package com.finda.demott.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CoursesService {
    public CoursesService(){}
    @Autowired
    CourseRepository repository;
   // List<Topic> topicsList;
    public ArrayList<CourseModel> getAllCourses(String topicId){

      //Return list of courses
        ArrayList<CourseModel> arrayList = new ArrayList<>();
        repository.findByTopicId(topicId).forEach(topic->arrayList.add(topic));
        return  arrayList;

    }

    public CourseModel getOneCourse(String courseId){

        CourseModel courseByCourseId = repository.findById(courseId).get();
        return courseByCourseId;

    }
    public void addCourse(CourseModel course){
        repository.save(course);
    }

    public void updateCourse(CourseModel course){
        repository.save(course);

    }
    public void deleteCourse(String id){
        repository.deleteById(id);
    }
}
