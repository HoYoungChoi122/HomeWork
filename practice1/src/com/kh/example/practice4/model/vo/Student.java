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
		name = "��ȣ��";
		height = 175.5;
		gender = '��';
		
		
	}
	
	
	
	public Student() {
		
	}
	
	public void information() {
		System.out.println(grade+"�г�"+classroom+"��"+name+" �л��� Ű�� : " + height+"�Դϴ�. ������ :"+gender+" �Դϴ� .");
		
	}
	
	
}
