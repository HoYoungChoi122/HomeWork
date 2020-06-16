package com.kh.practice.book.controlller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
    BookDAO bd = new BookDAO();
	
	public void makeFile() {
		File f1 = new File("book.txt");

		if (!f1.isFile()) {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
				
	}
	public Book[] fileRead() {
		
		return bd.fileRead();
	}

}
