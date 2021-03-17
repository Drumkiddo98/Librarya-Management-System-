package com.servlets;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.DB;
import com.library.Librarian;

@WebServlet("/addlibrarian")
public class AddLibrarian extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{
		String libName= req.getParameter("libname");
		String libMail= req.getParameter("libmail");
		String libPass= req.getParameter("libpass");
		String libSecretCode= req.getParameter("secretcode");
		int a=1;
		DB db = new DB();
 		if(libSecretCode.equals("11")) {
		Librarian lb = new Librarian(libName, libMail, libPass);
		db.addLibrarian(lb);
		req.getRequestDispatcher("index.html").forward(req, res);
	}
 		else {
 			req.getRequestDispatcher("index.html").forward(req, res); 			
}
	}
}
