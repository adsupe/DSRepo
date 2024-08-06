package study.springboot.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import study.springboot.crud.dao.StudentRepository;
import study.springboot.crud.entities.Animal;
import study.springboot.crud.entities.Student;

@Service
public class StudentService 
{
     @Autowired      
	  public StudentRepository  studentRepository;	
     
       public Student saveRecord(Student student)
       {
    	         //System.out.println("data:"+student);
    	           	         
    	     Student save = studentRepository.save(student);
    	     return save;
    	    
       }
       public List <Student> getStudents() {

     	  return studentRepository.findAll();

        }
 
}
