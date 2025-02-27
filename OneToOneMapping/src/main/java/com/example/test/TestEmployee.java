package com.example.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.pojo.Department;
import com.example.pojo.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setUserName("Abhishekh Trivedi");
		
		Department dept = new Department();
		dept.setDeptName("Development");
		
		emp.setDepartment(dept);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}

}
