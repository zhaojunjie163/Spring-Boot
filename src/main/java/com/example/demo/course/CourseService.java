package com.example.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by zhaojunjie on 5/8/17.
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository mTopicRepository;

    public List<Course> getCourseByTopicId (String topicId) {
        return (List<Course>) mTopicRepository.findByTopicId(topicId);
    }

    public Course getCourseById(String id) {
        return mTopicRepository.findOne(id);
    }

    public void addCourse(Course course){
        mTopicRepository.save(course);
    }

    public void deleteCourse(String id) {
        mTopicRepository.delete(id);
    }

    public void updateCourse(Course course) {
        mTopicRepository.save(course);
    }
}
