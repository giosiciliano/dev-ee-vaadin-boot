package com.gio.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.gio.jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// begin transaction
		entityManager.getTransaction().begin();
		;

		// build object
		//Person p1 = new Person("Kevin", 18);
		//Person p2 = new Person("Joe", 55);
		//Person p3 = new Person("Nicole", 33);

		// persist (Create) transaction(s)
		//entityManager.persist(p1);
		//entityManager.persist(p2);
		//entityManager.persist(p3);
		
		// Example of JPQL to Read from a table
		//Query query = entityManager.createQuery("Select p From Person p");

		// Example of Read JPQL with Where clause
		//Query query = entityManager.createQuery("Select p From Person p"
		//		+ " Where p.age > 40");
		//Query query = entityManager.createQuery("Select p From Person p"
		//		+ " Where p.name Like '%e'");
		//Query query = entityManager.createQuery("Select p From Person p"
		//		+ " Where p.age between 20 and 40");
		// Example of Read with sort (order by)
		//Query query = entityManager.createQuery("Select p From Person p"
		//		+ " Order By p.age");
		// ---------------------------------------------------------
		
		// Example of native SQL
		//Query query = entityManager.createNativeQuery("Select * from Person", Person.class);
		//Query query = entityManager.createNativeQuery("Select * from Person "
		//		+ "where age < 35", Person.class);
		//Query query = entityManager.createNativeQuery("Select * from Person "
		//		+ "where age between 10 and 30", Person.class);
		// ---------------------------------------------------------
		
		// Example of Named Queries (specified w/in the Person class)
		//TypedQuery<Person> query = entityManager.createNamedQuery("person.getAll", Person.class);
		TypedQuery<Person> query = entityManager.createNamedQuery("person.getPersonById", Person.class);
		query.setParameter("id", 8);
		// ---------------------------------------------------------
		
		List<Person> peeps = query.getResultList();
		
		for (Person person : peeps) {
			System.out.println(person);
		}

		// find (Read) and print value from table
		//Person p = entityManager.find(Person.class, 6);
		//System.out.println(p);
		
		// remove (Delete) row from table
		//entityManager.remove(p);

		// commit transaction (for Create, Update, and Delete)
		entityManager.getTransaction().commit();

		// close both managers
		entityManager.close();
		entityManagerFactory.close();

	}

}
