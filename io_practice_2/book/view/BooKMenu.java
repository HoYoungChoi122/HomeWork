package com.kh.practice.book.view;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controlller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BooKMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	Book[] bArr = new Book[1];
	
	public BooKMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
		
	}
	public void mainMenu() {

		
		int scNum;	
		do {
			System.out.println("1. ���� �߰� ����");
			System.out.println("2. ���� ���� ���");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ :");
			scNum = sc.nextInt();
			sc.nextLine();
			switch(scNum) {
				case 1 : fileSave();
					break;
				case 2 : fileRead();
					break;
				case 9 : System.out.println("���α׷� ���� ");
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); 
			}	
		}while(scNum != 9);
	}
	public void fileSave() {
		String title = null;
		String author = null;
		String scDay;
		String[] day;
		int price = 0;
		Calendar date1 = Calendar.getInstance();
		double discount = 0;
		
		System.out.print("���� �� :");
		title = sc.nextLine();
		System.out.print("���� �� :");
		author = sc.nextLine();
		System.out.print("���� ���� :");
		price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���� ��¥(yyyy-mm-dd) :");
		scDay = sc.nextLine();
		day = scDay.split("-");
		int year = Integer.parseInt(day[0]);
		int month = Integer.parseInt(day[1]);
		int date = Integer.parseInt(day[2]);
		date1.set(year, month, date);		
		
		System.out.println("������ :");
		discount = sc.nextDouble();
		sc.nextLine();
		
		for(int a = 0; a<bArr.length; a++) {
			if(bArr[a]==null) {
			bArr[a] = new Book(title,author,price,date1,discount);
			break;
			}
			
		}
		Book[] bArr = Arrays.copyOf(this.bArr,this.bArr.length+1);
		
		bc.fileSave(bArr);
	}
	public void fileRead() {
		bArr = bc.fileRead();
		
		for(Book a : bArr) {
			if(a != null) {
			System.out.println(a);
			}
			
		}
	}

}
