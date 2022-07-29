package com.spring.jpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.controller.MyController;
import com.spring.jpa.entity.Course;

@Service
public class CourseServiceImpl implements CourseServices {

	@Autowired
	private MyController myController;

	List<Course> list;

	public CourseServiceImpl() {

		list = new ArrayList<>();
		list.add(new Course(145, "java course", "this course contain java course"));
		list.add(new Course(146, "Python course", "this course contain Python course"));
	}

	@Override
	public List<Course> getCourse() {

		return list;
	}

	@Override
	public Course getCourse(long courseId) {

		Course c = null;
		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}

		}

		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		return null;
	}

	/*
	 * @Override public Course updateCourse(Course course, long courseId) { Course
	 * existingEmployee = myController.findById(courseId) .orElseThrow(() -> new
	 * ResourceNotFoundException("Employee", "Id", id));
	 * 
	 * existingEmployee.setId(course.getId());
	 * existingEmployee.setTitle(course.getTitle());
	 * existingEmployee.setDescription(course.getDescription()); // save existing
	 * employee to DB myController.save(existingEmployee); return existingEmployee;
	 * }
	 */
}
