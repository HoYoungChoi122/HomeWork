package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
	private int lotto[] = new int[6];
	//초기화 블럭 사용 
	//중복하지 않는 1~45까지의 난수들로 6개 초기화;
	{
			for(int a=0; a<lotto.length; a++) {
				lotto[a] = (int)(Math.random()*45+1);
				for(int b=0; b<a; b++) {
					if(lotto[a]==lotto[b]) {
						a--;
					}
					
				}
			}
			Arrays.sort(lotto);
	}
	public Lotto() {
		
	}
	
	public void information() {
		for(int a= 0; a<lotto.length; a++) {
			System.out.print(lotto[a]+" ");
		}
		
	}
}
