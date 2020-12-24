package com.finda.demott.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    String id;
    String name;
    String description;


    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public Topic(){};
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
