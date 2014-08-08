package org.sxf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * The Class UserAspect.
 * 基于注解的aop配置范例
 *
 * @date 2014-8-6 15:09:20
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Component
@Aspect
@Order(2)
public class UserAspect {

	/**
	 * 扫描某包或子包下的方法.
	 */
	@Pointcut("within(org.sxf.user..*)")
	public void inPackageAndSubPackage() {
		System.out.println("do inPackageAndSubPackage");
	}
	
	@Before("within(org.sxf.user..*)")
	public void doBefore(){
		System.out.println("UserAspect do before");
	}
	
	@After("within(org.sxf.user..*)")
	public void doAfter(){
		System.out.println("UserAspect do after");
	}
	
    @AfterThrowing("within(org.sxf.user..*)")  
    public void doAfterThrow(){  
        System.out.println("例外通知");  
    }  
      
    @Around("within(org.sxf.user..*)")  
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable{  
    	  System.out.println("aop-annotation:doAround start");  
          long beginTime = System.currentTimeMillis();
          //执行该方法
          Object object = pjp.proceed();
          long endTime = System.currentTimeMillis();
          System.out.println("aop-annotation:doAround Method:<"+pjp.getSignature().getDeclaringTypeName()+"."+pjp.getSignature().getName()+">耗时"+(endTime-beginTime)+"ms");
          System.out.println("aop-annotation:doAround end");  
          return object;  
    } 

}
