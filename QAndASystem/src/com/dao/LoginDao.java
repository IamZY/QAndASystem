package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entity.Problem;
import com.entity.Student;
import com.hibernate.HibernateSessionFactory;

public class LoginDao {

	/**
	 * ²éÑ¯
	 * @return
	 */
	public boolean login(Student student){
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Student where username=? and password=?";
		Query query = session.createQuery(hql);
		query.setString(0, student.getUsername());
		query.setString(1, student.getPassword());
		
		
		List list = query.list();
		
		if(list.isEmpty()){
			return false;
		}
		
		session.close();
		
		return true;
	}//login
	
	
	
	
	/**
	 * 
	 * @param subno
	 * @return
	 */
	
	public int findIdByUsername(String username){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select sid from Student where username = ?";
		Query query = session.createQuery(hql);
		query.setString(0, username);
		
		Long l =  (Long) query.uniqueResult();
		
		//long->int
		int sid = new Long(l).intValue();		
			
		session.close();
		
		return sid;
	} 
	
	
	public static void main(String[] args) {
		LoginDao dao = new LoginDao();
		int i  = dao.findIdByUsername("tom");
	
		System.out.println(i);
	}
	
	
	
}
