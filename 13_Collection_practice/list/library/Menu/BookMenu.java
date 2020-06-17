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
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료 ");
			System.out.print("메뉴 번호 선택 :");
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
					System.out.println("프로그램을 종료합니다");
					break;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");

			}
			
		
		
		}while(scNum!=9);
	}
	public void insertBook() {
		String title;
		String author;
		String category;
		int price;
		
		System.out.println("도서명 : ");
		title = sc.nextLine();
		System.out.println("저자명 :");
		author = sc.nextLine();
		System.out.println("장르 : ");
		category = sc.nextLine();
		System.out.println("가격 : ");
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
		System.out.print("검색할 키워드를 입력하세요 : ");
		keyword = sc.nextLine();
		searchList=bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		}
		for(int a=0; a<searchList.size(); a++) {
			System.out.print(searchList.get(a)+"\n");
		}
		
		
	}
	public void deleteBook() {
		String title;
		String author;
		System.out.print("삭제할 도서 명 : ");
		title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		author = sc.nextLine();
		
		if(bc.deleteBook(title, author)==null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		else {
			System.out.println("성공적으로 삭제하였습니다.");
		}
	
		
	}
	public void ascBook() {
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("정렬 성공");
		}
		else {
			System.out.println("정렬 실패");
		}
		
	}
	
	

}
