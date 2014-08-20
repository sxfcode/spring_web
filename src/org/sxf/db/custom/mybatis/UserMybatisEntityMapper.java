package org.sxf.db.custom.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserMybatisEntityMapper {
	@Select("select * from user where id=#{userId}")
	public UserMybatisEntity getUser(@Param("userId") String userId);

	@Select("select * from user")
	public List<UserMybatisEntity> query();

}
