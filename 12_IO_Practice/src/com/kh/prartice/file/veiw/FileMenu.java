package com.kh.prartice.file.veiw;

import java.util.Scanner;

import com.kh.prartice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public FileMenu() {}
	
	public void MainMenu() {
		int scNum;
		do {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 :");
			scNum = sc.nextInt();
			sc.nextLine();
			switch(scNum) {
			
			case 1 : fileSave();
					break;
			case 2 : fileOpen();
					break;
			case 3 : fileEdit();
					break;
			case 9 : System.out.println("프로그램을 종료합니다.");
					break;
			default : System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
				
			}
		}while(scNum!=9);
		// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반
	}
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		String file = null;
		String scStr;
		char ans ='n';
		
		do {
			System.out.println("파일에 저장할 내용을 입력하세요 ");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다. ");
			System.out.print("내용 :");
			scStr = sc.nextLine();
			if(!scStr.equals("ex끝it")) {
				sb.append(scStr);
				sb.append("\n");
			}
		}while(!scStr.equals("ex끝it"));	
		
		do {
		System.out.print("파일명을 입력하세요 : ");
		file = sc.nextLine();
		if(!fc.checkName(file)) {
			fc.fileSave(file, sb);
			break;
		}
		else {
			System.out.println("파일이 있습니다. 덮어쓰시겠습니까? y/n");{
				ans = sc.nextLine().charAt(0);
				if(ans =='y') {
					fc.fileSave(file, sb);
				}
			}
		}
		}while(ans !='y');
		
	}
	public void fileOpen() {
		String file;
		StringBuilder prStr;
		System.out.print("파일명을 입력하세요 : ");
		file = sc.nextLine();
		prStr = fc.fileOpen(file);
		System.out.println(prStr);
	}
	public void fileEdit() {
		String file;
		String scStr;
		StringBuilder sb = new StringBuilder();
		System.out.print("수정할 파일 명 : ");
		file = sc.nextLine();
		do {
			System.out.println("파일에 저장할 내용을 입력하세요 ");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다. ");
			System.out.print("내용 :");
			scStr = sc.nextLine();
			if(!scStr.equals("ex끝it")) {
				sb.append(scStr);
				sb.append("\n");
			}
		}while(!scStr.equals("ex끝it"));	
		
		
		fc.fileEdit(file, sb);
		
		
		
		
	}
	

}
