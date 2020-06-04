package com.kh.example.education.model.vo;

public class Student extends Academy{
	
	private String course;
	private int money;
	
	public Student() {
		
	}
	public Student(String academy, String acaAddr, String name, char classroom,String course,int money) {
		super(academy,acaAddr,name,classroom);	
		this.course = course;
		this.money = money;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	public void setMoey(int money) {
		this.money = money;
	}
	

	public String getCourse() {
		return course;
	}
	public int getMoney() {
		return money;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+course+" "+money;
	}
	
	
}
