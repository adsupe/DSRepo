package study.springboot.crud.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import study.springboot.crud.entities.Student;
@Component
public interface StudentRepository extends JpaRepository<Student,Integer>
{
	

}
