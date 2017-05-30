package com.action;

import com.dao.RegisterDao;
import com.entity.Student;

public class RegisterAction {
	
	private RegisterDao registerDao = new RegisterDao();
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}




	public String register(){
		
		System.out.println(student.getUsername());
		System.out.println(student.getPassword());
		System.out.println(student.getEmail());
		System.out.println(student.getSchool());
		System.out.println(student.getSex());
		
	
		registerDao.save(student);
		
		
		return "success";
	}
	
	
	
	
	
	
}
