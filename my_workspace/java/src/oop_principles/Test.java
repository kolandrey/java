package oop_principles;

public class Test {

	public static void main(String[] args) {
		Collaborator p1 = new Programmer(2000, 160);
		System.out.println(p1);
		Collaborator m1 = new Manager(1000, 80);
		System.out.println(m1);
		Collaborator[] o = { p1, m1 };
		Accountant b = new Accountant();
		double x = b.calculateSalaries(o);
		System.out.println(x);
	}
}
