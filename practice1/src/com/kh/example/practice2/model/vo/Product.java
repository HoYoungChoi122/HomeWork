package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private String brand;
	private int price;
	
	public Product() {		
		//기본 생성자
	}
	
	public void information() {
		
		System.out.print(pName+"상품의 가격은 :"+price+"이며 브랜드는 : "+brand+"입니다.");
		
		
	}

}
