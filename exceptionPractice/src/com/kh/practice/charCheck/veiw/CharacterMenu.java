package com.kh.practice.charCheck.veiw;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		
		String scStr;
		int a=0;
		System.out.print("문자열을 입력하세요 : ");
		scStr = sc.nextLine();
		
		try {
			a = cc.countAlpha(scStr);
			System.out.println("문자열의 갯수 : "+a);
			
		} catch (CharCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
