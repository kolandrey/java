package bookshop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookShop {
	private static final String SEPARATOR = "\n";
	protected ArrayList<Book> books;

	public ArrayList<Book> getBooks() {
		return (books);
	}

	public BookShop() {
		books = new ArrayList<Book>();
	}

	public void add(Book book) {
		books.add(book);
	}

	public void delete(Book book) {
		books.remove(book);
	}

	public void delete(int index) {
		books.remove(index);
	}

	public boolean save(String path) {
		return save(new File(path));
	}

	public boolean save(File file) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			writer.write(books.size() + SEPARATOR);
			for (Book book : books) {
				writer.write(book.getName());
				writer.write(SEPARATOR);
				writer.write(book.getAuthor());
				writer.write(SEPARATOR);
			}
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public boolean read(String path) {
		return read(new File(path));
	}

	public boolean read(File file) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String count = reader.readLine();
			for (int i = 0; i < Integer.valueOf(count); i++) {
				String name = reader.readLine();
				String author = reader.readLine();
				books.add(new Book(name, author));
			}
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void sortByName() {
		NameComparator c = new NameComparator();
		Collections.sort(books, c);
	}

	private class NameComparator implements Comparator<Book> {
		public int compare(Book o1, Book o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
}