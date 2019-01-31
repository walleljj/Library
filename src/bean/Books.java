package bean;

import java.io.Serializable;

//图书类用来储存图书信息
public class Books implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;// 图书编号
	private String name;// 书名
	private String author;// 作者
	private String press;// 出版社
	private boolean state;// 是否在架
	// 无参的构造方法

	public Books() {

	}

	// 带参数的构造方法
	public Books(String id, String name, String author, String press, boolean state) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.press = press;
		this.state = state;
	}

	// 建立信息和得到信息
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
