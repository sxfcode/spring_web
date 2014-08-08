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
public class UserAdvice2 {
	
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable{  
        System.out.println("aop-xml:doAround2 start");  
        long beginTime = System.currentTimeMillis();
        //执行该方法
        Object object = pjp.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("aop-xml:doAround2 Method:<"+pjp.getSignature().getDeclaringTypeName()+"."+pjp.getSignature().getName()+">耗时"+(endTime-beginTime)+"ms");
        System.out.println("aop-xml:doAround2 end");  
        return object;  
    } 

}
