package com.kh.practice.chap01_poly.controller;

import java.util.Arrays;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = new Member();
	private Book[] bList = new Book[5];
	
	{	
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true); 
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19); 
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12); 
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true); 
	}
	
	public LibraryController() {
		
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;	
		
		//전달받은 mem 주소값을 통해 LibraryController의 mem에 대입
	}
	
	public Member myinfo() {
		//회원 레퍼런스(mem) 주소값 리턴 
		return mem;
	}
	public Book[] selectAll() {
		
		return bList;
	}
	public Book[] searchBook(String keyWord) {
		
		Book[] bkList = new Book[5];
		int count=0;
		
		//전달받은 키워드가 포함된 도서가 여러개 존재할 수 있으니 검색된 도서를 담아줄 book객채배열을 새로
		//생성하고 for문을 통해 bList 안에도서들과 전달받은 키워드를 비교하여 포함하고 있는 경우 새로운 배열에 차곡차곡 담기
		for(int a =0; a<bList.length; a++) {
			if(bList[a].toString().contains(keyWord)) {
				bkList[count] = bList[a];
				count++;
			}
		}	
		bkList = Arrays.copyOf(bkList,count);
		
		
		return bkList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			if(mem.getAge()<((AniBook)bList[index]).getAccessAge()) {
				result = 1; // 나이제한으로 인한 대여 불가
			}
		}
		else if(bList[index] instanceof CookBook){
			if(((CookBook)bList[index]).getCoupon()==true) {
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2; //성공적으로 대여, 요리학원 쿠폰 발급
			}
		}
		
	
		
		return result;
	}

}
