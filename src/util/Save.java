package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import bean.Books;
import bean.Librarian;
import bean.Reader;

public class Save {
	public Save(Books book) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.txt"));
		@SuppressWarnings("unchecked")
		Vector<Books> books = (Vector<Books>) ois.readObject();// 从文件里面读取书本信息集合
		ois.close();
		books.add(book);// 将新的图书信息放入集合
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"));
		oos.writeObject(books);
		oos.close();
	}

	public Save(Librarian librarian) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarians.txt"));
		@SuppressWarnings("unchecked")
		Vector<Librarian> librariansList = (Vector<Librarian>) ois.readObject();// 从文件里面读取管理员信息集合
		ois.close();
		librariansList.add(librarian);// 将新的管理员信息放入集合
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("librarians.txt"));
		oos.writeObject(librariansList);
		oos.close();
	}

	public Save(Reader reader) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("readers.txt"));
		@SuppressWarnings("unchecked")
		Vector<Reader> readerList = (Vector<Reader>) ois.readObject();// 从文件里面读取读者信息集合
		ois.close();
		readerList.add(reader);// 将新的读者信息放入集合

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("readers.txt"));
		oos.writeObject(readerList);
		oos.close();
	}
}
