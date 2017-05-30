package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import com.dao.LoginDao;
import com.entity.Student;


public class LoginAction {
	
	private LoginDao loginDao = new LoginDao();
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}



	public String login(){
		System.out.println(student.getUsername());
		System.out.println(student.getPassword());
		
		//通过username查询他的id		
		
		boolean result = loginDao.login(student);
		System.out.println(result);
		if(result == true){
			
			return "success";
			
		}else{
			return "error";
		}
		
		
		
	}
	
}
