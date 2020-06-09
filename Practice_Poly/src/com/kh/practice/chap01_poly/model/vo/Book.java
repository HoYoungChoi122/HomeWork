package com.kh.practice.chap01_poly.model.vo;

public class Book {
	private String title; // 도서명 
	private String author; //저자명 
	private String publisher; // 출판사 명
	
	
	public Book() {
		
	}
	public Book(String title,String author,String publisher) {
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		
	}
	
	@Override
	public String toString() {
		
		return "[Book [title="+title+", author="+author+", publisher="+publisher+"]";
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}

}
