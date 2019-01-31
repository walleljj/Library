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
		Vector<Books> books = (Vector<Books>) ois.readObject();// ���ļ������ȡ�鱾��Ϣ����
		ois.close();
		books.add(book);// ���µ�ͼ����Ϣ���뼯��
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.txt"));
		oos.writeObject(books);
		oos.close();
	}

	public Save(Librarian librarian) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("librarians.txt"));
		@SuppressWarnings("unchecked")
		Vector<Librarian> librariansList = (Vector<Librarian>) ois.readObject();// ���ļ������ȡ����Ա��Ϣ����
		ois.close();
		librariansList.add(librarian);// ���µĹ���Ա��Ϣ���뼯��
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("librarians.txt"));
		oos.writeObject(librariansList);
		oos.close();
	}

	public Save(Reader reader) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("readers.txt"));
		@SuppressWarnings("unchecked")
		Vector<Reader> readerList = (Vector<Reader>) ois.readObject();// ���ļ������ȡ������Ϣ����
		ois.close();
		readerList.add(reader);// ���µĶ�����Ϣ���뼯��

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("readers.txt"));
		oos.writeObject(readerList);
		oos.close();
	}
}
