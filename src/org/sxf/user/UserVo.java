package org.sxf.user;


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

	/** age. */
	private int age;

	/** sex. */
	private String sex;
	
	/**
	 * Instantiates a new UserVo.
	 */
	public UserVo(){
		this.id=1;
		this.name="test";
		this.age=18;
		this.sex="man";
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
	 * @param id comments
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
	 * @param name comments
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
	 * @param age comments
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets sex.
	 *
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Sets sex.
	 *
	 * @param sex comments
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
}
