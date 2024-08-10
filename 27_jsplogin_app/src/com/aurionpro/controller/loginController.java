package com.aurionpro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.model.DbUtil;


@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       RequestDispatcher requestDispatcher = null;
       
       DbUtil dbUtil=DbUtil.DbUtilObject();
       dbUtil.connectToDb();
       
      
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        
        
       
        
        
        if (dbUtil.validateUser(name, password)) {
        	 request.setAttribute("username", name);
            requestDispatcher = request.getRequestDispatcher("loginSuccess.jsp");
        } else {
          
            requestDispatcher = request.getRequestDispatcher("loginFailed.jsp");
        }
        
     
        requestDispatcher.forward(request, response);
		
	 
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
