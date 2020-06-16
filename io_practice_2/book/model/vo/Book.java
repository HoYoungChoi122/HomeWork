package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2399295748996127844L;
	
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
	
	public Book() {
		
	}
	public Book(String title,String author,int price, Calendar date,double discount) {
		this.title = title;
		this.author = author;
		this.price  = price;
		this.date = date;;
		this.discount = discount;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDate(Calendar date) {
		 this.date = date;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getTitle() {
		return title;
	}
	public String setAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public Calendar getDate() {
		return date;
	}
	public double getDiscount() {
		return discount;
	}
	@Override
	public String toString() {
		SimpleDateFormat ft = new SimpleDateFormat("YYYY³â MM¿ù ddÀÏ");
		long time = date.getTimeInMillis();
		Date day = new Date(time);
		
		return title+"      "+author+"      "+price+"   "+ft.format(day)+"   "+discount;
	}
	
	

}
