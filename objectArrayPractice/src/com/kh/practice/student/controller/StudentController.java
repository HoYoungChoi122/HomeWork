package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student sArr[] = new Student[5];
	//객체 배열 생성 5칸 
	public static final int CUT_LINE = 60;
	//상수 선언 - 커트라인 60점 
	public StudentController() {
		//기본생성자 - 사용과 동시에 아래내용으로 초기화 됨
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("니길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);	
	}
	
	public Student[] printStudent() {	
		//Student[]로 값을 리턴함
		return sArr;
	}
	
	public int sumScore() {
		
		int sum = 0;
		//합계점수를 얻기 위한 변수
		
		for(int a =0; a<sArr.length; a++) {
			sum= sum+sArr[a].getScore();
			//배열의 인덱스가 증가함에 따라 각 순서의 점수를 불러옴
		}		
		return sum; //점수값 반환
		
	}
	
	public double[] avgScore() {
		double avg[] = new double[2]; // double형 두개 배열 선언
		
		avg[0] = sumScore();//sumScore를 불러옴으로 합쳐진 값 반환
		avg[1] = avg[0]/sArr.length; //합계값을 배열의 수 ( 사람수 ) 만큼 나눔
		
		return avg; 
	}
	
	
	

}
