package com.action;

import java.util.List;

import javax.print.attribute.IntegerSyntax;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import oracle.jdbc.util.Login;

import com.dao.LoginDao;
import com.dao.SubjectDao;
import com.entity.Problem;
import com.entity.Student;
import com.entity.Subject;

public class SubjectAction {

	private SubjectDao subjectDao = new SubjectDao();
	private List<Subject> subList;
	private List<Problem> proList;
	private Student student;
	private String subname;
	private Integer subno;
	private Integer sid;
	private List myProList;
	
	
	public List getMyProList() {
		return myProList;
	}

	public void setMyProList(List myProList) {
		this.myProList = myProList;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getSubno() {
		return subno;
	}

	public void setSubno(Integer subno) {
		this.subno = subno;
	}

	public SubjectAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Subject> getSubList() {
		return subList;
	}

	public void setSubList(List<Subject> subList) {
		this.subList = subList;
	}
	
	public List<Problem> getProList() {
		return proList;
	}

	public void setProList(List<Problem> proList) {
		this.proList = proList;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	/**
	 * 显示课程名称
	 * @return
	 */
	public String findSub(){
		System.out.println("findSub....");
		System.out.println(student.getSid());
		System.out.println(student.getUsername());
		
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("username", student.getUsername());
		
		
		
		subList = subjectDao.findSubject();
		
		int i  = new LoginDao().findIdByUsername(student.getUsername());
		
		sid = i;
		
		//将student id存入session
		//HttpServletRequest request = ServletActionContext.getRequest();
		//HttpSession session = request.getSession();
		session.setAttribute("sid", sid);
		
		
		for(Object o : subList){
			
			Subject s = (Subject)o;
			System.out.println(s.getSubno() + "::" + s.getSubname());
			
		}

		return "success";
	}
	
	/**
	 * 通过subno查单个学科的问题
	 * @return
	 */
	public String findProblemById(){
		
		System.out.println(subno);
		System.out.println(sid);
		
		List<Problem> list = subjectDao.findProblemById(subno);
		
		
		for (Object object : list) {
			Problem p = (Problem)object;
			System.out.println(p.getQuestion());
		}
		
		proList = list;
		sid = sid;
		return "success";
	}
	
	
	
	/**
	 * 通过sid学生号码查询学生询问问题
	 * @return
	 */
	public String findMyProblemById(){
		
		System.out.println(sid);
		
		List<Problem> list = subjectDao.findMyProblemById(sid);
		
		
		for (Object object : list) {
			Problem p = (Problem)object;
			System.out.println(p.getQuestion());
		}
		
		myProList = list;
		
		return "success";
	}
	
	
	public String findSubject(){
		System.out.println("findSubject....");
		
		subList = subjectDao.findSubject();
			
		for(Object o : subList){
			
			Subject s = (Subject)o;
			System.out.println(s.getSubno() + "::" + s.getSubname());
			
		}

		return "success";
	}
	
	
	

	public static void main(String[] args) {
		SubjectAction action = new SubjectAction();
		action.findSub();
	}

	
	
	
	
	
}
