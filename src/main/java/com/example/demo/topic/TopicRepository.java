package com.example.demo.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaojunjie on 9/8/17.
 */

/**
 * you only need to declare interface, spring data JPA will provide implementation for you
 */


@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {


}
