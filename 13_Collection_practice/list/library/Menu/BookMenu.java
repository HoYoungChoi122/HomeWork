package com.kh.practice.list.library.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.kh.practice.list.library.Controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private BookController bc = new BookController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int scNum;
		
		do {
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ���� ");
			System.out.print("�޴� ��ȣ ���� :");
			scNum = sc.nextInt();
			sc.nextLine();
			switch(scNum) {
				case 1:
					insertBook();
					break;
				case 2:
					selectList();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					deleteBook();
					break;
				case 5:
					ascBook();
					break;
				case 9 : 
					System.out.println("���α׷��� �����մϴ�");
					break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");

			}
			
		
		
		}while(scNum!=9);
	}
	public void insertBook() {
		String title;
		String author;
		String category;
		int price;
		
		System.out.println("������ : ");
		title = sc.nextLine();
		System.out.println("���ڸ� :");
		author = sc.nextLine();
		System.out.println("�帣 : ");
		category = sc.nextLine();
		System.out.println("���� : ");
		price = sc.nextInt();
		sc.nextLine();
		
		bc.insertBook(new Book(title,author,category,price));
	}
	public void selectList() {
		ArrayList<Book> bookList;
		bookList = bc.selectList();
		for(int a=0; a<bookList.size(); a++) {
			System.out.print(bookList.get(a)+"\n");
		}
	}
	public void searchBook() {
		ArrayList<Book> searchList;
		
		String keyword;
		System.out.print("�˻��� Ű���带 �Է��ϼ��� : ");
		keyword = sc.nextLine();
		searchList=bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("�˻������ �����ϴ�.");
		}
		for(int a=0; a<searchList.size(); a++) {
			System.out.print(searchList.get(a)+"\n");
		}
		
		
	}
	public void deleteBook() {
		String title;
		String author;
		System.out.print("������ ���� �� : ");
		title = sc.nextLine();
		System.out.print("������ ���� �� : ");
		author = sc.nextLine();
		
		if(bc.deleteBook(title, author)==null) {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
		else {
			System.out.println("���������� �����Ͽ����ϴ�.");
		}
	
		
	}
	public void ascBook() {
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� ����");
		}
		
	}
	
	

}
