package com.kh.practice.point.veiw;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		int scNum;
		
		do {
			System.out.println("===== �޴� =====");
			System.out.println("1.��");
			System.out.println("2.�簢��");
			System.out.println("3.������");
			System.out.print("�޴���ȣ : ");
			scNum = sc.nextInt();
			sc.nextLine();
			
			if(scNum == 1) {
				circleMenu();
				
			}
			else if(scNum == 2) {
				rectangleMenu();
			}
			else {
				System.out.println("�����մϴ�.");
				break;
			}		
		}while(!(scNum==3));
		
		
		
		
		
	}

	public void circleMenu() {
		int scNum;
		
		System.out.println("===== �� �޴� =====");
		System.out.println("1.�� �ѷ�");
		System.out.println("2.�� ����");
		System.out.println("3.��������");
		System.out.print("�޴���ȣ : ");
		scNum = sc.nextInt();
		sc.nextLine();
		
		
				
		if(scNum == 1) {
			calcCircum();
			
		}
		else if (scNum ==2) {
			calcCircleArea();
			
		}
	
		
			
	}
	public void rectangleMenu() {
		int scNum;
		
		System.out.println("===== �� �޴� =====");
		System.out.println("1.�簢�� �ѷ�");
		System.out.println("2.�簢�� ����");
		System.out.println("3.��������");
		System.out.print("�޴���ȣ : ");
		scNum = sc.nextInt();
		sc.nextLine();
				
		if(scNum == 1) {
			calcPerimeter();
			
		}
		else if (scNum ==2) {
			calcRectArea();
			
		}
		
		
	}
	
	public void calcCircum() {
		int x;
		int y;
		int radius;
		
		System.out.print("x ��ǥ: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("y ��ǥ: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ : ");
		radius = sc.nextInt();
		sc.nextLine();
		System.out.println("�ѷ� : "+x+","+y+", "+cc.calcArea(x, y, radius));
	
		
	}
	public void calcCircleArea() {
		int x;
		int y;
		int radius;
		
		System.out.print("x ��ǥ: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("y ��ǥ: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ : ");
		radius = sc.nextInt();
		sc.nextLine();
		System.out.println("���� : "+x+","+y+","+cc.calcCircum(x, y, radius));

		
	}
	public void calcPerimeter() {
		int scNum;
		int x;
		int y;
		int width;
		int height;
		
		System.out.print("x ��ǥ: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("y ��ǥ: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		height = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ʺ� : ");
		width = sc.nextInt();
		sc.nextLine();
		
		System.out.println("�ѷ� : "+x+","+y+", "+rc.calcPerimeter(x, y, width, height));

		
	}
	public void calcRectArea() {
		int scNum;
		int x;
		int y;
		int width;
		int height;
		
		System.out.print("x ��ǥ: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("y ��ǥ: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		height = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ʺ� : ");
		width = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���� : "+x+","+y+","+rc.calcArea(x, y, width, height));
		
		
	}

}
