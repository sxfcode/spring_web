package org.sxf.db.custom.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.sxf.db.common.hibernate.HibernateEntityDao;

/**
 * The Class UserEntityDao.
 * user查询类,
 * 该类已经从JdbcEntityDao继承了dataSource
 * @date 2014-8-7 18:01:25
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Repository
public class UserHibernateEntityDao<T> extends HibernateEntityDao{

	
	/**
	 * queryUser.
	 */
	@SuppressWarnings("unchecked")
	public void queryUser(){
		List<T> result = this.getHibernateTemplate().find("from UserHibernateEntity");
		if (result!=null&&result.size()>0) {
			for (T t : result) {
				System.out.println(t.toString());
			}
		}
	}
	
	
	/**
	 * insert.
	 */
	public void insert(){
		throw new RuntimeException();
	}

}
