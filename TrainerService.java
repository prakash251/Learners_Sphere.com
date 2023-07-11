package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;

public interface TrainerService 
{

public String addCourse(Course c);


public String addLesson(Lesson ls);

public List<Course> getCourses();

public Course getCourse(long courseId);

public void saveCourse(Course cs);

}
