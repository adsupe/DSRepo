package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Teacher;

public interface TeacherServiceInterface {

	
	public void addTeacher(Teacher teacher);
	
	public List<Teacher> getTeachers();
	
	public List<Teacher> findTeacherByName(String name);
}
