package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.DB;
import com.library.Student;


@WebServlet("/addstudent")
public class AddStudent extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String studName= req.getParameter("studname");
		String studMail= req.getParameter("studmail");
		String studPass= req.getParameter("studpass");
		DB db= new DB();
		Student st = new Student(studName, 0, 0, studMail, studPass);
		db.addStudent(st);
		RequestDispatcher rd= req.getRequestDispatcher("index.html");
		rd.forward(req, res);		
	}

}
