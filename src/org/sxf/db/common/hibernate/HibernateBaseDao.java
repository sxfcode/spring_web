package org.sxf.db.common.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * The Class HibernateEntityDao.
 *
 * @param <T>
 *            the generic type
 * @date 2014-8-18 11:46:59
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Repository
public class HibernateBaseDao<T> {

	/** hibernateTemplate. */
	@Autowired
	private HibernateTemplate hibernateTemplate;

	/** 用来获取泛型类型. */
	
	
	
	




	/**
	 * Gets hibernateTemplate.
	 *
	 * @return hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * Sets hibernateTemplate.
	 *
	 * @param hibernateTemplate
	 *            comments
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * Gets sessionFactory.
	 *
	 * @return sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return this.hibernateTemplate.getSessionFactory();
	}

	/**
	 * save.
	 *
	 * @param t
	 *            comments
	 */
	public void save(T t) {
		hibernateTemplate.save(t);
	}

	/**
	 * delete.
	 *
	 * @param t
	 *            comments
	 */
	public void delete(T t) {
		hibernateTemplate.delete(t);
	}

	/**
	 * update.
	 *
	 * @param t
	 *            comments
	 */
	public void update(T t) {
		hibernateTemplate.update(t);
	}
	
	@SuppressWarnings("unchecked")
	public T get(Serializable id){
	return null;
	}
	
	@SuppressWarnings("unchecked")
	public T load(Serializable id){
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByHibernateTemplate(String hql) {
		return (List<T>)hibernateTemplate.find(hql);
	}
	
	

	/**
	 * findByHql. 使用hql进行查询
	 *
	 * @param hql
	 *            comments
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByHql(String hql) {
		Session session = getSessionFactory().openSession();
		List<T> result = (List<T>) session.createQuery(hql).list();
		return result;
	}

	/**
	 * findByCriteria. 使用Criteria对象进行查询 
	 * List cats =
	 * sess.createCriteria(Cat.class) .add( Restrictions.like("name", "F%")
	 * .addOrder( Order.asc("name") ) .addOrder( Order.desc("age") )
	 * .setMaxResults(50) .list();
	 *
	 * @param conditions
	 *            comments
	 * @return List
	 */
	public List<T> findByCriteria(List<Criterion> conditions) {
		return findByCriteria(conditions, null, null);
	}

	/**
	 * findByCriteria. 使用Criteria对象进行查询 
	 * example 
	 * List cats = sess.createCriteria(Cat.class) .add( Restrictions.like("name", "F%")
	 * .addOrder( Order.asc("name") ) .addOrder( Order.desc("age") )
	 * .setMaxResults(50) .list();
	 * 
	 * @param conditions
	 *            comments
	 * @param maxResult
	 *            comments
	 * @param order
	 *            comments
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(List<Criterion> conditions,
			Integer maxResult, Order order) {
		return null;
	}

	/**
	 * findByNativeSql. 使用原生Sql进行查询
	 *
	 * @param sql
	 *            comments
	 * @return List
	 */
	@SuppressWarnings("rawtypes")
	public List findByNativeSql(String sql) {
		Session session = getSessionFactory().openSession();
		List result = session.createSQLQuery(sql).list();
		return result;
	}
	
	
	
	
}
