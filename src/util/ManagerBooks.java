package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import bean.Books;

public class ManagerBooks {


	// ����ͼ��
	public boolean addBooks(Books books) throws FileNotFoundException, IOException, ClassNotFoundException {
		String id = books.getId();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map.keySet();
		if (keys.contains(id)) {
			//JOptionPane.showMessageDialog(null, "ͼ���Ѵ���");
                        return false;
			// System.out.println("ͼ���Ѵ���");
		} else {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"));
			map.put(id, books);
			oos.writeObject(map);
			oos.close();
			return true;
		}

	}

	// ɾ��ͼ�飬����ֵ��ʾ�Ƿ�ɾ���ɹ�
	public boolean delBooks(String bookId) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map.keySet();
		if (!keys.contains(bookId)||!map.get(bookId).isState()) {
			return false;
		} else{
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"));
			map.remove(bookId);
			oos.writeObject(map);
			oos.close();
                        return true;
                }
			
	}

	// �ж��Ƿ�����޸ģ�û�п����ڼܲ����޸�
	public static boolean couldAlter(String id) throws IOException, ClassNotFoundException {
		HashMap<String, Books> map = new HashMap<String, Books>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		map = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map.keySet();
		if (!(keys.contains(id))||!map.get(id).isState())
			return false;
		else
			return true;
	}

	// �޸�ͼ����Ϣ
	public static void alterBooks(String id, String name, String author, String chuban)
			throws FileNotFoundException, IOException, ClassNotFoundException {

		HashMap<String, Books> map = new HashMap<String, Books>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		map = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map.keySet();
		Books book = map.get(id);
		if (name.length() > 0) {
			book.setName(name);
		}
		if (author.length() > 0) {
			book.setAuthor(author);
		}
		if (chuban.length() > 0) {
			book.setPress(chuban);
		}
		map.remove(id);
		map.put(id, book);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"));
		oos.writeObject(map);
		oos.close();
	}
}
