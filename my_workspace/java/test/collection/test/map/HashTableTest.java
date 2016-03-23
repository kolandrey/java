package collection.test.map;

import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Test;

public class HashTableTest {

	@Test
	public synchronized void test() {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		// �����������
		table.put(5, "nose");
		table.put(0, "leg");
		table.put(3, "arm");
		table.put(2, "body");
		table.put(1, "head");
		System.out.println(table.toString());
		// ��������
		table.remove(2);
		System.out.println(table.toString());
		// ������
		assertEquals(4, table.size());
		// �������
		table.put(2, "penis");
		table.replace(2, "big penis");
		System.out.println(table.toString());
	}

}
