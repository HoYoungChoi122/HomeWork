package com.kh.practice.chap01_poly.veiw;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibrayMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	
	public LibrayMenu() {
		
	}
	public void mainMenu() {
		int age;
		int menuNum;
		char gender;
		String name;
		Member mem;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		gender = sc.nextLine().charAt(0);
		mem = new Member(name,age,gender);
		lc.insertMember(mem);
		
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1.  마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			if(menuNum == 1) {
				System.out.println(lc.myinfo());
			}
			else if(menuNum == 2) {
				selectAll();
			}
			else if(menuNum == 3) {
				searchBook();
			}
			else if(menuNum == 4) {
				rentBook();
			}
			else if(menuNum == 9) {
				break;
			}
			else {
				System.out.println("메뉴를 잘못 입력하셨습니다. ");
			}
			
		}while(!(menuNum==9));
		
	}
	public void selectAll() {
		Book[] bList = new Book[5];
		
		bList = lc.selectAll();
		for(int a=0; a<bList.length; a++) {
			System.out.print(a+"번도서 : ");
			System.out.println(bList[a]);
		}
	}
	
	public void searchBook() {
		String keyWord;
		Book[] searchList;
		
		System.out.print("검색할 키워드 : ");
		keyWord = sc.nextLine();
		searchList = lc.searchBook(keyWord);
		
		for(int a=0; a<searchList.length; a++) {
			System.out.println(searchList[a]);
		}
		
	}
	public void rentBook() {
		selectAll();
		int index;
		int result = 0;
		
		System.out.print("대여할 도서 번호 선택 : ");
		index = sc.nextInt();
		sc.nextLine();
		result = lc.rentBook(index);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}
		else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능 입니다.");
		}
		else if(result == 2){
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
		
	}
	
}
