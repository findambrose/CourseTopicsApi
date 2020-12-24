package com.finda.demott.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopicsService {
    public TopicsService(){}
    @Autowired
    TopicRepository repository;
   // List<Topic> topicsList;
    public ArrayList<Topic> getAllTopics(){

        //return list of topics
        ArrayList<Topic> arrayList = new ArrayList<>();
        repository.findAll().forEach(topic->arrayList.add(topic));
        return arrayList;
    }

    public Topic getOneTopic(String id){

        return  repository.findById(id).get();
    }
    public void addTopic(Topic topic){
        repository.save(topic);
    }

    public void updateTopic(Topic topic){
        repository.save(topic);

    }
    public void deleteTopic(String id){
        repository.deleteById(id);
    }
}
