package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	
	public RectangleController() {}
	
	public String calcPerimeter(int x,int y, int width, int height) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return ""+r.getHeiht()*r.getWidth()*2;
	}
	public String calcArea(int x,int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return ""+r.getHeiht()*r.getWidth();
	}
	
	
	
	
}
