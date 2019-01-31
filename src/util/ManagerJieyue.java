package util;

import bean.Books;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

import bean.Jieyue;

public class ManagerJieyue {
	/**
	 * ���һ��������Ϣ
	 */
	public static void saveJieyue(String readerId, String bookId) throws Exception {
		// ���ӽ�����Ϣ
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jieyue.txt"));
		HashMap<String, Jieyue> map = (HashMap<String, Jieyue>) ois.readObject();
		ois.close();
		map.put(bookId, new Jieyue(readerId, bookId, new DateUtil().getThisDay()));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jieyue.txt"));
		oos.writeObject(map);
		oos.close();
		// �޸�ͼ��״̬
		HashMap<String, Books> map2 = new HashMap<String, Books>();
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("books.txt"));
		map2 = (HashMap<String, Books>) ois2.readObject();
		Books b = map2.get(bookId);
		b.setState(false);
		map2.remove(bookId);
		map2.put(bookId, b);
		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("books.txt"));
		oos2.writeObject(map2);
		oos2.close();
	}

	// �ж��Ƿ����ɾ��
	public static boolean couldDelet(String readerId, String bookId) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jieyue.txt"));
		HashMap<String, Jieyue> map = (HashMap<String, Jieyue>) ois.readObject();
		ois.close();
		Set<String> key = map.keySet();
		if (key.contains(bookId) && (map.get(bookId).getReaderId().equals(readerId))) {
			return true;
		} else
			return false;
	}

	/**
	 * ɾ��������Ϣ
	 */
	public static void deletJieyue(String readerId, String bookId) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jieyue.txt"));
		HashMap<String, Jieyue> map = (HashMap<String, Jieyue>) ois.readObject();
		ois.close();
		map.remove(bookId);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jieyue.txt"));
		oos.writeObject(map);
		oos.close();
		// �޸�ͼ��״̬
		HashMap<String, Books> map2 = new HashMap<String, Books>();
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("books.txt"));
		map2 = (HashMap<String, Books>) ois2.readObject();
		Books b = map2.get(bookId);
		b.setState(true);
		map2.remove(bookId);
		map2.put(bookId, b);
		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("books.txt"));
		oos2.writeObject(map2);
		oos2.close();
	}

	/**
	 * ��ѯ������Ϣ
	 */
	public static HashMap<String, Jieyue> findJieyue(String readerId) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jieyue.txt"));
		HashMap<String, Jieyue> map = (HashMap<String, Jieyue>) ois.readObject();
		ois.close();
		HashMap<String, Jieyue> map2 = new HashMap<String, Jieyue>();
		Set<String> key = map.keySet();
		for (String v : key) {
			if (map.get(v).getReaderId().equals(readerId)) {
				map2.put(map.get(v).getBoookId(), map.get(v));
			}
		}
		return map2;
	}

}
