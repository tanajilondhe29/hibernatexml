package com.acadgild.tml.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.acadgild.tml.hibernate.model.Employee;
import com.acadgild.tml.hibernate.util.HibernateUtil;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "Tanaji Londhe", "Pune");
		 //Get Session
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        session.save(emp);
        //Commit transaction
        session.getTransaction().commit();
        System.out.println("Employee ID="+emp.getId());
         
        //terminate session factory, otherwise program won't end
        sessionFactory.close();
	}
}
