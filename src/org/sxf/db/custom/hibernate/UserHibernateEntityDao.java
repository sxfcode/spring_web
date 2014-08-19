package org.sxf.db.custom.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.sxf.db.common.hibernate.HibernateEntityDao;

/**
 * The Class UserEntityDao.
 * user查询类,
 * 若用户定义的Dao类继承HibernateEntityDao，要添加init初始化方法，务必要先调用一下父类的init方法，以完成泛型类型的写入。
 * 
 * 
 * @date 2014-8-7 18:01:25
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Repository
public class UserHibernateEntityDao extends HibernateEntityDao<UserHibernateEntity>{
	public void init(){
		super.init();
	}
	
	

	public void queryByTemplate(){
		List<UserHibernateEntity> result = findByHibernateTemplate("from UserHibernateEntity");
		if (result!=null&&result.size()>0) {
			for (UserHibernateEntity t : result) {
				System.out.println(t.toString());
			}
		}
	}
	
	/**
	 * queryUser.
	 */
	public void queryByHql(){
		List<UserHibernateEntity> result = findByHql("from UserHibernateEntity");
		if (result!=null&&result.size()>0) {
			for (UserHibernateEntity t : result) {
				System.out.println(t.toString());
			}
		}
	}
	
	public void queryByCriteria(){
		List<Criterion> conditions = new ArrayList<Criterion>();
		conditions.add(Restrictions.like("name", "x"));
		conditions.add(Restrictions.eq("age", 17));
		List<UserHibernateEntity> result =findByCriteria(conditions);
		if (result!=null&&result.size()>0) {
			for (UserHibernateEntity t : result) {
				System.out.println(t.toString());
			}
		}
		
	}
	@SuppressWarnings("rawtypes")
	public void queryByNativeSql(){
		List result = findByNativeSql("select * from user");
		if (result!=null&&result.size()>0) {
			for (Object o : result) {
				System.out.println(o.toString());
			}
		}
		
	}
	
	
	/**
	 * insert.
	 */
	public void insert(){
		UserHibernateEntity ue = new UserHibernateEntity();
		ue.setAge(17);
		ue.setName("小明");
		ue.setPassword("123");
		ue.setSex(1);
		save(ue);
	}

}
