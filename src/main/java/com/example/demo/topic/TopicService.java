package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by zhaojunjie on 5/8/17.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository mTopicRepository;

    public List<Topic> getTopics () {
        return (List<Topic>) mTopicRepository.findAll();
    }

    public Topic getTopicById(String id) {
        return mTopicRepository.findOne(id);
    }

    public void addTopic(Topic topic){
        mTopicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        mTopicRepository.delete(id);
    }

    public void updateTopic(Topic topic) {
        mTopicRepository.save(topic);
    }
}
