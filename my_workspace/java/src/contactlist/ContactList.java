package contactlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.swing.JOptionPane;

public class ContactList {
	private static final String SEPARATOR = "\r\n";
	protected ArrayList<Contact> contacts;

	public ArrayList<Contact> getContacts() {
		return contacts;
	}

	public ContactList() {
		this.contacts = new ArrayList<Contact>();
	}

	public void add(Contact data) {
		contacts.add(data);
	}

	public void delete(Contact data) {
		contacts.remove(data);
	}

	public void delete(int index) {
		contacts.remove(index);
	}

	public boolean save(String path) {
		return save(new File(path));
	}

	public boolean save(File file) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			writer.write(contacts.size() + SEPARATOR);
			for (Contact contact : contacts) {
				writer.write(contact.getName());
				writer.write(SEPARATOR);
				writer.write(contact.getTelefon());
				writer.write(SEPARATOR);
				writer.write(DateTimeHelper.formatDate(contact.getBirthday()));
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
				String tel = reader.readLine();
				String date = reader.readLine();
				contacts.add(new Contact(name, tel, DateTimeHelper
						.formatDate(date)));
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
				e.printStackTrace();
			}
		}
	}

	public boolean saveSerializable(String path) throws IOException {
		return saveSerializable(new FileOutputStream(path));
	}

	public boolean saveSerializable(FileOutputStream fileOutputStream)
			throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
		oos.writeObject(contacts);
		oos.flush();
		oos.close();
		return true;
	}

	public Object loadSerializable(String path) throws IOException,
			ClassNotFoundException {
		return loadSerializable(new FileInputStream(path));
	}

	@SuppressWarnings("unchecked")
	public Object loadSerializable(FileInputStream fileInputStream)
			throws IOException, ClassNotFoundException {
		ObjectInputStream oos = new ObjectInputStream(fileInputStream);
		contacts = (ArrayList<Contact>) oos.readObject();
		oos.close();
		return true;
	}

	public boolean zip(String source, String destination)
			throws IOException {
		try {
			FileInputStream fis = new FileInputStream(source);
			ZipOutputStream zis = new ZipOutputStream(new FileOutputStream(
					destination));
			ZipEntry ze = new ZipEntry(new File(source).getName());
			zis.putNextEntry(ze);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = fis.read(buffer, 0, buffer.length)) > 0) {
				zis.write(buffer, 0, length);
			}
			zis.close();
			fis.close();
			return true;
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Неверно указан путь");
			return false;
		}
	}

	public boolean unzip(String source, String destination)
			throws IOException {
		ZipInputStream zis = new ZipInputStream(new FileInputStream(source));
		ZipEntry ze = zis.getNextEntry();
		String namefile = ze.getName();
		File folder = new File(destination);
		if (!folder.exists()) {
			folder.mkdir();
		}
		File newfile = new File(destination + File.separator + namefile);
		FileOutputStream fos = new FileOutputStream(newfile);
		byte[] buffer = new byte[1024];
		int len;
		while ((len = zis.read(buffer, 0, buffer.length)) > 0) {
			fos.write(buffer, 0, len);
		}
		zis.close();
		fos.close();
		return true;
	}

	@Override
	public String toString() {
		return "ContactList " + contacts + "]";
	}

	public void sortByName() {
		Collections.sort(contacts, new Comparator<Contact>() {

			@Override
			public int compare(Contact o1, Contact o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public void sortByBirthday() {
		Collections.sort(contacts);
	}
}
