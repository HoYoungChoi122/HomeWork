package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];
	
	public BookDAO() {}
	
	public void fileSave(Book[] bArr) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));){
		
		if(!(bArr == null)) {	
			oos.writeObject(bArr);
		}
		
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public Book[] fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));){
			
			while( ois.read() != -1) {
				bArr = (Book[])ois.readObject();
			}
		
		} catch(EOFException e) {
			return bArr;
		} catch (IOException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return bArr;
	}
	
	
}
