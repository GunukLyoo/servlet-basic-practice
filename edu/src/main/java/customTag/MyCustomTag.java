package customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("�����±׸� �������ϴ�.");
		//return super.doStartTag();
		//return EVAL_BODY_INCLUDE;
		return SKIP_BODY;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("Body ó���� �������ϴ�.");
		return super.doAfterBody();
	}
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("���±׸� �������ϴ�.");
		return super.doEndTag();
	}


	
}
