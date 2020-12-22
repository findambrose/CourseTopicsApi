package com.finda.demott.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseModel {

    @Id
    String id;
    String name;
    String description;
    String topic; // foreign key from topics


    public CourseModel(String id, String name, String description, String topic) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = topic;
    }
    public  CourseModel(){};
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTopic(){
        return  topic;
    }
}
