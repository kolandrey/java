package collection.test.list;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testLinkedList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		// добавление
		list.addFirst(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.addLast(5);
		assertEquals(3, list.get(3).intValue());
		System.out.println(list.toString());
		// размер
		assertEquals(6, list.size());
		// удаление
		list.remove(3);
		System.out.println(list.toString());
		Integer[] ar = { 0, 1, 2, 4, 5 };
		assertArrayEquals(ar, list.toArray());
		// вставка
		list.add(3, 3);
		System.out.println(list.toString());
		list.set(3, 99);
		System.out.println(list.toString());
		// else
		System.out.println(list.contains(99));
		LinkedList<Integer> c = new LinkedList<Integer>();
		c.add(1);
		c.add(5);
		list.removeAll(c);
		System.out.println(list.toString());
		System.out.println(list.indexOf(99));
	}

}
