package collection.test.set;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class HashSetTest {

	@Test
	public void testHashSet() {

		HashSet<Integer> set = new HashSet<Integer>();
		assertEquals(0, set.size());
		// ����������
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(99);
		set.add(-56);
		assertTrue(set.contains(99));
		System.out.println(set.toString());
		Integer[] ar = { 0, 1, 2, 3, 99, -56 };
		assertArrayEquals(ar, set.toArray());
		// ��������
		set.remove(99);
		System.out.println(set.toString());
		// ������
		assertEquals(5, set.size());
		// ������� ���, ��������� ���������� ��������
	}

}
