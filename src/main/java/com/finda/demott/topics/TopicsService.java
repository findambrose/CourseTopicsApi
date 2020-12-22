package com.finda.demott.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicsService {
    public TopicsService(){}
    @Autowired
    TopicRepository repository;
   // List<TopicModel> topicsList;
    public ArrayList<TopicModel> getAllTopics(){

        //return list of topics
        ArrayList<TopicModel> arrayList = new ArrayList<>();
        repository.findAll().forEach(topic->arrayList.add(topic));
        return arrayList;
    }

    public TopicModel getOneTopic(String id){

        return  repository.findById(id).get();
    }
    public void addTopic(TopicModel topic){
        repository.save(topic);
    }

    public void updateTopic(TopicModel topic){
        repository.save(topic);

    }
    public void deleteTopic(String id){
        repository.deleteById(id);
    }
}
