package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
	private int lotto[] = new int[6];
	//�ʱ�ȭ �� ��� 
	//�ߺ����� �ʴ� 1~45������ ������� 6�� �ʱ�ȭ;
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
