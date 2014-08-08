package org.sxf.db.custom;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sxf.db.common.jdbc.JdbcEntityDao;

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
public class UserEntityDao extends JdbcEntityDao{

	@Autowired
	private UserEntityMappingQuery userEntityMappingQuery;
	
	/**
	 * queryUser.
	 */
	public void queryUser(){
		List<Map<String,Object>> result = this.getJdbcTemplate().queryForList("select * from user ");
		System.out.println(result);
	}
	
	public void queryUserByMapping(){
		UserVo userVo = userEntityMappingQuery.findObject(1);
		System.out.println(userVo);
	}
	
	/**
	 * insert.
	 */
	public void insert(){
		this.getJdbcTemplate().execute("insert into `user` (`id`, `name`, `password`, `age`, `sex`) values('20','xiaowang','123456','18','0');");
		throw new RuntimeException();
	}

}
