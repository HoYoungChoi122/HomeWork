package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		
	}
	public int countAlpha (String s) throws CharCheckException {
		int sum=0;
		
		for(int a = 0; a< s.length(); a++) {
			if(s.charAt(a)==' ') {
				throw new CharCheckException("üũ�� ���ڿ� �ȿ� ������ ���ԵǾ� �ֽ��ϴ�. ");
			}
			else if(s.charAt(a)>='a'&&s.charAt(a)<='z'||s.charAt(a)>='A'&&s.charAt(a)<='Z'){
				sum++;
			}
		}
		return sum;
		
		
	}
	

}
