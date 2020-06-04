package com.kh.example.education.model.vo;

public class Teacher extends Academy{
	
	private String subject;
	private int career;
	
	public Teacher() {
		
	}
	public Teacher(String academy, String acaAddr, String name, char classroom,String subject,int career) {
	
		super(academy,acaAddr,name,classroom);
		this.subject = subject;
		this.career = career;
	}
	

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	
	
	public String getSubject() {
		return subject;
	}
	public int getCareer() {
		return career;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+subject+" "+career;
	}



}
