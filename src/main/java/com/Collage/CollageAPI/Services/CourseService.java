package com.Collage.CollageAPI.Services;

import java.util.List;

import com.Collage.CollageAPI.entities.Course;

public interface CourseService {
	
	public List<Course> getCources();
	
	public Course getCourse(long courseId);

	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);
}