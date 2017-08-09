package com.example.demo.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaojunjie on 9/8/17.
 */

@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {


}
