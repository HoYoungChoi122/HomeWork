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
		bList[0] = new CookBook("�������� ����", "������", "tvN", true); 
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19); 
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12); 
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true); 
	}
	
	public LibraryController() {
		
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;	
		
		//���޹��� mem �ּҰ��� ���� LibraryController�� mem�� ����
	}
	
	public Member myinfo() {
		//ȸ�� ���۷���(mem) �ּҰ� ���� 
		return mem;
	}
	public Book[] selectAll() {
		
		return bList;
	}
	public Book[] searchBook(String keyWord) {
		
		Book[] bkList = new Book[5];
		int count=0;
		
		//���޹��� Ű���尡 ���Ե� ������ ������ ������ �� ������ �˻��� ������ ����� book��ä�迭�� ����
		//�����ϰ� for���� ���� bList �ȿ�������� ���޹��� Ű���带 ���Ͽ� �����ϰ� �ִ� ��� ���ο� �迭�� �������� ���
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
				result = 1; // ������������ ���� �뿩 �Ұ�
			}
		}
		else if(bList[index] instanceof CookBook){
			if(((CookBook)bList[index]).getCoupon()==true) {
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2; //���������� �뿩, �丮�п� ���� �߱�
			}
		}
		
	
		
		return result;
	}

}
