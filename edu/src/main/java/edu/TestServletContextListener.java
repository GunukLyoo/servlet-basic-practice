package edu;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext ��ü ����");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext ��ü �ʱ�ȭ");
	}

	public TestServletContextListener() {
		// TODO Auto-generated constructor stub
		System.out.println("TestServletContextListener ��ü ����");
	}

}
