package com.kh.practice.student.veiw;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	//��ü������ ���ÿ� �ʱ�ȭ ( �ʱ�ȭ ������ StudentController() ������ ���� )
	
	public StudentMenu() {

		Student[] print = ssm.printStudent();
		//StudentŬ������  sArr���� �������� ȣ���ؿͼ� print��� ������ ������
		double avg[] = ssm.avgScore();
		//���� �迭�� �����Ͽ� ��հ��� �հ������� ����

		System.out.println("========== �л� ���� ��� =========");
		for (int a = 0; a < print.length; a++) {
			//Student Ŭ������ ������ �ҷ��� 
			System.out.println(print[a].inform()); 
		}
		System.out.println("========== �л����� ��� =========");
		for (int a = 0; a < avg.length; a++) {
			if (a == 0) {
				// double�� �迭�� �����߰�, avg[0]���� �հ������� ����� �ֱ⿡ for���� �����
				// for���� if���� �Ⱦ��� avg[a]�� ���� ��Ƽ� ����ص� ������
				System.out.println("�л� ���� ���� : " + (int) avg[a]);
			} else {
				System.out.println("�л� ���� ���� : " + avg[a]);
			}

		}
		System.out.println("==========���� ��� ��� =========");
		for (int a = 0; a < print.length; a++) {
			if (print[a].getScore() >= Student.CUT_LINE) {
				// �ƶ��� �޼� �� ���
				// Student Ŭ������ �̸��� �ҷ���
				System.out.println(print[a].getName() + "�л��� ����Դϴ�.");

			} else {
				// �ƶ��� �̴� �� ���
				// Student Ŭ������ �̸��� �ҷ���
				System.out.println(print[a].getName() + "�л��� ����� ����Դϴ�.");
			}
		}

	}

}
