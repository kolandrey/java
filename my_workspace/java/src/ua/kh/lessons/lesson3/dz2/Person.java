package ua.kh.lessons.lesson3.dz2;

public class Person {
	private String name, surname;
	private int age, dickLength, height;

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDickLength(int dickLength) {
		this.dickLength = dickLength;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public int getDickLength() {
		return dickLength;
	}

	public int getHeight() {
		return height;
	}

	public Person() {
		this.name = "";
		this.surname = "";
		this.age = 0;
		this.dickLength = 0;
		this.height = 0;
	}

	public Person(String name, String surname, int age, int dickLength,
			int height) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.dickLength = dickLength;
		this.height = height;
	}

	public void print() {
		System.out.println("name - " + this.name);
		System.out.println("surname - " + this.surname);
		System.out.println("age - " + this.age);
		System.out.println("dickLength - " + this.dickLength);
		System.out.println("height - " + this.height);
	}
}
