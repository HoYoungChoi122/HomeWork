package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		int scNum;
		
		System.out.print("정수를 입력하세요 : ");
		scNum = sc.nextInt();
		for(int i = 1; i<=scNum; i++) {
			if(i%2 == 0) {
				System.out.print("수");
			}
			else {
				System.out.print("박");
			}
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int scNum;
		do {
			
				System.out.print("정수를 입력하세요 : ");
				scNum = sc.nextInt();
				if(scNum>1) {
					for(int i = 1; i<=scNum; i++) {
						if(i%2 == 0) {
							System.out.print("수");
						}
						else {
							System.out.print("박");
						}
					}
				}
				else {
					System.out.println("양수가 아닙니다.");
				}
	
		}while(scNum<1);
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		char ch;
		int sum = 0;
		String scStr;
		
		System.out.print("문자열 : " );
		scStr = sc.nextLine();
		System.out.print("문자 : ");
		ch = sc.next().charAt(0);
		sc.nextLine();
		
		for(int i=0; i<scStr.length(); i++) {
			if (ch ==scStr.charAt(i)) {
				sum++;
			}
		}
		System.out.println();
		System.out.printf("%s 안에 포함된 %c 개수 : %d",scStr,ch,sum);

	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int scNum;
		int sum=0;
		char scCh;
		char answer;
		String scStr;
		do {
			System.out.print("문자열을 입력하세요 : ");
			scStr = sc.nextLine();
			System.out.print("문자 : ");
			scCh = sc.nextLine().charAt(0);
			
			for(int a =0; a<scStr.length(); a++) {
				if(scStr.charAt(a)==scCh) {
					sum++;
				}
			}
			System.out.println("포함된 개수 : "+sum);
			System.out.print("더하시겠습니까? (y/n) : ");
			answer = sc.nextLine().charAt(0);
			if(!(answer =='y')||!(answer == 'n')) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}
		}while(!(answer == 'n'));
	}
}
