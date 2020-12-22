package com.finda.demott.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CoursesService {
    public CoursesService(){}
    @Autowired
    CourseRepository repository;
   // List<TopicModel> topicsList;
    public ArrayList<CourseModel> getAllCourses(String topicId){

        //Return list of courses
         ArrayList<CourseModel> arrayList = new ArrayList<>();
         Iterable<CourseModel> allCourses = repository.findAll();
         //1. Get all courses
        //2. Add course to arrayList if its topic matches the one given
            for (CourseModel course: allCourses
                 ) {
                if (course.getTopic().equals(topicId)){
                    arrayList.add(course);
                }
            }
            return arrayList;

    }

    public CourseModel getOneCourse(String topicId, String courseId){

        // Get all courses for the given topic then filter by the course id
        ArrayList<CourseModel> coursesForTopicArrayList = new ArrayList<>();
        CourseModel courseByCourseId;
        for (CourseModel course: repository.findAll()
             ) {
            if (course.getTopic().equals(topicId)){
                coursesForTopicArrayList.add(course);
            }
        }
         courseByCourseId = coursesForTopicArrayList.stream().filter(courseModel ->courseModel.getId().equals(courseId)).findFirst().get();

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
