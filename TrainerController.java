package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.service.TrainerService;

@Controller
public class TrainerController 
{
	@Autowired
	TrainerService ts;

	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("courseId")long courseId,
			@RequestParam("courseName")String courseName,
			@RequestParam("coursePrice")int coursePrice)
	{
		System.out.println(courseId+" "+courseName+" "+coursePrice);
		Course c=new Course();
		c.setCourseId(courseId);
		c.setCourseName(courseName);
		c.setCoursePrice(coursePrice);

		String msg=ts.addCourse(c);
		System.out.println(msg);
		return "redirect:/createcourse";

	}

	@PostMapping("/lessons")	
	public String addlession(@RequestParam("courseId")long courseId,
			@RequestParam("lessonId")long lessonId,
			@RequestParam("lessonName")String lessonName,
			@RequestParam("topics")String topics,
			@RequestParam("link")String link)
	{
		Course cs=ts.getCourse(courseId);
		Lesson	ls=new Lesson(lessonId,lessonName,topics,link,cs);
		String msg=ts.addLesson(ls);
	    List<Lesson> s=cs.getLessons();
	        s.add(ls);
	        cs.setLessons(s);
	       ts.saveCourse(cs);
	       
	        
	     	
		return "redirect:/addlesson";

	}
	@GetMapping("/viewcourse")
	public String viewcourse(Model m)
	{
		List<Course> cs=ts.getCourses();
		System.out.println(cs);
		m.addAttribute("course",cs);
	    return "viewcourse";
		
	}
	
	@GetMapping("/buycourse1")
	public String buycourse(Model m)
	{
		List<Course> cs=ts.getCourses();
		System.out.println(cs);
		
		m.addAttribute("course",cs);
	    return "buycourse";
		
	}

}
