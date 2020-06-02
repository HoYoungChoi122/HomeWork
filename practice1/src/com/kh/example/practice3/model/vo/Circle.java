package com.kh.example.practice3.model.vo;

public class Circle {
	private final double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	public void incrementRadius() {
		//반지름 1증가
		radius++;
		
	}
	public void getAreaOfCircle() {
		//넓이
		System.out.println(2*radius*PI);
	}
	public void getSizeOfCircle() {
		//지름
		System.out.println(radius*radius*PI);
	}

}
