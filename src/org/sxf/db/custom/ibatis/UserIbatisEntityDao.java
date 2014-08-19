package org.sxf.db.custom.ibatis;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.sxf.db.common.ibatis.IbatisEntityDao;

/**
 * The Class UserIbatisEntityDao.
 *
 * @date 2014-8-19 14:58:31
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Repository
public class UserIbatisEntityDao extends IbatisEntityDao {
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public void query(){
		List<UserIbatisEntity> result = getSqlMapClientTemplate().queryForList("listUser");
		System.out.println(result);
	}
	
	@SuppressWarnings("deprecation")
	public void insert(){
		getSqlMapClientTemplate().insert("insertUser");
		//throw new RuntimeException("test"); 测试事务执行情况
	}

}
