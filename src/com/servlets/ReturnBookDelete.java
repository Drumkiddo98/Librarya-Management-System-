package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("returnbookdelete")
public class ReturnBookDelete extends HttpServlet {
	public void service( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String bID= req.getParameter("bookid");
		System.out.println("Book ID"+bID);
		req.getRequestDispatcher("returnbooks.jsp").forward(req, res);
		
	}

}
