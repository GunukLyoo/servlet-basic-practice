package edu;

import javax.servlet.http.*;

public class TestSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("���� ��ü ����");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("���� ��ü ����");
	}

	public TestSessionListener() {
		// TODO Auto-generated constructor stub
		System.out.println("TestSessionListener ��ü ����");
	}
	
}
