package ua.kh.lessons.lesson4.dz1;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> vector1 = new Vector<Integer>();
		vector1.add(1);
		vector1.add(2);
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		vector1.add(1);
		vector1.add(2);
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		vector1.add(99, 2);
		vector1.add(88, 2);
		System.out.println(vector1);
		vector1.del(2);
		System.out.println(vector1);

	}
}
