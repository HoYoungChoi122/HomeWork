package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		
	}
	public int countAlpha (String s) throws CharCheckException {
		int sum=0;
		
		for(int a = 0; a< s.length(); a++) {
			if(s.charAt(a)==' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다. ");
			}
			else if(s.charAt(a)>='a'&&s.charAt(a)<='z'||s.charAt(a)>='A'&&s.charAt(a)<='Z'){
				sum++;
			}
		}
		return sum;
		
		
	}
	

}
