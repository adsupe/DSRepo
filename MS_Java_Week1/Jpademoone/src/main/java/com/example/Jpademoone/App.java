package com.example.Jpademoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.Jpademoone.entity.StudOne;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf =Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
          
        StudOne s1=new StudOne();  
        s1.setRollNo(1);  
        s1.setName("Adarsh");  
        s1.setMarks(24);  
          
       
        
        StudOne s2=new StudOne();  
        s2.setRollNo(11);  
        s2.setName("Sneha");  
        s2.setMarks(25); 
        
        
        StudOne s3=new StudOne();  
        s3.setRollNo(55);  
        s3.setName("Naveen");  
        s3.setMarks(27); 
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
          
    }  
 
    }

