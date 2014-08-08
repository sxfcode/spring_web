package org.sxf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * The Class UserAnnotationProcessor.
 * 通过aop来处理注解.
 *
 * @date 2014-8-6 17:17:38
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Component
@Aspect
public class UserAnnotationProcessor {
	    @Around("within(org.sxf.controller..*) && @annotation(userAnnotiAnnotation)")  
	    public Object doAround(ProceedingJoinPoint pjp,UserAnnotation userAnnotiAnnotation) throws Throwable{
		    System.out.println("aop-annotation:doAround start userAnnotiAnnotation:"+userAnnotiAnnotation.name()+","+userAnnotiAnnotation.value());
	        long beginTime = System.currentTimeMillis();
	        //执行该方法
	        Object object = pjp.proceed();
	        long endTime = System.currentTimeMillis();
	        System.out.println("aop-annotation:doAround userAnnotiAnnotation:<"+pjp.getSignature().getDeclaringTypeName()+"."+pjp.getSignature().getName()+">耗时"+(endTime-beginTime)+"ms");
	        System.out.println("aop-annotation:doAround end");
	        return object;  
	    }
}
