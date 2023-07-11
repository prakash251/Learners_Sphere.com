package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course 
{
	@Id
	long courseId;
	String courseName;
	int coursePrice;
    @OneToMany
	List<Lesson> lessons;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(long courseId, String courseName, int coursePrice, List<Lesson> lessons) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.lessons = lessons;
	}
	
	
	@Override
	public String toString()
	{
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice
				+ ", lessons=" + lessons + ", getCourseId()=" + getCourseId() + ", getCourseName()=" + getCourseName()
				+ ", getCoursePrice()=" + getCoursePrice() + ", getLessons()=" + getLessons() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" +"]";
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	public long getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}

	
	
	
}
