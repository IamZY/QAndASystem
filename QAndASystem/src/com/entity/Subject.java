package com.entity;

/**
 * Subject entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Subject implements java.io.Serializable {

	// Fields

	private Long subno;
	private String subname;

	// Constructors

	/** default constructor */
	public Subject() {
	}

	/** full constructor */
	public Subject(String subname) {
		this.subname = subname;
	}

	// Property accessors

	public Long getSubno() {
		return this.subno;
	}

	public void setSubno(Long subno) {
		this.subno = subno;
	}

	public String getSubname() {
		return this.subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

}