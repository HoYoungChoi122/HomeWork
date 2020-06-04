package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() {
		Parent p = new Parent();
//		p.num = 1; // private이라서 안됨 
		p.dNum = 12.3; // 같은패키지 내이기에 default가 가능함
		p.bool = true; // 같은패키지 || 상속클래스일떄 사용가능 ( proteceted )
		p.ch = 'a'; // public은 전체 사용 가능
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}
