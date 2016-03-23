package collection.test.map;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.Test;

public class TreeMapTest {

	@Test
	public void test() {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		// добавление - сортировка по ключу
		map.put(4, "bed");
		map.put(0, "table");
		map.put(1, "chair");
		map.put(2, "lamp");
		map.put(3, "bitch");
		assertEquals("lamp", map.get(2));
		System.out.println(map.toString());
		// размер
		assertEquals(5, map.size());
		// удаление
		map.remove(2);
		System.out.println(map.toString());
		map.remove(1, "chair");
		System.out.println(map.toString());
		// вставка
		map.putIfAbsent(1, "pizza");
		map.replace(4, "beer");
		System.out.println(map.toString());
		System.out.println(map.ceilingEntry(0));
		map.replace(0, "sex");
		System.out.println("¬от теперь более правильный ассоциативный р€д "
				+ map.toString());
	}

}
