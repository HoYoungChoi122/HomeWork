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
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.println("�޴� ��ȣ :");
			scNum = sc.nextInt();
			sc.nextLine();
			switch(scNum) {
			
			case 1 : fileSave();
					break;
			case 2 : fileOpen();
					break;
			case 3 : fileEdit();
					break;
			case 9 : System.out.println("���α׷��� �����մϴ�.");
					break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���");
				
			}
		}while(scNum!=9);
		// �߸� �Է����� ��� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.�� ��� �� ��
	}
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		String file = null;
		String scStr;
		char ans ='n';
		
		do {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ��� ");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�. ");
			System.out.print("���� :");
			scStr = sc.nextLine();
			if(!scStr.equals("ex��it")) {
				sb.append(scStr);
				sb.append("\n");
			}
		}while(!scStr.equals("ex��it"));	
		
		do {
		System.out.print("���ϸ��� �Է��ϼ��� : ");
		file = sc.nextLine();
		if(!fc.checkName(file)) {
			fc.fileSave(file, sb);
			break;
		}
		else {
			System.out.println("������ �ֽ��ϴ�. ����ðڽ��ϱ�? y/n");{
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
		System.out.print("���ϸ��� �Է��ϼ��� : ");
		file = sc.nextLine();
		prStr = fc.fileOpen(file);
		System.out.println(prStr);
	}
	public void fileEdit() {
		String file;
		String scStr;
		StringBuilder sb = new StringBuilder();
		System.out.print("������ ���� �� : ");
		file = sc.nextLine();
		do {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ��� ");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�. ");
			System.out.print("���� :");
			scStr = sc.nextLine();
			if(!scStr.equals("ex��it")) {
				sb.append(scStr);
				sb.append("\n");
			}
		}while(!scStr.equals("ex��it"));	
		
		
		fc.fileEdit(file, sb);
		
		
		
		
	}
	

}
