package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.getSizeOfCircle();
		c.getAreaOfCircle();
		
		c.incrementRadius();
		
		c.getSizeOfCircle();
		c.getAreaOfCircle();
		
	}

}
