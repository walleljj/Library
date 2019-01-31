package bean;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

import util.DateUtil;

public class Repair {
	// ��ʼ��ͼ��
	public void rBooks() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"));
		HashMap<String, Books> map = new HashMap<String, Books>();
		Books books = new Books("T0001", "java����", "�ŷ�", "�廪��ѧ������", true);
		Books books1 = new Books("T0002", "HTML/CSS�̳�", "����", "���ӹ�ҵ������", true);
		Books books2 = new Books("T0003", "��ҳ�����̳�", "��ϰΰ", "���ӹ�ҵ������", true);
		Books books3 = new Books("T0004", "������������", "��־��", "�������ӿƼ���ѧ������", true);
		Books books4 = new Books("T0005", "����ͨ������������", "����", "�ߵȽ���������", true);
		Books books5 = new Books("T0006", "��ѧ�밮��", "ϰ��ƽ", "�廪��ѧ������", true);
		Books books6 = new Books("T0007", "��������������Ա", "����", "�廪��ѧ������", true);
		Books books7 = new Books("T0008", "����̸��", "�", "�廪��ѧ������", true);
		Books books8 = new Books("T0009", "�ִ���������", "������", "���ӹ�ҵ������", true);
		Books books9 = new Books("T0010", "��Ϣϵͳԭ���빤��", "������", "���ӹ�ҵ������", true);
		Books books10 = new Books("T0011", "������ʵ����", "����������", "���ӹ�ҵ������", true);
		Books books11 = new Books("T0012", "��ҳ�����̳�", "����", "�廪��ѧ������", true);
		Books books12 = new Books("T0013", "��ҳ�����̳�", "�ŷ�", "�廪��ѧ������", true);
		map.put("T0001", books);
		map.put("T0002", books1);
		map.put("T0003", books2);
		map.put("T0004", books3);
		map.put("T0005", books4);
		map.put("T0006", books5);
		map.put("T0007", books6);
		map.put("T0008", books7);
		map.put("T0009", books8);
		map.put("T0010", books9);
		map.put("T0011", books10);
		map.put("T0012", books11);
		map.put("T0013", books12);
		oos.writeObject(map);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map2 = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map2.keySet();
		for (String key : keys) {
			System.out.println(map2.get(key).toString());
		}
		ois.close();
	}

	// ��ʼ������
	public void rReader() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("reader.txt"));
		HashMap<String, Reader> map = new HashMap<String, Reader>();
		Reader reader = new Reader("123", "123", "���", 20, "��");
		Reader reader1 = new Reader("456", "456", "������", 19, "��");
		map.put("123", reader);
		map.put("456", reader1);
		oos.writeObject(map);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reader.txt"));
		HashMap<String, Reader> map2 = (HashMap<String, Reader>) ois.readObject();
		Set<String> keys = map2.keySet();
		for (String key : keys) {
			System.out.println(map2.get(key).toString());
		}
		ois.close();
	}

	// ��ʼ��������Ϣ
	public void rJieyue() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jieyue.txt"));
		HashMap<String, Jieyue> map = new HashMap<String, Jieyue>();
		Jieyue j1 = new Jieyue("999", "T0001", new DateUtil().getThisDay());
		map.put("123", j1);
		oos.writeObject(map);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jieyue.txt"));
		HashMap<String, Jieyue> map2 = (HashMap<String, Jieyue>) ois.readObject();
		Set<String> keys = map2.keySet();
		for (String key : keys) {
			System.out.println(map2.get(key).toString());
		}
		ois.close();
	}

	// ��ʼ������Ա
	public void rLi() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("librarian.txt"));
		HashMap<String, Librarian> map = new HashMap<String, Librarian>();
		Librarian libr = new Librarian("789", "789", "���", 20, "��");
		map.put("789", libr);
		oos.writeObject(map);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarian.txt"));
		HashMap<String, Librarian> map2 = (HashMap<String, Librarian>) ois.readObject();
		Set<String> keys = map2.keySet();
		for (String key : keys) {
			System.out.println(map2.get(key).toString());
		}
		ois.close();
	}

}
