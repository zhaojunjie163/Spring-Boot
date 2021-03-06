package com.example.demo.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

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
public class Topic {

    @Id
    public String id;
    public String name;
    public String description;


    /**
     * Have to have an empty construtor which will be using by JPA
     */
    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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


}
