package com.servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.library.DB;
@WebServlet("/libhome")
public class LibrarianHome extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String admMail=  req.getParameter("adminmail");
		String admPass=  req.getParameter("adminpass");
		DB db= new DB();
		if(db.checkValidity(admMail,admPass,0)) {
			HttpSession session = req.getSession();
			session.setAttribute("admMail", admMail);
			RequestDispatcher rd=req.getRequestDispatcher("libhome.html");
			rd.forward(req, res);			
		}
		else {
			
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
     		rd.forward(req, res);	
			
		}
		
		
	}

}
