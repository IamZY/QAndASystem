package com.action;

import java.util.List;

import com.dao.ProblemDao;
import com.dao.SubjectDao;
import com.entity.Problem;
import com.entity.Student;

public class ProblemAction {
	
	private String problem;
	private List probleList;
	private ProblemDao dao = new ProblemDao();
	private Problem pro;
	private String username;
	private Student student;
	private Long sid;
	
	
	

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public Problem getPro() {
		return pro;
	}

	public void setPro(Problem pro) {
		this.pro = pro;
	}

	public List getProbleList() {
		return probleList;
	}

	public void setProbleList(List probleList) {
		this.probleList = probleList;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String findproblem(){
		
		System.out.println(problem);
		List list = dao.findProblem(problem);		
		probleList = list;
			
		return "success";
	}

	public String addProblem(){
		System.out.println("add....");
		System.out.println(username);
		System.out.println(pro.getQuestion());
		System.out.println(pro.getSubname());
		System.out.println(pro.getSid());
		Long subno = new SubjectDao().findSubnoByName(pro.getSubname());
		
		dao.addProblem(pro.getQuestion(), pro.getSid(), subno, pro.getSubname());
						
		return "success";
		
	}

	public String updateProblem(){
		System.out.println(pro.getPid());
		System.out.println(pro.getSid());
		System.out.println(student.getUsername());
		System.out.println(pro.getAnswer());
		
		
		dao.updateProblem(pro.getAnswer(), pro.getPid());
		
		
		
		return "success";
	}
	
	
	public String delMyProblem(){
		System.out.println(pro.getPid());
		System.out.println(sid);
		
		dao.delMyProblem(pro.getPid());
		
		return "success";
	}
	
	
	public String updateMyProblem(){
		System.out.println(pro.getPid());
		System.out.println(pro.getQuestion());
		System.out.println(sid);
		
		dao.updateMyProblem(pro.getQuestion(), pro.getPid());
		
		return "success";
	}
	
	
}
