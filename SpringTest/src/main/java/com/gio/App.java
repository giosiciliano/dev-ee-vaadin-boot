package com.gio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Spring relies heavily on IoC
 * 
 *  - spring container helps to make this inversion of control
 *  
 *      - Create the objects + wire them together + manage their complete life cycle from create to destruction
 *        + uses DI to manage componetnts -> spring beans
 *    
 *        - instructions + metadata ==>> container create application
 *                         (XML or Annotations)
 * 
 *          - Two containers:
 *            1) Spring BeanFactory container
 *            2) Spring ApplicationContext container interface, includes all features of BeanFactory so this is the standard
 * 
 * 				EXAMPLE: resolve textual information from a properties file + load beans + wire beans together
 * 					org.springframework.context.ApplicationContext
 * 
 * 
 * Bean Scopes - defined in XML
 * 			
 * 				EXAMPLE: if we want the bean to be unique then we set the scope to be singleton
 * 				  To force Spring to produce a new bean instance each time one is needed, set scope to prototype
 * 
 *  - Singleton: single instance of the bean per container
 *  - Prototype: any number of instances in the container
 * 
 */

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = (Student) appContext.getBean("student_bean");
		
		s1.sayHello();
		
	}
	
}
