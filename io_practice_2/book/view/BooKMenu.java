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
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 :");
			scNum = sc.nextInt();
			sc.nextLine();
			switch(scNum) {
				case 1 : fileSave();
					break;
				case 2 : fileRead();
					break;
				case 9 : System.out.println("프로그램 종료 ");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); 
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
		
		System.out.print("도서 명 :");
		title = sc.nextLine();
		System.out.print("저자 명 :");
		author = sc.nextLine();
		System.out.print("도서 가격 :");
		price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("출판 날짜(yyyy-mm-dd) :");
		scDay = sc.nextLine();
		day = scDay.split("-");
		int year = Integer.parseInt(day[0]);
		int month = Integer.parseInt(day[1]);
		int date = Integer.parseInt(day[2]);
		date1.set(year, month, date);		
		
		System.out.println("할인율 :");
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
