package edu;

import java.io.IOException;

import javax.servlet.*;

public class FlowFilterTwo implements Filter{
	String charset;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() ȣ�� ......... two");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding(charset);
		System.out.println("doFilter() ȣ�� �� ......... two");
		chain.doFilter(request, response);
		System.out.println("doFilter() ȣ�� �� ......... two");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() ȣ�� ......... two");
		charset = filterConfig.getInitParameter("en");
	}
	
}
