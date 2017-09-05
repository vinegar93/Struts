package com.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction1 extends ActionSupport {

	private String name;

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}
	
	public String save() {
		
		ActionContext.getContext().put("message", "HelloAction1 save");
		return "success";
	}
	
	public String update() {
		
		ActionContext.getContext().put("message", "HelloAction1 update");
		return "success";
	}
	
	/**
	 * validate()���action�е����з���У�飬����save��update����
	 * ��У�飬��ִ��action�еĴ�����
	 */
	public void validate() {
		
		if(this.name==null || "".equals(this.name.trim())){
			this.addFieldError("name", "�û�������Ϊ��");
		}
	}
}
