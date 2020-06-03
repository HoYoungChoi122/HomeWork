package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student sArr[] = new Student[5];
	//��ü �迭 ���� 5ĭ 
	public static final int CUT_LINE = 60;
	//��� ���� - ĿƮ���� 60�� 
	public StudentController() {
		//�⺻������ - ���� ���ÿ� �Ʒ��������� �ʱ�ȭ ��
		sArr[0] = new Student("��浿","�ڹ�",100);
		sArr[1] = new Student("�ϱ浿","���",50);
		sArr[2] = new Student("�̱浿","ȭ��",85);
		sArr[3] = new Student("���浿","����",60);
		sArr[4] = new Student("ȫ�浿","�ڹ�",20);	
	}
	
	public Student[] printStudent() {	
		//Student[]�� ���� ������
		return sArr;
	}
	
	public int sumScore() {
		
		int sum = 0;
		//�հ������� ��� ���� ����
		
		for(int a =0; a<sArr.length; a++) {
			sum= sum+sArr[a].getScore();
			//�迭�� �ε����� �����Կ� ���� �� ������ ������ �ҷ���
		}		
		return sum; //������ ��ȯ
		
	}
	
	public double[] avgScore() {
		double avg[] = new double[2]; // double�� �ΰ� �迭 ����
		
		avg[0] = sumScore();//sumScore�� �ҷ������� ������ �� ��ȯ
		avg[1] = avg[0]/sArr.length; //�հ谪�� �迭�� �� ( ����� ) ��ŭ ����
		
		return avg; 
	}
	
	
	

}
