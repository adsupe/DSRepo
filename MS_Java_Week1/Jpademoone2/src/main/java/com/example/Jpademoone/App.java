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
	public static void main(String[] args) {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
	    EntityManager em = emf.createEntityManager();

	    try {
	        em.getTransaction().begin(); // Begin the transaction

	        StudOne s =em.find(StudOne.class, 55);

	        System.out.println("Student rollno = " + s.getRollNo());
	        System.out.println("Student marks = " + s.getMarks());
	        System.out.println("Student name = " + s.getName());
	        s.setMarks(49);  
	          
	        System.out.println("After Updation");  
	        System.out.println("Student rollno = " + s.getRollNo());
	        System.out.println("Student marks = " + s.getMarks());
	        System.out.println("Student name = " + s.getName());

	        em.getTransaction().commit(); // Commit the transaction
	    } catch (Exception e) {
	        if (em.getTransaction().isActive()) {
	            em.getTransaction().rollback(); // Rollback the transaction if an exception occurs
	        }
	        e.printStackTrace();
	    } finally {
	        em.close();
	        emf.close();
	    }
	}
}


