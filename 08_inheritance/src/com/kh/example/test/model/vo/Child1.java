package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() {
		Parent p = new Parent();
//		p.num = 1; // private�̶� �ȵ� 
		p.dNum = 12.3; // ������Ű�� ���̱⿡ default�� ������
		p.bool = true; // ������Ű�� || ���Ŭ�����ϋ� ��밡�� ( proteceted )
		p.ch = 'a'; // public�� ��ü ��� ����
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
