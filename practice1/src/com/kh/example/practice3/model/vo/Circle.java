package com.kh.example.practice3.model.vo;

public class Circle {
	private final double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	public void incrementRadius() {
		//������ 1����
		radius++;
		
	}
	public void getAreaOfCircle() {
		//����
		System.out.println(2*radius*PI);
	}
	public void getSizeOfCircle() {
		//����
		System.out.println(radius*radius*PI);
	}

}
