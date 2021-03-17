package com.servlets;

import com.library.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addbook")
public class AddBook extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String bookName= req.getParameter("bookname");
		String bookAuthor= req.getParameter("bookauthor");
		String bookPrice= req.getParameter("bookprice");
		Book bk = new Book(bookName, bookAuthor, bookPrice,true);
		DB db = new DB();
		db.addBook(bk);
		req.getRequestDispatcher("libhome.html").forward(req, res);
	}

}
