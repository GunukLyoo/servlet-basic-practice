package edu;

import javax.servlet.*;

public class TestRequestListener implements ServletRequestListener{

	public TestRequestListener() {
		// TODO Auto-generated constructor stub
		System.out.println("TestRequestListener 按眉 积己");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("HttpServletRequest 按眉 秦力");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("HttpServletRequest 按眉 檬扁拳");
	}
	
}
