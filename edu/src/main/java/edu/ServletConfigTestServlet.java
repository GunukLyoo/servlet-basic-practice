package edu;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/servletConfigTest", initParams = {@WebInitParam(name = "charset", value = "UTF-8")})
public class ServletConfigTestServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String env = this.getInitParameter("charset");
		req.setCharacterEncoding(env);
		out.print("<h3> ¿Ã∏ß : " + req.getParameter("name"));
		out.close();
	}
	
}
