package com.library;

 public class Student {
	
	static int inc=1;
	int studId;
	String studName;
	int year;
	int numOfBooksTaken;
	String studMail;
	String studPass;
	Book bk;
	
	public Student(String studName, int year, int numOfBooksTaken, String studMail, String studPass) {
		studId=inc++;
		this.studName = studName;
		this.year = year;
		this.numOfBooksTaken = numOfBooksTaken;
		this.studMail = studMail;
		this.studPass = studPass;
	}
	public int getStudentId() {
		return studId;
	}
	
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNumOfBooksTaken() {
		return numOfBooksTaken;
	}
	public void setNumOfBooksTaken(int numOfBooksTaken) {
		this.numOfBooksTaken = numOfBooksTaken;
	}
	public String getStudMail() {
		return studMail;
	}
	public void setStudMail(String studMail) {
		this.studMail = studMail;
	}
	public String getStudPass() {
		return studPass;
	}
	public void setStudPass(String studPass) {
		this.studPass = studPass;
	}
	
}


