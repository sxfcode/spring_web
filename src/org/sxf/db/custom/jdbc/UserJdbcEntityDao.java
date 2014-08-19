package org.sxf.db.custom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sxf.db.common.jdbc.JdbcEntityDao;
import org.sxf.db.custom.UserVo;

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
public class UserJdbcEntityDao extends JdbcEntityDao{

	@Autowired
	private UserJdbcEntityMappingQuery userEntityMappingQuery;
	
	@SuppressWarnings("unused")
	public void queryInOldStyle() throws Exception {
		// step 1:加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// step2:获取数据库连接
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/mydb", "root", "");
		// step3:创建动态查询
		PreparedStatement ps = con.prepareStatement("select * from user");
		// step4:执行查询
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			// 根据索引获取字段数据
			String column0 = rs.getString(1);
			// 根据字段名获取字段数据
			String name = rs.getString("name");
			String password = rs.getString("password");
			System.out.println("name:"+name+",password:"+password);
		}
		// step5:关闭资源
		rs.close();
		ps.close();
		con.close();

	}
	
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
		this.getJdbcTemplate().execute("insert into `user` (`id`, `name`, `password`, `age`, `sex`) values('18','xiaowang','123456','18','0');");
		throw new RuntimeException();
	}
	
	public void queryManual() throws ClassNotFoundException{
		 Class.forName("com.mysql.jdbc.Driver") ;   
	}

}
