package com.kh.example.education.controller;

import com.kh.example.education.model.vo.Student;
import com.kh.example.education.model.vo.Teacher;

public class EducationController {
	public EducationController() {
		
	}
	public void method1() {
		Teacher t = new Teacher("학원","서울시 강남구","박신우",'G',"JAVA",20);
		System.out.println(t); // .toString()이 생략되어있음

		Student s = new Student("학원","서울시 강남구","최호영",'G',"스마트 컨텐츠",30);
		System.out.println(s);

		
	}

}

