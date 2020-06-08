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
			System.out.println("===== 메뉴 =====");
			System.out.println("1.원");
			System.out.println("2.사각형");
			System.out.println("3.끝내기");
			System.out.print("메뉴번호 : ");
			scNum = sc.nextInt();
			sc.nextLine();
			
			if(scNum == 1) {
				circleMenu();
				
			}
			else if(scNum == 2) {
				rectangleMenu();
			}
			else {
				System.out.println("종료합니다.");
				break;
			}		
		}while(!(scNum==3));
		
		
		
		
		
	}

	public void circleMenu() {
		int scNum;
		
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1.원 둘레");
		System.out.println("2.원 넓이");
		System.out.println("3.메인으로");
		System.out.print("메뉴번호 : ");
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
		
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1.사각형 둘레");
		System.out.println("2.사각형 넓이");
		System.out.println("3.메인으로");
		System.out.print("메뉴번호 : ");
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
		
		System.out.print("x 좌표: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("y 좌표: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		sc.nextLine();
		System.out.println("둘레 : "+x+","+y+", "+cc.calcArea(x, y, radius));
	
		
	}
	public void calcCircleArea() {
		int x;
		int y;
		int radius;
		
		System.out.print("x 좌표: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("y 좌표: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		sc.nextLine();
		System.out.println("넓이 : "+x+","+y+","+cc.calcCircum(x, y, radius));

		
	}
	public void calcPerimeter() {
		int scNum;
		int x;
		int y;
		int width;
		int height;
		
		System.out.print("x 좌표: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("y 좌표: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("높이 : ");
		height = sc.nextInt();
		sc.nextLine();
		
		System.out.print("너비 : ");
		width = sc.nextInt();
		sc.nextLine();
		
		System.out.println("둘레 : "+x+","+y+", "+rc.calcPerimeter(x, y, width, height));

		
	}
	public void calcRectArea() {
		int scNum;
		int x;
		int y;
		int width;
		int height;
		
		System.out.print("x 좌표: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("y 좌표: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("높이 : ");
		height = sc.nextInt();
		sc.nextLine();
		
		System.out.print("너비 : ");
		width = sc.nextInt();
		sc.nextLine();
		
		System.out.println("넓이 : "+x+","+y+","+rc.calcArea(x, y, width, height));
		
		//맞는건강
	}

}
