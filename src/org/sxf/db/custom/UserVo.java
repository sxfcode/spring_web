package org.sxf.db.custom;

/**
 * The Class UserVo.
 *
 * @date 2014-8-5 21:38:29
 * @author 宿晓斐
 * @version 1.0
 * @since jdk 1.6,spring_web 1.0
 */
public class UserVo {
	/** id. */
	private int id;

	/** name. */
	private String name;
	
	/** password. */
	private String password;
	
	/** sex. */
	private int sex;

	/** age. */
	private int age;

	/**
	 * Instantiates a new UserVo.
	 */
	public UserVo() {
//		this.id = 1;
//		this.name = "test";
//		this.age = 18;
//		this.sex = "man";
	}

	/**
	 * Gets id.
	 *
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id
	 *            comments
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets name.
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name.
	 *
	 * @param name
	 *            comments
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets age.
	 *
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets age.
	 *
	 * @param age
	 *            comments
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets password.
	 *
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets password.
	 *
	 * @param password
	 *            comments
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "UserVo [id=" + id + ", name=" + name + ", password=" + password
				+ ", sex=" + sex + ", age=" + age + "]";
	}
}
