package bookshop;

public class Book {
	protected String name;
	protected String author;

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book() {
		this("", "");
	}

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	public String toString() {
		return "Книга: \"" + name + "\" - " + author;
	}
}