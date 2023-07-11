package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.LessonRepository;

@Service
public  class TrainerServiceImplementation implements TrainerService
{
	@Autowired
	CourseRepository cr;
	@Autowired
	LessonRepository lr;
	@Override
	public String addCourse(Course c)
	{
		cr.save(c);
		return "course added successfully....!";
	}
	
	@Override
	public Course getCourse(long courseId)
	{
		

		return cr.getById(courseId);
	}

	@Override
	public String addLesson(Lesson ls) 
	{ 
          System.out.println(lr.save(ls));
		  return "lesson added successfully...!";
	}
	
    @Override
	public List<Course> getCourses() 
	{
	List<Course> cl	=cr.findAll();
	return cl;
	}
   @Override
	public void saveCourse(Course cs)
	{
	
		cr.save(cs);
	}

	
	

	

}
