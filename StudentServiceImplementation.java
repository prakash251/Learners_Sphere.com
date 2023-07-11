package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Lesson;
import com.example.demo.repository.LessonRepository;
@Service
public class StudentServiceImplementation implements StudentService
{
    @Autowired
	LessonRepository lr;

    @Override
	public Lesson getLesson(long lessonId) 
	{
		Lesson ls=lr.findById(lessonId).get();
		return ls;
	}
	
}
