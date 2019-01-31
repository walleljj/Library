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


	// 增加图书
	public boolean addBooks(Books books) throws FileNotFoundException, IOException, ClassNotFoundException {
		String id = books.getId();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map.keySet();
		if (keys.contains(id)) {
			//JOptionPane.showMessageDialog(null, "图书已存在");
                        return false;
			// System.out.println("图书已存在");
		} else {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"));
			map.put(id, books);
			oos.writeObject(map);
			oos.close();
			return true;
		}

	}

	// 删除图书，返回值表示是否删除成功
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

	// 判断是否可以修改，没有库存或不在架不可修改
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

	// 修改图书信息
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
