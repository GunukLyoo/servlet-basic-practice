package edu;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/initParamTest", 
			initParams = { @WebInitParam(name = "id", value = "guest"),
							@WebInitParam(name = "password", value = "1004")})
public class InitParamServlet extends HttpServlet{
	
	String id, password;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		id=config.getInitParameter("id");
		password=config.getInitParameter("password");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h2>서블릿 초기 추출 변수 </h2>");
		out.print("<h3>ID : " + id + "</h3>");
		out.print("<h3>PASSWORD : " + password + "</h3>");
		out.close();
	}
}
