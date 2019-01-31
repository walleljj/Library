package bean;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

import util.DateUtil;

public class Repair {
	// 初始化图书
	public void rBooks() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"));
		HashMap<String, Books> map = new HashMap<String, Books>();
		Books books = new Books("T0001", "java开发", "张帆", "清华大学出版社", true);
		Books books1 = new Books("T0002", "HTML/CSS教程", "张三", "电子工业出版社", true);
		Books books2 = new Books("T0003", "网页开发教程", "杨习伟", "电子工业出版社", true);
		Books books3 = new Books("T0004", "计算机网络管理", "黄志辉", "西安电子科技大学出版社", true);
		Books books4 = new Books("T0005", "数据通信与计算机网络", "曹袖", "高等教育出版社", true);
		Books books5 = new Books("T0006", "科学与爱国", "习近平", "清华大学出版社", true);
		Books books6 = new Books("T0007", "计算机软件：程序员", "张三", "清华大学出版社", true);
		Books books7 = new Books("T0008", "商务谈判", "杨晶", "清华大学出版社", true);
		Books books8 = new Books("T0009", "现代物流基础", "甘卫华", "电子工业出版社", true);
		Books books9 = new Books("T0010", "信息系统原理与工程", "陈卫东", "电子工业出版社", true);
		Books books10 = new Books("T0011", "虚拟现实技术", "（美）伯迪", "电子工业出版社", true);
		Books books11 = new Books("T0012", "网页开发教程", "张三", "清华大学出版社", true);
		Books books12 = new Books("T0013", "网页开发教程", "张帆", "清华大学出版社", true);
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

	// 初始化读者
	public void rReader() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("reader.txt"));
		HashMap<String, Reader> map = new HashMap<String, Reader>();
		Reader reader = new Reader("123", "123", "李俊杰", 20, "男");
		Reader reader1 = new Reader("456", "456", "贾旺军", 19, "男");
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

	// 初始化借阅信息
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

	// 初始化管理员
	public void rLi() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("librarian.txt"));
		HashMap<String, Librarian> map = new HashMap<String, Librarian>();
		Librarian libr = new Librarian("789", "789", "李俊杰", 20, "男");
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
