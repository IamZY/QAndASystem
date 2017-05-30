package com.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Student;
import com.hibernate.HibernateSessionFactory;

public class RegisterDao {

	
	
	
	
	
	public void save(Student student){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		
		//转换为持久化状态
		session.save(student);
		
		//user对象时持久化状态
		t.commit();
		
		session.close();
		
	}
}
