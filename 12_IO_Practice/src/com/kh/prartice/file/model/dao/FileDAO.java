package com.kh.prartice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
		
	public FileDAO() {}
	
	public boolean checkName(String file) {
		File f1 = new File(file);		
		
		return f1.exists();
	}
	
	public void fileSave(String file, String s) {
		try(FileWriter f1 = new FileWriter(file);) {
			f1.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();	
		try(FileReader fr =new FileReader(file);) {
			
		int value;
			
		while((value = fr.read()) != -1) {
					sb.append((char)value);
		}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		
		return sb;
		
	}
	public void fileEdit(String file,String s) {
		try(FileWriter fw = new FileWriter(file,true);) {
			fw.write(s);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
