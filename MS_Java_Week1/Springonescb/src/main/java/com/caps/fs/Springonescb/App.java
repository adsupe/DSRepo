package com.caps.fs.Springonescb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       
       Car car = context.getBean("car",Car.class);
       System.out.println("Car Name ::"+car.getName()+" ; Engine Brand :: "+car.getEngine().getBrand());
       
       Person em = context.getBean("pr", Person.class);
   		em.showDetails();
    }
}
