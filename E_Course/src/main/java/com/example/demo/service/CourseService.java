package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Course;

public interface CourseService {

 	public Course saveCourse(Course course);

	public List<Course> getAllCourse();

    public Course getCourseById(Integer id);

	public String deleteCourse(Integer id);

	public Course editCourse(Course course,Integer id);
	
}
