package bean;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

import util.DateUtil;

public class ToString {
	// 初始化图书
	public void rBooks() throws Exception {
		/*
		 * ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream("books.txt")); HashMap<String ,Books> map =new
		 * HashMap<String ,Books>(); Books books= new
		 * Books("T0001","java开发","张帆","清华大学出版社",false); Books books1= new
		 * Books("T0002","java","张帆2","清华大学2出版社",true); map.put("T0001",books);
		 * map.put("T0002",books1); oos.writeObject(map); oos.close();
		 */
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		HashMap<String, Books> map2 = (HashMap<String, Books>) ois.readObject();
		Set<String> keys = map2.keySet();
		for (String key : keys) {
			System.out.println(map2.get(key).toString());
		}
		ois.close();
	}

	// 初始化读者
	public void rReader() throws Exception {
		/*
		 * ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream("reader.txt")); HashMap<String ,Reader> map =new
		 * HashMap<String ,Reader>(); Reader reader= new
		 * Reader("123456789","123456789","李俊杰",20,"男"); Reader reader1= new
		 * Reader("000000000","000000000","贾旺军",19,"男");
		 * map.put("123456789",reader); map.put("000000000",reader1);
		 * oos.writeObject(map); oos.close();
		 */
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("reader.txt"));
		HashMap<String, Reader> map2 = (HashMap<String, Reader>) ois.readObject();
		Set<String> keys = map2.keySet();
		for (String key : keys) {
			System.out.println(map2.get(key).toString());
		}
		ois.close();
	}

	// 初始化借阅信息
	public void rJieyue() throws Exception {
		/*
		 * ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream("jieyue.txt")); HashMap<String ,Jieyue> map =new
		 * HashMap<String ,Jieyue>(); Jieyue j1 = new
		 * Jieyue("123456789","T0001",new DateUtil().getThisDay());
		 * map.put("123456789", j1); oos.writeObject(map); oos.close();
		 */
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jieyue.txt"));
		HashMap<String, Jieyue> map2 = (HashMap<String, Jieyue>) ois.readObject();
		Set<String> keys = map2.keySet();
		for (String key : keys) {
			System.out.println(map2.get(key).toString());
		}
		ois.close();
	}

	// 初始化管理员
	public void rLi() throws Exception {
		/*
		 * ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream("librarian.txt")); HashMap<String ,Librarian> map
		 * =new HashMap<String ,Librarian>(); Librarian libr = new
		 * Librarian("11133811","11133811","李俊杰",20,"男"); map.put("11133811",
		 * libr); oos.writeObject(map); oos.close();
		 */
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarian.txt"));
		HashMap<String, Librarian> map2 = (HashMap<String, Librarian>) ois.readObject();
		Set<String> keys = map2.keySet();
		for (String key : keys) {
			System.out.println(map2.get(key).toString());
		}
		ois.close();
	}

}
