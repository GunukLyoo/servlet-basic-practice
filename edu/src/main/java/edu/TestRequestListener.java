package edu;

import javax.servlet.*;

public class TestRequestListener implements ServletRequestListener{

	public TestRequestListener() {
		// TODO Auto-generated constructor stub
		System.out.println("TestRequestListener ��ü ����");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("HttpServletRequest ��ü ����");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("HttpServletRequest ��ü �ʱ�ȭ");
	}
	
}
