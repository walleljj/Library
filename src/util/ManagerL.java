/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Librarian;
import bean.Reader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author 绘梦
 */
public class ManagerL {
	/**
	 * 判断是否可以添加读者
	 */
	public static boolean couldAdd(String id) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarian.txt"));
		HashMap<String, Librarian> map = (HashMap<String, Librarian>) ois.readObject();
		ois.close();
		Set<String> key = map.keySet();
		if (key.contains(id)) {
			return false;
		} else
			return true;
	}

	/**
	 * 增加读者
	 **/
	public static void add(Librarian li) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarian.txt"));
		HashMap<String, Librarian> map = (HashMap<String, Librarian>) ois.readObject();
		ois.close();
		map.put(li.getId(), li);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("librarian.txt"));
		oos.writeObject(map);
		oos.close();
	}

	/**
	 * 判断是否可以删除读者
	 **/
	public static boolean couldDelet(String id) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarian.txt"));
		HashMap<String, Librarian> map = (HashMap<String, Librarian>) ois.readObject();
		ois.close();
		Set<String> key = map.keySet();
		if (key.contains(id)) {
			return true;
		} else
			return false;
	}

	/**
	 * 删除读者
	 **/
	public static void delet(String id) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarian.txt"));
		HashMap<String, Librarian> map = (HashMap<String, Librarian>) ois.readObject();
		ois.close();
		map.remove(id);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("librarian.txt"));
		oos.writeObject(map);
		oos.close();
	}

	/**
	 * 更改读者
	 */
	public static void change(Librarian li) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarian.txt"));
		HashMap<String, Librarian> map = (HashMap<String, Librarian>) ois.readObject();
		ois.close();
		map.remove(li.getId());
		map.put(li.getId(), li);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("librarian.txt"));
		oos.writeObject(map);
		oos.close();
	}

	/**
	 * 判断是否登录
	 */
	public static boolean denglu(String id, String pass) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarian.txt"));
		HashMap<String, Librarian> map = (HashMap<String, Librarian>) ois.readObject();
		ois.close();
		Set<String> key = map.keySet();
		if (key.contains(id)) {
			if (map.get(id).getPassword().equals(pass))
				return true;
			else
				return false;
		} else
			return false;
	}

}
