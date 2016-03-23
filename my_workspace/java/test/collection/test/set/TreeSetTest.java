package collection.test.set;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class TreeSetTest {

	@Test
	public void test() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		//добавление
		assertEquals(0, set.size());
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(99);
		set.add(4);
		set.add(5);
		set.add(99);
		//размер
		assertEquals(6, set.size());
		System.out.println(set.toString());
		//else
		System.out.println(set.ceiling(50));
		//удаление
		set.remove(4);
		System.out.println(set.toString());
		Integer[] ar = {0, 1, 2, 5, 99};
		assertArrayEquals(ar, set.toArray());
		set.pollFirst();
		System.out.println(set.toString());
	}

}
