package com.spring.jpa.services;

import java.util.List;
import com.spring.jpa.entity.Course;

public interface CourseServices {

	public List<Course> getCourse();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);



}
