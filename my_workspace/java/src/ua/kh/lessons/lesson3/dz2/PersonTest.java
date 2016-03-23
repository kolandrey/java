package ua.kh.lessons.lesson3.dz2;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Макс", "Петров", 17, 15, 155);
		p1.print();
		System.out.println();
		p2.print();
	}

}
