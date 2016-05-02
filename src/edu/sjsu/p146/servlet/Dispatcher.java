package edu.sjsu.p146.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sjsu.p146.service.LoginService;

/**
 * Servlet implementation class Dispatcher
 */
@WebServlet("/Dispatcher")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dispatcher() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String url = request.getServletPath();
		String path = "";
		
		System.out.println("URL : "+ url);
		
		if(url.equals("/")){
			path = "WEB-INF/jsps/login.jsp";
		}else if(url.equals("/login.do")){
			LoginService loginService = new LoginService();
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String msg = "";
			
			if(loginService.loginUser(username, password)){
				msg = "Successfully Logged In";
				path = "WEB-INF/jsps/sample.jsp";	
				
			}else{
				msg = "Login Failed";
				path = "WEB-INF/jsps/login.jsp";	
				
			}
			request.setAttribute("message", msg);
		}
		
		System.out.println("Path"+ path);
		 RequestDispatcher rd = request.getRequestDispatcher(path);
		 
		 rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
