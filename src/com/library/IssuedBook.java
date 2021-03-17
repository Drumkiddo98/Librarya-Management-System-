package com.library;

public class IssuedBook {
	String sID;
	String bID;
	
	
	public IssuedBook(String sID, String bID) {
		this.sID = sID;
		this.bID = bID;
	}
	public String getsID() {
		return sID;
	}
	public void setsID(String sID) {
		this.sID = sID;
	}
	public String getbID() {
		return bID;
	}
	public void setbID(String bID) {
		this.bID = bID;
	}
}
