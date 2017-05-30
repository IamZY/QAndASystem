package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Problem;
import com.entity.Subject;
import com.hibernate.HibernateSessionFactory;



public class SubjectDao {
	
	/**
	 * 查询科目
	 */
	public List<Subject> findSubject(){		
		//实例化Configuration对象 调用configure 加载Hibernate.cfg.xml
		Configuration cfg = new Configuration().configure();
		
		//创建会话工厂
		SessionFactory sf = cfg.buildSessionFactory();
		
		//开启与数据库连接
		Session session = sf.openSession();
		
		//根据主键查询信息
		String hql = "from Subject";
		Query query = session.createQuery(hql);
		
		
		List<Subject> list = query.list();

		
		//关闭资源
		session.close();
		sf.close();
		
		return list;
	}
	
	/**
	 * 
	 * @param subno
	 * @return
	 */
	public List<Problem> findProblemById(Integer subno){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Problem where subno = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, subno);
		
		List<Problem> list = query.list();
		
		session.close();
		
		return list;
	}
	
	
	/**
	 * 
	 * @param subno
	 * @return
	 */
	
	public List<Problem> findMyProblemById(Integer sid){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "from Problem where sid = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, sid);
		
		List<Problem> list = query.list();
		
		session.close();
		
		return list;
	}
	
	
	public Long findSubnoByName(String subname){
		
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select subno from Subject where subname=?";
		Query query  = session.createQuery(hql);
		
		query.setString(0, subname);
		
		Long subno = (Long) query.uniqueResult();
		
		
		return subno;
	}
	
	
	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDao();
		//dao.findSubject();
		//List<Problem> list = dao.findProblemById(2);
//		List<Problem> list = dao.findMyProblemById(1);
//		for (Object o : list) {
//			Problem p = (Problem)o;
//			System.out.println(p.getQuestion());
//		}
		
		System.out.println(dao.findSubnoByName("语文"));
		
	}
	
	
}
