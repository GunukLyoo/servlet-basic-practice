package edu;

import javax.servlet.http.*;

public class TestSessionAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("技记 按眉俊 加己 眠啊");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("技记 按眉俊 眠啊等 加己 昏力");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("技记 按眉俊 眠啊等 加己 措眉");
	}

	public TestSessionAttributeListener() {
		// TODO Auto-generated constructor stub
		System.out.println("TestSessionAttributeListener 按眉 积己");
	}
	
	

}
