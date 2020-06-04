package com.kh.example.education.model.vo;

public class Academy {
	private String academy;
	private String acaAddr;
	private String name;
	private char classroom;
	
	public Academy() {
		
	}
	
	public Academy(String academy, String acaAddr, String name, char classroom) {
		this.academy = academy;
		this.acaAddr = acaAddr;
		this.name = name;
		this.classroom = classroom;		
	}
	public void setAcademy(String academy) {
		this.academy = academy;	
	}
	public void setAcaAddr(String acaAddr) {
		this.acaAddr = acaAddr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setClassRoom(char classroom) {
		this.classroom = classroom;
	}
	public String getAcademy() {
		return academy;
	}
	public String getAcaAdrr() {
		return acaAddr;
	}
	public String getName() {
		return name;
	}
	public char getClassroom() {
		return classroom;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+acaAddr+" "+name+" "+classroom;
	}
	

}
