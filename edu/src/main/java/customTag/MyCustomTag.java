package customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("�����±׸� �������ϴ�.");
		return super.doStartTag();
	}
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("���±׸� �������ϴ�.");
		return super.doEndTag();
	}


	
}
