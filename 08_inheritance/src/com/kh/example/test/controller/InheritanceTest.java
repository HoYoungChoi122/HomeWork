package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Parent;
import com.kh.example.test.model.vo.child2;

public class InheritanceTest {
	public void method1() {
		
		System.out.println("ParentŬ������ num �ʵ� ����");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("ParentŬ������ num Ȯ�� : "+p.getNum());
		
		System.out.println("child1 Ŭ������ str �ʵ� ����");
		Child1 c1 = new Child1();
		c1.setStr("dtd");
		System.out.println("child1Ŭ������ str Ȯ�� : "+c1.getStr());
		
		System.out.println("child1 Ŭ������ num �ʵ� ����");
		c1.setNum(12);
		System.out.println("child1Ŭ������ num Ȯ�� : "+c1.getNum());
		
		System.out.println("child2Ŭ������ str ����  ");
		child2 c2 =new child2();
		c2.setStr("world");
		System.out.println("child2Ŭ������ str Ȯ�� : "+c2.getStr());
		
		System.out.println("child2Ŭ������ num ���� ");
		c2.setNum(7);
		System.out.println("child2Ŭ������ num Ȯ�� : "+ c2.getNum());
		System.out.println(p.getNum());
		
	}

}
