package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherServiceInterface;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TeacherServiceInterface teachInterface;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testFindByTeachName() {
		List<Teacher> teachers = teachInterface.findTeacherByName("abc");
		assertTrue(teachers.size()==1);
	}
}
