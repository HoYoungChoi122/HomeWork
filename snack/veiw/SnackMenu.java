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
		
		System.out.print("종류 : ");
		kind = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("맛 : ");
		flavor = sc.nextLine();
		System.out.print("개수 : ");
		numOf = sc.nextInt();
		sc.nextLine();
		System.out.print("가격 : ");
		price = sc.nextInt();
		sc.nextLine();
		scr.saveData(kind,name,flavor,numOf,price);
		System.out.print("저장한 정보를 확인하시겠습니까? (Y/N) : ");
		answer = sc.nextLine().charAt(0);
		if(answer == 'y'||answer =='Y') {
			String result = scr.confirmData();
			System.out.print(result);
		}
		
	}
	
	
}
