package com.kh.example.education.controller;

import com.kh.example.education.model.vo.Student;
import com.kh.example.education.model.vo.Teacher;

public class EducationController {
	public EducationController() {
		
	}
	public void method1() {
		Teacher t = new Teacher("�п�","����� ������","�ڽſ�",'G',"JAVA",20);
		System.out.println(t); // .toString()�� �����Ǿ�����

		Student s = new Student("�п�","����� ������","��ȣ��",'G',"����Ʈ ������",30);
		System.out.println(s);

		
	}

}

