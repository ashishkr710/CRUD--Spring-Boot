package com.Collage.CollageAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Collage.CollageAPI.entities.Course;

@Service
public class CourseServiceimpl implements CourseService  {

	List<Course> list;
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"jAVA","This is a JAVA Course"));
		list.add(new Course(451,"PYTHON","This is a PYTHON Course"));
		list.add(new Course(101,"C++","This is a C++ Course"));
	}

	@Override
	public List<Course> getCources() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
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
		list.forEach(e ->{
			if(e.getId()== course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}

}
