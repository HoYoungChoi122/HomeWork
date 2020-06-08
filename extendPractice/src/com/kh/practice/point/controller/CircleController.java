package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	public CircleController() {}
	
	public String calcArea(int x,int y,int radius) {
		
		c.setRadius(radius);
		
		return ""+c.getRadius()*c.getRadius()*3.14;
	}
	public String calcCircum(int x,int y,int radius) {
		
		c.setRadius(radius);
		
		return ""+c.getRadius()*2*3.14;
	}

}
