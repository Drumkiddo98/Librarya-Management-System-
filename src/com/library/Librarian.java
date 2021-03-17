package com.library;

public class Librarian {
	static int inc=1;
	String libName;
	String libEmail;
	String libPass;
	int librarianId;
	
	public Librarian(String libName, String libEmail, String libPass) {
		this.librarianId=inc++;
		this.libName = libName;
		this.libEmail = libEmail;
		this.libPass = libPass;
	}
	
	public int getLibrarianId() {
		return librarianId;
	}
	

	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {

		this.libName = libName;
	}
	
	public String getLibEmail() {
		return libEmail;
	}
	public void setLibEmail(String libEmail) {
		this.libEmail = libEmail;
	}
	
    public String getLibPass() {
		return libPass;
	}
	public void setLibPass(String libPass) {
		this.libPass = libPass;
	}

}
