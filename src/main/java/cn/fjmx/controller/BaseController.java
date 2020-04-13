package cn.fjmx.controller;

import javax.servlet.http.HttpSession;

/**
 * 控制器的基类
 */
abstract class BaseController {

	/**
	 * 响应正确时使用的状态码
	 */
	public static final Integer OK = 2000;
	
	/**
	 * 每页显示的信息条目数
	 */
	public static final Integer PAGESIZE = 10;
	
	/**
	 * 根据session获取用户id uid
	 * @param session 
	 * @return 用户id uid
	 */
	protected Integer getUidFromSession(HttpSession session) {
		return Integer.valueOf(session.getAttribute("uid").toString());
	}
	
	/**
	 * 根据session获取用户名 username
	 * @param session 
	 * @return 用户名 username
	 */
	protected String getUsernameFromSession(HttpSession session) {
		return session.getAttribute("username").toString();
	}
	
}
