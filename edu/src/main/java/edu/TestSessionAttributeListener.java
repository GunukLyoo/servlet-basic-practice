package edu;

import javax.servlet.http.*;

public class TestSessionAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("���� ��ü�� �Ӽ� �߰�");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("���� ��ü�� �߰��� �Ӽ� ����");
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("���� ��ü�� �߰��� �Ӽ� ��ü");
	}

	public TestSessionAttributeListener() {
		// TODO Auto-generated constructor stub
		System.out.println("TestSessionAttributeListener ��ü ����");
	}
	
	

}
