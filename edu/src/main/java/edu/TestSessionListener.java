package edu;

import javax.servlet.http.*;

public class TestSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("技记 按眉 积己");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("技记 按眉 秦力");
	}

	public TestSessionListener() {
		// TODO Auto-generated constructor stub
		System.out.println("TestSessionListener 按眉 积己");
	}
	
}
