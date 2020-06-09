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
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		gender = sc.nextLine().charAt(0);
		mem = new Member(name,age,gender);
		lc.insertMember(mem);
		
		do {
			System.out.println("==== �޴� ====");
			System.out.println("1.  ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
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
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�. ");
			}
			
		}while(!(menuNum==9));
		
	}
	public void selectAll() {
		Book[] bList = new Book[5];
		
		bList = lc.selectAll();
		for(int a=0; a<bList.length; a++) {
			System.out.print(a+"������ : ");
			System.out.println(bList[a]);
		}
	}
	
	public void searchBook() {
		String keyWord;
		Book[] searchList;
		
		System.out.print("�˻��� Ű���� : ");
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
		
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		index = sc.nextInt();
		sc.nextLine();
		result = lc.rentBook(index);
		
		if(result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}
		else if(result == 1) {
			System.out.println("���� �������� �뿩 �Ұ��� �Դϴ�.");
		}
		else if(result == 2){
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
		
	}
	
}
