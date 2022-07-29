package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.entity.Course;
import com.spring.jpa.services.CourseServices;

@RestController
public class MyController {

	@Autowired
	private CourseServices courseServices;

	@GetMapping("/home")
	public String home() {

		return "welcome to my home";
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {

		return this.courseServices.getCourse();

	}

	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {

		return this.courseServices.getCourse(Long.parseLong(courseId));

	}

	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {

		return this.courseServices.addCourse(course);

	}

	
	  @PutMapping("/courses")
	  public Course updateCourse(@RequestBody Course course) {
		  return this.courseServices.updateCourse(course);
	  
	  }
/*	  public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		  try {
			  
		  }
		  catch(Exception e) {
			  
		  }
		  
	  } */
}
	