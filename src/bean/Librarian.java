package bean;

import java.io.Serializable;

//����ͼ�����Ա��Ϣ
public class Librarian implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id; // ����Ա�û���
	private String password;// ����Ա����
	private String name;// ����Ա����
	private int age;// ����Ա����
	private String sex;// ����Ա�Ա�

	public Librarian(String id, String password, String name, int age, String sex) {

		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Librarian [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", sex=" + sex
				+ "]";
	}

}
