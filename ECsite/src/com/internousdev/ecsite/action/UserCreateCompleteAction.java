package com.internousdev.ecsite.action;

	import java.sql.SQLException;
	import java.util.Map;
	import org.apache.struts2.interceptor.SessionAware;
	import com.opensymphony.xwork2.ActionSupport;
	import com.internousdev.ecsite.dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	private String loginUserId;
}
