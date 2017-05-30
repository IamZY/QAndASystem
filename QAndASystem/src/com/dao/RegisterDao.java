package com.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Student;
import com.hibernate.HibernateSessionFactory;

public class RegisterDao {

	
	
	
	
	
	public void save(Student student){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		
		//ת��Ϊ�־û�״̬
		session.save(student);
		
		//user����ʱ�־û�״̬
		t.commit();
		
		session.close();
		
	}
}
