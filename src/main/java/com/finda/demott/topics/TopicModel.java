package com.finda.demott.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicModel {

    @Id
    String id;
    String name;
    String description;


    public TopicModel(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public TopicModel(){};
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
