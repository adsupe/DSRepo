package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.exception.TeacherNameNotFound;
import com.example.demo.service.TeacherServiceInterface;

@RestController
@RequestMapping("/api/v1")
public class TeacherController {

	@Autowired
	TeacherServiceInterface teachInterface;
	
	@PostMapping("/teachers")
	public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher){
		teachInterface.addTeacher(teacher);
		return new ResponseEntity<>("Successfully added teacher data",HttpStatus.CREATED);
	}
	
	@GetMapping("/teachers")
	public ResponseEntity<List<Teacher>> listTeacher(){
		return new ResponseEntity<List<Teacher>>(teachInterface.getTeachers(),HttpStatus.OK);
	}
	
	@GetMapping("/teachers/{name}")
	public ResponseEntity getTeachersByName(@PathVariable String name) {
		
		List<Teacher> lists = teachInterface.findTeacherByName(name);
		if(!lists.isEmpty()) {
			return new ResponseEntity<List<Teacher>>(lists,HttpStatus.OK);
		} else {
			return new ResponseEntity(new TeacherNameNotFound("ffff"), HttpStatus.NOT_FOUND);
		}
	}
}
