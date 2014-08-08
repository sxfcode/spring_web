package org.sxf.db.common.jdbc;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Dao框架父类，
 * 所有实体类Dao需要继承该类，以使用jdbcTemplate.
 *
 * @date 2014-8-7 16:49:14
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
@Repository
public class JdbcEntityDao {
	
	/** dataSource. */
	@Autowired
	@Qualifier("jdbcDataSource")
	private DataSource dataSource;
	
	/** jdbcTemplate. */
	private JdbcTemplate jdbcTemplate;
	
	/** 占位符JdbcTemplate. */
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	/**
	 * 通过初始化方法完成jdbcTemplate的构造
	 */
	public void init(){
		System.out.println("JdbcEntityDao init");
		// 判空，避免重复构造
		if(this.jdbcTemplate==null){
			System.out.println(this);
			this.jdbcTemplate = new JdbcTemplate(this.dataSource);
			this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
			try {
				System.out.println("注入数据源:"+this.jdbcTemplate.getDataSource().getConnection().getMetaData().getURL());
			} catch (SQLException e) {
				System.out.println("注入数据源失败");
				e.printStackTrace();
			}
		}
	}

	/**
	 * Gets dataSource.
	 *
	 * @return dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * Sets dataSource.
	 *
	 * @param dataSource comments
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * Gets jdbcTemplate.
	 *
	 * @return jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * Sets jdbcTemplate.
	 *
	 * @param jdbcTemplate comments
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Gets namedParameterJdbcTemplate.
	 *
	 * @return namedParameterJdbcTemplate
	 */
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	/**
	 * Sets namedParameterJdbcTemplate.
	 *
	 * @param namedParameterJdbcTemplate comments
	 */
	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
}
