package com.example.demo.topic;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhaojunjie on 5/8/17.
 */


@RestController
public class TopicController {

    @Autowired
    private TopicService mTopicService;

    @RequestMapping("/topics")
    public List<Topic> getListOfTopics(){
        return mTopicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id){
        return mTopicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        mTopicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics")
    public void updateTopic(@RequestBody Topic topic) {
        mTopicService.updateTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        mTopicService.deleteTopic(id);
    }


}
