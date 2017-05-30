package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Problem;
import com.entity.Student;
import com.entity.Subject;
import com.hibernate.HibernateSessionFactory;

public class ProblemDao {

	/**
	 * 搜索问题
	 * @param problem
	 * @return
	 */
	public List findProblem(String problem){
		
		Session session = HibernateSessionFactory.getSession();
	
		String hql = "from Problem where question like ?";
		Query query = session.createQuery(hql);
		
		query.setString(0, "%"+problem+"%");
		
		List list = query.list();
		
		session.close();
		return list;
	}
	
	
	/**
	 * 添加问题
	 * @param args
	 */
	public void addProblem(String question,long sid,long subno,String subname){
		System.out.println("add...");
		System.out.println(question);
		System.out.println(sid);
		System.out.println(subno);
		System.out.println(subname);
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
			
		Problem problem = new Problem();
		problem.setQuestion(question);
		problem.setSid(sid);
		problem.setSubno(subno);
		problem.setSubname(subname);
		
		session.save(problem);
		
		tx.commit();
		session.close();
		
	}
	
	
	public void updateProblem(String answer,long pid){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "update Problem set answer = ? where pid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, answer);
		query.setParameter(1, pid);
		
		query.executeUpdate();
		
		tx.commit();
		session.close();
	}
	
	
	public void delMyProblem(long pid){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "delete from Problem where pid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, pid);
		
		query.executeUpdate();
		
		tx.commit();
		session.close();
	}
	
	
	public void updateMyProblem(String question,long pid){
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "update Problem set question=? where pid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, question);
		query.setParameter(1, pid);
		
		query.executeUpdate();
		
		
		tx.commit();
		session.close();
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		ProblemDao dao = new ProblemDao();
		dao.updateProblem("我", new Long(4));
	
	
	}
	
}
