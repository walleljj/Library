package bean;

import java.io.Serializable;

//ͼ������������ͼ����Ϣ
public class Books implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;// ͼ����
	private String name;// ����
	private String author;// ����
	private String press;// ������
	private boolean state;// �Ƿ��ڼ�
	// �޲εĹ��췽��

	public Books() {

	}

	// �������Ĺ��췽��
	public Books(String id, String name, String author, String press, boolean state) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.press = press;
		this.state = state;
	}

	// ������Ϣ�͵õ���Ϣ
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", press=" + press + ", state=" + state
				+ "]";
	}

}
