package com.kh.example.test.model.vo;

public class child2 extends Parent{
	private String str;
	
	public child2 () {
		super();
		super.ch = 1;
		super.dNum =  123.123;
		
		
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}

}
