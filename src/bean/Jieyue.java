package bean;

import java.io.Serializable;

public class Jieyue implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String readerId;// ����id
	private String boookId;// ���ĵ�ͼ��id
	private String date;// ���ĵ��������

	public Jieyue(String readerId, String boookId, String date) {
		super();
		this.readerId = readerId;
		this.boookId = boookId;
		this.date = date;
	}

	public String getReaderId() {
		return readerId;
	}

	public void setReaderId(String readerId) {
		this.readerId = readerId;
	}

	public String getBoookId() {
		return boookId;
	}

	public void setBoookId(String boookId) {
		this.boookId = boookId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Jieyue [readerId=" + readerId + ", boookId=" + boookId + ", date=" + date + "]";
	}

}
