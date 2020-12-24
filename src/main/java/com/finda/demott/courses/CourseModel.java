package com.finda.demott.courses;

import com.finda.demott.topics.Topic;
import com.sun.xml.bind.v2.TODO;

import javax.persistence.*;

@Entity
public class CourseModel {

    @Id
    String id;
    String name;
    String description;

    @ManyToOne(cascade = CascadeType.PERSIST) // Entity relationship to topic
     private Topic topic;

    public CourseModel(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic();
    }
    public  CourseModel(){};

    public String getId() {
        return id;
    }
    public void setTopic (Topic topic){
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Topic getTopic(){
        return  topic;
    }
}
