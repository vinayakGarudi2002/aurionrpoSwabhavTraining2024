package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		
		response.setContentType("text/html");
		String name=request.getParameter("uname");
		
//		Cookie cokie = new Cookie("name",name);
//		
//		response.addCookie(cokie);
		session.setAttribute("name", name);
		PrintWriter writer = response.getWriter();
		writer.print("Welcome: " + request.getParameter("uname"));
		writer.println("<form action=\"PasswordController\">  \r\n" + 
	              "<input type=\"text\" name=\"password\">  \r\n" + 
	              "<input type=\"submit\" value=\"launch\"><br/>  \r\n" + 
	              "</form>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
