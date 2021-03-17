package com.library;

import java.util.ArrayList;


public class DB {
	public static ArrayList<Student> studList= new ArrayList<Student>();
	public static ArrayList<Librarian> libList=new ArrayList<Librarian>();
	public static ArrayList<Book> bookList=new ArrayList<Book>();
	public static ArrayList<IssuedBook> issuedBookList=new ArrayList<IssuedBook>();

	
	public void issuebook(IssuedBook ib) {
		issuedBookList.add(ib);
		
	}
	public void addStudent(Student st) {
		studList.add(st);
	}
	
	public void addLibrarian(Librarian lb) {
		libList.add(lb);
	}
	
	public void addBook(Book bk) {		
		bookList.add(bk);		
	}
	
	
	public boolean checkStudent(String ID) {
		for (Student st : studList) {	
			if(ID.equals(String.valueOf(st.getStudentId())))
				return true;
		}
		return false;
	}
	
	public boolean checkValidity(String mail,String pass,int a) {
		if(a==1) {
		for (Student s : studList) {
			if((mail.equals(s.studMail)) && (pass.equals(s.studPass)))
				return true;
			
		}
		return false;
	}
		else {
			for (Librarian l : libList) {
				if(mail.equals(l.libEmail) && pass.equals(l.libPass))
					return true;
				
			}
			return false;
		}
			
		}
	
}
