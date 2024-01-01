package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourseServiceImpl;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class CourseController {

	@Autowired
	private CourseServiceImpl courseService;

    //crud
	@PostMapping("/saveCourse")
	public ResponseEntity<?> saveCourse(@RequestBody Course course) {
		return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<?> getAllCourse() {
		return new ResponseEntity<>(courseService.getAllCourse(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getCourseById(@PathVariable Integer id) {
		return new ResponseEntity<>(courseService.getCourseById(id), HttpStatus.OK);
	}
	@GetMapping("/deleteCourse/{id}")
	public ResponseEntity<?> deleteCourse(@PathVariable Integer id) {
		return new ResponseEntity<>(courseService.deleteCourse(id), HttpStatus.OK);
	}

	@PostMapping("/editCourse/{id}")
	public ResponseEntity<?> editCourse(@RequestBody Course course, @PathVariable Integer id) {
		return new ResponseEntity<>(courseService.editCourse(course, id), HttpStatus.CREATED);
	}
	@PutMapping("/editCourse/{id}")
	public ResponseEntity<?> edit(@RequestBody Course course, @PathVariable Integer id) {
		return new ResponseEntity<>(courseService.edit(course, id), HttpStatus.CREATED);
	}
	@DeleteMapping("/deleteCourse/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id)
	{
		return new ResponseEntity<>(courseService.deleteCourse(id),HttpStatus.OK);
	}
	
	//sorting
    @GetMapping("/sortCourses/{field}")
    public Iterable<Course> getCourseSorted(@PathVariable("field") String field)
    {
    	return courseService.sortCourses(field);
    }
    
    //paging
	@GetMapping(value = "/pagingCourses/{pageNo}/{pageSize}")
	Page<Course> CoursePaging(@PathVariable("pageNo")int pageno,@PathVariable("pageSize")int pageSize){
	      return courseService.pagingCourses(pageno, pageSize);	
	}  
	
	//pagingAndSorting
	@GetMapping(value = "/pagingSortingCourses/{pageNo}/{pageSize}/{field}")
	Page<Course> coursesPagingAndSorting(@PathVariable ("pageNo") int pageno,
				@PathVariable ("pageSize") int pageSize,@PathVariable ("field")String field) {
		return courseService.pagingAndSortingCourses(pageno, pageSize,field);
    }
	
	//jpql
	@GetMapping("/showCoursesByNamePrefix/{prefix}")
	public List<Course> findCoursesByDescriptionPrefix(@PathVariable("prefix")String prefix)
	{
	    	return courseService.findCoursesByDescriptionPrefix(prefix);
	}
    @GetMapping("/showCoursesByNameSuffix/{suffix}")
	public List<Course> findCoursesByDescriptionSuffix(@PathVariable("suffix")String suffix)
    {
	   	return courseService.findCoursesByDescriptionSuffix(suffix);
    }
    
    
}
