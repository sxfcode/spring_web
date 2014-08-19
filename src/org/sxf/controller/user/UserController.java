package org.sxf.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sxf.aop.UserAnnotation;
import org.sxf.db.custom.UserVo;
import org.sxf.db.custom.hibernate.UserHibernateEntityDao;
import org.sxf.db.custom.hibernate.UserLogHibernateEntityDao;
import org.sxf.db.custom.jdbc.UserJdbcEntityDao;

/**
 * The Class UserController.
 *
 * @date 2014-8-4 15:44:57
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Controller
public class UserController {
	
	@Autowired
	private UserJdbcEntityDao userJdbcEntityDao;
	
	@Autowired
	private UserHibernateEntityDao userHibernateEntityDao;
	
	@Autowired
	private UserLogHibernateEntityDao userLogHibernateEntityDao; 
	
	/**
	 * 该方法演示了注解和responseBody的用法
	 *
	 * @return the string
	 */
	@UserAnnotation(name = "ua", value = "ua_value")
	@RequestMapping("/user")
	@ResponseBody
	public String print(){
		System.out.println("do print");
		return "helloworld";
	}
	
	/**
	 * 该方法演示了对注入dao的使用
	 * @return
	 */
	@RequestMapping("/query")
	@ResponseBody
	public String query(){
		System.out.println("do query");
		//userEntityDao.queryUser();
		//userJdbcEntityDao.queryUserByMapping();
		//userHibernateEntityDao.queryByTemplate();
//		userHibernateEntityDao.queryByHql();
//		userHibernateEntityDao.queryByCriteria();
//		userHibernateEntityDao.queryByNativeSql();
		try {
			userJdbcEntityDao.queryInOldStyle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "helloworld query";
	}
	
	@UserAnnotation(name = "ua", value = "ua_value")
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(){
		System.out.println("do insert");
		userJdbcEntityDao.insert();
		return "helloworld insert";
	}
	
	
	@RequestMapping("/userView")
	public String showUserViewJsp(){
		return "userView";
	}
	
	@RequestMapping("/forwardUser")
	public String forwardUserJsp(){
		return "forward:/jsp/forwardUser.jsp";
	}
	
	@RequestMapping("/redirectUser")
	public String redirectUserJsp(){
		return "redirect:/jsp/redirectUser.jsp";
	}
	
	@RequestMapping("/content")
    public String getContent( ModelMap model ) {
		model.addAttribute("model", new UserVo());
        return "userView";
    }
	

	public void listBeans(HttpServletRequest request){
		//WebApplicationContext wac =WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
	}
	

	public void init(){
		System.out.println("=========================do UserController init");
	}
	
	
public void initByAnnotation(){
		System.out.println("=========================do UserController 1");
	}
		
	

public void destroyByAnnotation(){
		System.out.println("=========================do UserController 3");
	}
	
	

	public void destroy(){
		System.out.println("=========================do UserController destroy");
	}

}
