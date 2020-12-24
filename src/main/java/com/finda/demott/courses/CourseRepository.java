package com.finda.demott.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<CourseModel, String> {
    List<CourseModel> findByTopicId(String topicId);
}
