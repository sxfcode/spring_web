package org.sxf.db.custom.mybatis;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The Interface UserMybatisEntityDao.
 * 该类相当于mybatis中的映射文件
 *
 * @date 2014-8-20 14:24:01
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Component
public class UserMybatisEntityDao extends MapperFactoryBean<UserMybatisEntityMapper>{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	public void init(){
		super.setMapperInterface(UserMybatisEntityMapper.class);
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	public void query(){
		try {
			System.out.println(super.getObject().query());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
