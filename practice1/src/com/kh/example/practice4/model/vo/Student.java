package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	{
		grade = 3;
		classroom = 14;
		name = "최호영";
		height = 175.5;
		gender = '남';
		
		
	}
	
	
	
	public Student() {
		
	}
	
	public void information() {
		System.out.println(grade+"학년"+classroom+"반"+name+" 학생의 키는 : " + height+"입니다. 성별은 :"+gender+" 입니다 .");
		
	}
	
	
}
