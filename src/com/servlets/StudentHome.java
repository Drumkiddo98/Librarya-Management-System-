package com.servlets;

import java.io.IOException;


import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.library.DB;




import javax.servlet.http.HttpServletRequest;
@WebServlet("/studhome")

public class StudentHome extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String studMail = req.getParameter("studmail");
		String studPass = req.getParameter("studpass");
		PrintWriter out = res.getWriter();
		DB db= new DB();
		if((db.checkValidity(studMail,studPass,1))) {
			HttpSession session = req.getSession();
			session.setAttribute("studmail", studMail);
			req.getRequestDispatcher("studenthome.html").forward(req, res);	
		}
		else {
				out.println("Error");
//			RequestDispatcher rd=req.getRequestDispatcher("index.html");
//     		rd.forward(req, res);	
			
		}
		
		
	}

}
