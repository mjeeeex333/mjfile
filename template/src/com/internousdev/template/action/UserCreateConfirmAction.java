package com.internousdev.template.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;



public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object>session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;

		if(!(loginUserId.equals(""))
				&&!(loginPassword.equals("")))
	}

}
