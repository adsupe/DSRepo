package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.TeacherRepository;
import com.example.demo.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherServiceInterface{
	
	@Autowired
    TeacherRepository teacherRepository;	

	
	@Override
	@Transactional
	public void addTeacher(Teacher teacher) {
		teacherRepository.save(teacher);
	}


	@Override
	public List<Teacher> getTeachers() {
		return teacherRepository.findAll();
	}
	
	public List<Teacher> findTeacherByName(String name){
		return teacherRepository.findByName(name);
	}

}
