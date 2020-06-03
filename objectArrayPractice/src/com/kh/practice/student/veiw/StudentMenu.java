package com.kh.practice.student.veiw;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	//객체생성과 동시에 초기화 ( 초기화 내용은 StudentController() 생성자 참고 )
	
	public StudentMenu() {

		Student[] print = ssm.printStudent();
		//Student클래스에  sArr값을 넣을것을 호출해와서 print라는 변수에 대입함
		double avg[] = ssm.avgScore();
		//더블 배열을 선언하여 평균값과 합계점수를 넣음

		System.out.println("========== 학생 정보 출력 =========");
		for (int a = 0; a < print.length; a++) {
			//Student 클래스의 정보를 불러옴 
			System.out.println(print[a].inform()); 
		}
		System.out.println("========== 학생성적 출력 =========");
		for (int a = 0; a < avg.length; a++) {
			if (a == 0) {
				// double로 배열을 선언했고, avg[0]에는 합계점수가 담겨져 있기에 for으로 출력함
				// for문과 if문을 안쓰고 avg[a]에 값만 담아서 출력해도 무방함
				System.out.println("학생 종합 점수 : " + (int) avg[a]);
			} else {
				System.out.println("학생 종합 점수 : " + avg[a]);
			}

		}
		System.out.println("==========성적 결과 출력 =========");
		for (int a = 0; a < print.length; a++) {
			if (print[a].getScore() >= Student.CUT_LINE) {
				// 컷라인 달성 시 출력
				// Student 클래스의 이름을 불러옴
				System.out.println(print[a].getName() + "학생은 통과입니다.");

			} else {
				// 컷라인 미달 시 출력
				// Student 클래스의 이름을 불러옴
				System.out.println(print[a].getName() + "학생은 재시험 대상입니다.");
			}
		}

	}

}
