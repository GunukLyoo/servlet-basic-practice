package edu;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/errorTest1")
public class ErrorTest1Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		try {
			String getquery = req.getQueryString();
			out.print("Query : " + getquery + "<br>");
			out.print("Query ���� : " + getquery.length() + "<br>");
		} catch(Exception e) {
			out.print("��û�� ó���ϴ� ���� ������ �߻��Ͽ����ϴ� : " + e);
		}
		
		out.print("Done!");
		out.close();
	}

}
