package com.kh.practice.snack.veiw;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		String kind;
		String name;
		String flavor;
		int numOf;
		int price;
		char answer;
		
		System.out.print("���� : ");
		kind = sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("�� : ");
		flavor = sc.nextLine();
		System.out.print("���� : ");
		numOf = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		price = sc.nextInt();
		sc.nextLine();
		scr.saveData(kind,name,flavor,numOf,price);
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�? (Y/N) : ");
		answer = sc.nextLine().charAt(0);
		if(answer == 'y'||answer =='Y') {
			String result = scr.confirmData();
			System.out.print(result);
		}
		
	}
	
	
}
