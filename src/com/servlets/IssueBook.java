package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.DB;
import com.library.IssuedBook;
@WebServlet("/issuebook")
public class IssueBook extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String bookID= req.getParameter("bookid");
		String studID= req.getParameter("studid");
		DB db = new DB();
		if(db.checkStudent(studID)) {
		IssuedBook ib= new IssuedBook(studID, bookID);
		db.issuebook(ib);	
		req.getRequestDispatcher("libhome.html").forward(req, res);
	}
		else {
			req.getRequestDispatcher("libhome.html").forward(req, res);
		}
	}
		
}
