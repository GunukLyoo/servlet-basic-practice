package edu;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/bookOutput")
public class BookTest2Servlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		Book book = (Book)req.getAttribute("book");
		
		out.print("<h3>å���� : " + book.getTitle()  + "</h3>");
		out.print("<h3>å���� : " + book.getAuthor() + "</h3>");
		out.print("<h3>���ǻ� : " + book.getPublisher() + "</h3>");
		
		out.close();
	}

}