package org.sxf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * The Class UserAdvice.
 * 基于xml的aop配置范例
 * @date 2014-8-6 18:22:00
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Component
public class UserAdvice {
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable{  
        System.out.println("aop-xml:doAround start"); 
        System.out.println("aop-xml:doAround Method:<"+pjp.getSignature().getDeclaringTypeName()+"."+pjp.getSignature().getName()+"> will do");
        Object result = null;
        try {
        	long beginTime = System.currentTimeMillis();
            //执行该方法
        	result = pjp.proceed();
            long endTime = System.currentTimeMillis();
            System.out.println("aop-xml:doAround Method:<"+pjp.getSignature().getDeclaringTypeName()+"."+pjp.getSignature().getName()+">耗时"+(endTime-beginTime)+"ms");
		} catch (Exception e) {
			System.out.println("UserAdvice aroud捕获异常");
			e.printStackTrace();
		}
        System.out.println("aop-xml:doAround end");  
        return result;  
    } 
}
