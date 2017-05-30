package com.entity;

/**
 * Student entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Long sid;
	private String username;
	private String password;
	private String email;
	private String school;
	private String sex;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String username, String password, String email,
			String school, String sex) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.school = school;
		this.sex = sex;
	}

	// Property accessors

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}