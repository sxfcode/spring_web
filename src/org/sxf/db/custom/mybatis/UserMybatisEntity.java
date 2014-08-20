package org.sxf.db.custom.mybatis;

public class UserMybatisEntity {
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserMybatisEntity [id=" + id + ", name=" + name + ", password="
				+ password + ", sex=" + sex + ", age=" + age + "]";
	}

}
