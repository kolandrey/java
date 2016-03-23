package collection.test.map;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.Test;

public class TreeMapTest {

	@Test
	public void test() {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		// ���������� - ���������� �� �����
		map.put(4, "bed");
		map.put(0, "table");
		map.put(1, "chair");
		map.put(2, "lamp");
		map.put(3, "bitch");
		assertEquals("lamp", map.get(2));
		System.out.println(map.toString());
		// ������
		assertEquals(5, map.size());
		// ��������
		map.remove(2);
		System.out.println(map.toString());
		map.remove(1, "chair");
		System.out.println(map.toString());
		// �������
		map.putIfAbsent(1, "pizza");
		map.replace(4, "beer");
		System.out.println(map.toString());
		System.out.println(map.ceilingEntry(0));
		map.replace(0, "sex");
		System.out.println("��� ������ ����� ���������� ������������� ��� "
				+ map.toString());
	}

}
