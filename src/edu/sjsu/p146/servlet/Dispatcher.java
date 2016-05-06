package edu.sjsu.p146.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sjsu.p146.service.Book;
import edu.sjsu.p146.service.BookService;
import edu.sjsu.p146.service.LoginService;
import edu.sjsu.p146.service.UserService;

/**
 * Servlet implementation class Dispatcher
 */

@WebServlet("/Dispatcher")

public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;
	private BookService bookService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Dispatcher() {
		super();
		this.userService = new UserService();
		this.bookService = new BookService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = request.getServletPath();
		String path = "";
		System.out.println("URL : " + url);
		
		if (url.equals("/") || url.equals("/logout.do")) { 
			path = "WEB-INF/jsps/login.jsp";
			
		} else if (url.equals("/login.do")) {
			LoginService loginService = new LoginService(this.userService); //new LoginService Object
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String msg = "";

			if (loginService.loginUser(username, password)) {
				msg = "Successfully Logged In";
				path = "WEB-INF/jsps/search.jsp";

			} else {
				msg = "LOGIN FAILED";
				path = "WEB-INF/jsps/login.jsp";

			}
			request.setAttribute("message", msg);
			
		} else if (url.equals("/registerPage.do")) {
			path = "WEB-INF/jsps/register.jsp";
			
		} else if (url.equals("/register.do")) {
			
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String message = this.userService.registerUser(firstName, lastName, username, password);
			
			if (message.equals("SUCCESS")) {
				path = "WEB-INF/jsps/search.jsp";
			} else {
				path = "WEB-INF/jsps/register.jsp";
				request.setAttribute("message", message);
			}
			
		} else if (url.equals("/searchresults.do")) {

			String title = request.getParameter("title");
			String author = request.getParameter("author");
			String isbn = request.getParameter("isbn");

			List<Book> books = this.bookService.search(title, author, isbn);

			request.setAttribute("books",
					(Book[]) books.toArray(new Book[books.size()]));

			path = "WEB-INF/jsps/library.jsp";
			
		} else if (url.equals("/account.do")) {
			path = "WEB-INF/jsps/account.jsp";
		}

		System.out.println("Path" + path);
		RequestDispatcher rd = request.getRequestDispatcher(path);

		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
