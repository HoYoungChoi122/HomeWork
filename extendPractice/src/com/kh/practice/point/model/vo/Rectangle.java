package com.kh.practice.point.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		
		
	}
	public Rectangle(int x, int y,int width,int height) {
		super(x,y);
		this.width = width;
		this.height = height;
				
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeiht() {
		return height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"width : "+width+"height : "+height;
	}
	
	
}
