package collection.test.list;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListTest {
	@Test
	public void testArrayList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// размер
		assertEquals(0, list.size());
		// добавление
		list.add(1);
		assertEquals(1, list.size());
		assertEquals(1, list.get(0).intValue());
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		assertEquals(7, list.size());
		// удаление
		System.out.println(list.toString());
		list.remove(2);
		System.out.println(list.toString());
		Integer[] ar = { 1, 2, 4, 5, 6, 7 };
		assertArrayEquals(ar, list.toArray());
		// вставка
		list.set(1, 10);
		System.out.println(list.toString());
		list.add(1, 99);
		System.out.println(list.toString());
		Integer[] ar2 = { 1, 99, 10, 4, 5, 6, 7 };
		assertArrayEquals(ar2, list.toArray());
	}
}
