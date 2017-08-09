package com.example.demo.course;

import com.example.demo.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhaojunjie on 5/8/17.
 */


@RestController
public class CourseController {

    @Autowired
    private CourseService mTopicService;


    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getTopicById(@PathVariable String topicId){
        return mTopicService.getCourseByTopicId(topicId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addTopic(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        mTopicService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}")
    public void updateTopic(@RequestBody Course course, @PathVariable String topicId, @PathVariable String courseId) {
        course.setTopic(new Topic(topicId,"",""));
        mTopicService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{topicId}/courses/{id}")
    public void deleteTopic(@PathVariable String id) {
        mTopicService.deleteCourse(id);
    }


}
