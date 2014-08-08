package org.sxf.db.custom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Repository;

/**
 * The Class UserEntityMappingDao.
 * user查询类，直接映射UserVo对象
 *
 * @date 2014-8-7 18:02:30
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Repository
public class UserEntityMappingQuery extends MappingSqlQuery<UserVo> {
	
	@Autowired 
	public UserEntityMappingQuery(@Qualifier("jdbcDataSource") DataSource dataSource){
		super(dataSource, "select * from user where id = ?");
        super.declareParameter(new SqlParameter("id", Types.INTEGER));
        compile();
	}


	@Override
	protected UserVo mapRow(ResultSet rs, int rowNumber) throws SQLException {
		UserVo userVo = new UserVo();
		userVo.setId(rs.getInt("id"));
		userVo.setName(rs.getString("name"));
		userVo.setPassword(rs.getString("password"));
		userVo.setAge(rs.getInt("age"));
		userVo.setSex(rs.getInt("sex"));
		return userVo;
	}

}
