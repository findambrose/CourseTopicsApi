package com.finda.demott.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsController {
    @Autowired
    TopicsService topicsService;

  //Index. About
    @GetMapping("/")
    public String index(){
        return "This is a demo project";
    }

    //Get All
    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicsService.getAllTopics();
    }

    //Get One
    @GetMapping("/topics/{id}")
    public Topic getOneTopic(@PathVariable String id){
         return topicsService.getOneTopic(id);
    }

    //Add topic
    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic){
        topicsService.addTopic(topic);
    }
    //Update Topic
    @PutMapping("/topics/update")
    public void updateTopic(@RequestBody Topic topic){
        topicsService.updateTopic(topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
    topicsService.deleteTopic(id);

    }

}
