package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		int scNum;
		
		System.out.print("������ �Է��ϼ��� : ");
		scNum = sc.nextInt();
		for(int i = 1; i<=scNum; i++) {
			if(i%2 == 0) {
				System.out.print("��");
			}
			else {
				System.out.print("��");
			}
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int scNum;
		do {
			
				System.out.print("������ �Է��ϼ��� : ");
				scNum = sc.nextInt();
				if(scNum>1) {
					for(int i = 1; i<=scNum; i++) {
						if(i%2 == 0) {
							System.out.print("��");
						}
						else {
							System.out.print("��");
						}
					}
				}
				else {
					System.out.println("����� �ƴմϴ�.");
				}
	
		}while(scNum<1);
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		char ch;
		int sum = 0;
		String scStr;
		
		System.out.print("���ڿ� : " );
		scStr = sc.nextLine();
		System.out.print("���� : ");
		ch = sc.next().charAt(0);
		sc.nextLine();
		
		for(int i=0; i<scStr.length(); i++) {
			if (ch ==scStr.charAt(i)) {
				sum++;
			}
		}
		System.out.println();
		System.out.printf("%s �ȿ� ���Ե� %c ���� : %d",scStr,ch,sum);

	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int scNum;
		int sum=0;
		char scCh;
		char answer;
		String scStr;
		do {
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			scStr = sc.nextLine();
			System.out.print("���� : ");
			scCh = sc.nextLine().charAt(0);
			
			for(int a =0; a<scStr.length(); a++) {
				if(scStr.charAt(a)==scCh) {
					sum++;
				}
			}
			System.out.println("���Ե� ���� : "+sum);
			System.out.print("���Ͻðڽ��ϱ�? (y/n) : ");
			answer = sc.nextLine().charAt(0);
			if(!(answer =='y')||!(answer == 'n')) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}while(!(answer == 'n'));
	}
}
