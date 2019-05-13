package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.NonTeachingStaff;
import com.tutorialspoint.eclipselink.entity.TeachingStaff;

public class SaveClient {

	public static void main(String[]args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager enmanager = emfactory.createEntityManager();
		enmanager.getTransaction().begin();
		
		TeachingStaff ts1 = new TeachingStaff(1, "Gopal", "MSC MED", "Maths");
		TeachingStaff ts2 = new TeachingStaff(2, "Manisha", "BSC BED", "English");
		
		NonTeachingStaff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
		NonTeachingStaff nts2 = new NonTeachingStaff(4, "Krishna", "Office Admin");
		
		
		enmanager.persist(ts1);
		enmanager.persist(ts2);
		enmanager.persist(nts1);
		enmanager.persist(nts2);
		
		enmanager.getTransaction().commit();
		enmanager.close();
		emfactory.close();
	}
}
