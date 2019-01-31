package bean;

import java.io.Serializable;

//储存读者信息
public class Reader implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;// 读者id
	private String password;// 读者密码
	private String name;// 读者姓名
	private int age;// 管理员年龄
	private String sex;// 管理员性别

	public Reader(String id, String password, String name, int age, String sex) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// 无参构造函数
	public Reader() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Reader [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
