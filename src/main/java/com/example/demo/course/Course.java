package com.example.demo.course;

import com.example.demo.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by zhaojunjie on 5/8/17.
 */


/**
 * An instance of this object is one row in database
 *
 * you need to tell JPA that:
 * 1. instance
 * 2. primary key
 *
 */
@Entity
public class Course {

    @Id
    public String id;
    public String name;
    public String description;



    @ManyToOne
    Topic topic;

    /**
     * Have to have an empty construtor which will be using by JPA
     */
    public Course() {
    }

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic mTopic) {
        this.topic = mTopic;
    }

}
