package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Set;

import bean.Books;

public class Query {
	// 通过书名查找
	public HashMap<String, Books> nameQuery(String name)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map = new HashMap<String, Books>();
		HashMap<String, Books> map1 = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map1.keySet();
		for (String key : keys) {
			if (name.equals(map1.get(key).getName()))
				map.put(key, map1.get(key));
		}
		return map;
	}

	// 通过id查找
	public HashMap<String, Books> idQuery(String id) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map = new HashMap<String, Books>();
		HashMap<String, Books> map1 = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map1.keySet();
		if (keys.contains(id))
			map.put(id, map1.get(id));
		return map;
	}

	// 通过作者查找
	public HashMap<String, Books> authorQuery(String author)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map = new HashMap<String, Books>();
		HashMap<String, Books> map1 = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map1.keySet();
		for (String key : keys) {
			if (author.equals(map1.get(key).getAuthor()))
				map.put(key, map1.get(key));
		}
		return map;
	}

	// 通过出版社查找
	public HashMap<String, Books> pressQuery(String press)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map = new HashMap<String, Books>();
		HashMap<String, Books> map1 = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map1.keySet();
		for (String key : keys) {
			if (press.equals(map1.get(key).getPress()))
				map.put(key, map1.get(key));
		}
		return map;
	}
}
