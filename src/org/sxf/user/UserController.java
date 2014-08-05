package org.sxf.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	/**
	 * Prints the.
	 *
	 * @return the string
	 */
	@RequestMapping("/user")
	@ResponseBody
	public String print(){
		System.out.println("do print");
		return "helloworld";
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
