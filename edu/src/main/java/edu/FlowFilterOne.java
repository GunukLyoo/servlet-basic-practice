package edu;

import java.io.IOException;
import javax.servlet.*;

public class FlowFilterOne implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() ȣ�� ......... one");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("doFilter() ȣ�� �� ......... one");
		chain.doFilter(request, response);
		System.out.println("doFilter() ȣ�� �� ......... one");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() ȣ�� ......... one");
	}
	
}
