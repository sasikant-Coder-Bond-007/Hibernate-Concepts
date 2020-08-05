package com.example.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.pojo.Address;
import com.example.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setEmpName("Arnab Goswami");
		
		Address add = new Address();
		
		add.setCity("Mumbai");
		add.setStreet("Worli");
		add.setState("MH");
		add.setPincode(411111);
		
		emp.setAddress(add);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();

	}

}
