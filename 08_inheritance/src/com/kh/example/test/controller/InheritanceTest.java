package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Parent;
import com.kh.example.test.model.vo.child2;

public class InheritanceTest {
	public void method1() {
		
		System.out.println("Parent클래스의 num 필드 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent클래스의 num 확인 : "+p.getNum());
		
		System.out.println("child1 클래스의 str 필드 접근");
		Child1 c1 = new Child1();
		c1.setStr("dtd");
		System.out.println("child1클래스의 str 확인 : "+c1.getStr());
		
		System.out.println("child1 클래스의 num 필드 접근");
		c1.setNum(12);
		System.out.println("child1클래스의 num 확인 : "+c1.getNum());
		
		System.out.println("child2클래스의 str 접근  ");
		child2 c2 =new child2();
		c2.setStr("world");
		System.out.println("child2클래스의 str 확인 : "+c2.getStr());
		
		System.out.println("child2클래스의 num 접근 ");
		c2.setNum(7);
		System.out.println("child2클래스의 num 확인 : "+ c2.getNum());
		System.out.println(p.getNum());
		
	}

}
