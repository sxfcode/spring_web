package org.sxf.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Interface UserAnnotation.
 * 自定义注解,包含参数name,value,number
 *
 * @date 2014-8-6 17:16:32
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UserAnnotation {
	String name();
	String value();
	int number() default 0;

}
