package com.kh.practice.list.library.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	List<Book> list = new ArrayList<Book>();
	
	public BookController() {
		list.add(new Book("�ڹ��� ����","���ü�","��Ÿ",20000));
		list.add(new Book("���� ���� �˰�","������","��Ÿ",15000));
		list.add(new Book("��ȭ�� ���","������","�ι�",17500));
		list.add(new Book("�� ����","�ڽſ�","�Ƿ�",21000));
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	public ArrayList<Book> selectList() {
		
		return (ArrayList<Book>)list;
	}
	
	public ArrayList<Book> searchBook(String keyword){
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(int a=0; a<list.size(); a++) {
			if(list.get(a).getTitle().contains(keyword)) {
				searchList.add(list.get(a));
	
			}
			else if(list.get(a).getAuthor().contains(keyword)) {
				searchList.add(list.get(a));
	
			}
			else if(list.get(a).getCategory().contains(keyword)) {
				searchList.add(list.get(a));

				
			}
//			else if(list.get(a).getPrice() == Integer.parseInt(keyword)) {
//				searchList.add(list.get(a));
//			}
			
		}
		
//		if(list.contains(new Book(keyword,keyword,keyword,Integer.parseInt(keyword)))) {
//			al1.add(list.get(list.indexOf(new Book(keyword,keyword,keyword,Integer.parseInt(keyword)))));	
//		}
		
		
		return searchList;
	}
	
	public Book deleteBook(String title,String author) {
		Book removeBook = new Book();
		removeBook = null;
		
		for(int a=0; a<list.size(); a++) {
			if(list.get(a).getAuthor().equals(author)&&list.get(a).getTitle().equals(title)) {
				removeBook = list.get(a);
				list.remove(a);	
			}
		}
		
		
		
		return removeBook;
	}
	public int ascBook() {
		
		Collections.sort(list);
		
		return 1;
	}

}
