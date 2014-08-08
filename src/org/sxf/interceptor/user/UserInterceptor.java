package org.sxf.interceptor.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * The Class UserInterceptor.
 *
 * @date 2014-8-5 21:39:11
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
public class UserInterceptor implements HandlerInterceptor{
	
	/**
	 * init.
	 */
	public void init(){
		System.out.println("UserInterceptor init");
	}

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("UserInterceptor do afterCompletion");
	}
	
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("UserInterceptor do postHandle");
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		System.out.println("UserInterceptor do preHandle");
		return true;
	}
}
