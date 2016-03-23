package contactlist;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Contact implements Comparable<Contact>,Serializable {
	/**
	 * 
	 */
	private String name;
	private String telefon;
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String tel) {
		this.telefon = tel;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date date) {
		this.birthday = date;
	}

	public Contact(String name, String telefon, Date birthday) {
		this.name = name;
		this.telefon = telefon;
		this.birthday = birthday;
	}

	public Contact() {
		this("", "", Calendar.getInstance().getTime());
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", tel=" + telefon + ", date="
				+ DateTimeHelper.formatDate(birthday) + "]\r\n";
	}

	@Override
	public int compareTo(Contact o) {
		return this.birthday.compareTo(o.getBirthday());
	}
}
