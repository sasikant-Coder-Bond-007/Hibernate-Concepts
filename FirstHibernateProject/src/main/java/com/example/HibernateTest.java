package com.example;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.pojo.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		user.setJoinedDate(new Date());
		user.setAddress("First user address");
		user.setDescription("Description of the user goes user.");
		user.setUserId(3);
		user.setUserName("Third User");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();

	}

}
