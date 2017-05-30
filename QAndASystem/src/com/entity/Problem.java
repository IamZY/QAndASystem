package com.entity;

/**
 * Problem entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Problem implements java.io.Serializable {

	// Fields

	private Long pid;
	private String question;
	private String answer;
	private Long sid;
	private Long subno;
	private String subname;

	// Constructors

	/** default constructor */
	public Problem() {
	}

	/** full constructor */
	public Problem(String question, String answer, Long sid, Long subno,
			String subname) {
		this.question = question;
		this.answer = answer;
		this.sid = sid;
		this.subno = subno;
		this.subname = subname;
	}

	// Property accessors

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

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