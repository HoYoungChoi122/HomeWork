package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}
	
	public Book(String title,String author,String category,int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+title+"/"+author+"/"+category+"/"+price+")";
	}
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME*result+(title==null?0:title.hashCode());
		result = PRIME*result+(author==null?0:author.hashCode());
		result = PRIME*result+(category==null?0:category.hashCode());
		result = PRIME*result+price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		else if(obj == null) {
			return false;
		}
		else if(this.getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book)obj;
		
		if(title == null) {
			if(other.title != null) {
				return false;
			}
		}
		else if(!title.equals(other.title)) {
			return false;
		}
		
		if(!author.equals(other.author)) {
			return false;
		}
		
		if(!category.equals(other.category)) {
			return false;
		}
		
		if(price != other.price) {
			return false;
		}
		
		
		return true;
	}

	@Override
	public int compareTo(Book o) {
		
		
		return title.compareTo(o.title);
	}
	
	
	
}
