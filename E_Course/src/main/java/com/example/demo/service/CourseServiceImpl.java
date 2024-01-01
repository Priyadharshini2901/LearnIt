package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseServiceImpl {

 	@Autowired
    private CourseRepository courseRepo;
 	
 	public Course saveCourse(Course course) {
 		return courseRepo.save(course);
 	}
 	
	public List<Course> getAllCourse() {
		return courseRepo.findAll();
	}

	
	public Course getCourseById(Integer id) {
		return courseRepo.findById(id).get();
	}

	
	public String deleteCourse(Integer id) {
		Course course = courseRepo.findById(id).get();

		if (course != null) {
			courseRepo.delete(course);
			return "Course Delete Sucessfully";
		}

		return "Something wrong on server";
	}

	public Course editCourse(Course p, Integer id) {

		Course oldCourse = courseRepo.findById(id).get();

		oldCourse.setCourseName(p.getCourseName());
		oldCourse.setDescription(p.getDescription());
		oldCourse.setStatus(p.getStatus());
		oldCourse.setPrice(p.getPrice());
		
		return courseRepo.save(oldCourse);
	}
	public Course edit(Course p, Integer id) {

		Course oldCourse = courseRepo.findById(id).get();

		oldCourse.setCourseName(p.getCourseName());
		oldCourse.setDescription(p.getDescription());
		oldCourse.setStatus(p.getStatus());
		oldCourse.setPrice(p.getPrice());
		
		return courseRepo.save(oldCourse);
	}
	public Iterable<Course> sortCourses(String field)
	{
	return courseRepo.findAll(Sort.by(field));
	}
	public Page<Course> pagingCourses(int page,int pageSize)//page no and size
	{
		Pageable paging = PageRequest.of(page, pageSize);
	    return courseRepo.findAll(paging);
    }
    public Page<Course> pagingAndSortingCourses(int pageNo,int pageSize,String field )
    { 
 	Pageable paging = PageRequest.of(pageNo, pageSize).withSort(Sort.by(field));
    return courseRepo.findAll(paging);
    }
    
    @Transactional
    public List<Course> findCoursesByDescriptionPrefix(String prefix)
    {
	    return courseRepo.findByDescriptionStartingWith(prefix);
    }
    
    @Transactional
    public List<Course> findCoursesByDescriptionSuffix(String suffix)
	{
		return  courseRepo.findByDescriptionEndingWith(suffix);
	}
    
    
}
