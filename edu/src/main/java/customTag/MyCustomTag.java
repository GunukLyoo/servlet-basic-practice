package customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("시작태그를 만났습니다.");
		//return super.doStartTag();
		//return EVAL_BODY_INCLUDE;
		return SKIP_BODY;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("Body 처리가 끝났습니다.");
		return super.doAfterBody();
	}
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("끝태그를 만났습니다.");
		return super.doEndTag();
	}


	
}
