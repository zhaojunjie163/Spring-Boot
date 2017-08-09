package com.example.demo.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by zhaojunjie on 9/8/17.
 */

/**
 * you only need to declare interface, spring data JPA will provide implementation for you
 */


@Repository
public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);

}
