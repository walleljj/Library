package bean;

import java.io.Serializable;

//���������Ϣ
public class Reader implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;// ����id
	private String password;// ��������
	private String name;// ��������
	private int age;// ����Ա����
	private String sex;// ����Ա�Ա�

	public Reader(String id, String password, String name, int age, String sex) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// �޲ι��캯��
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
