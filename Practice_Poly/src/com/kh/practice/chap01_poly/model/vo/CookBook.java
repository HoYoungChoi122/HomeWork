package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	private boolean coupon; // 요리학원 쿠폰 유무
	
	
	public CookBook(String title,String author,String publisher,boolean coupon) {
		super(title,author,publisher);
		this.coupon = coupon;
			
	}
	public void setCounpon(boolean coupon) {
		this.coupon = coupon;
	}
	public boolean getCoupon() {
		return coupon;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CookBook ["+super.toString()+" "+", coupon="+coupon+"]";
	}
	

}
