package com.gio.composition;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.gio.jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// begin transaction
		entityManager.getTransaction().begin();

		// build object
		University uni = new University("UMICH");

		Student s1 = new Student("Salinger");
		Student s2 = new Student("Simone");
		s1.setUniversity(uni);
		s2.setUniversity(uni);
		
		uni.addStudent(s1);
		uni.addStudent(s2);

		// persist (Create) transaction(s)
		entityManager.persist(uni);
		entityManager.persist(s1);
		entityManager.persist(s2);

		// find (Read) and print value from table
		// Person p = entityManager.find(Person.class, 6);
		// System.out.println(p);

		// remove (Delete) row from table
		// entityManager.remove(p);

		// commit transaction (for Create, Update, and Delete)
		entityManager.getTransaction().commit();

		// close both managers
		entityManager.close();
		entityManagerFactory.close();

	}

}
