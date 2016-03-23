package collection.test.map;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// добавление
		map.put(5, "socks");
		map.put(3, "slippers");
		map.put(0, "89");
		map.put(2, "brain");
		map.put(1, "boom-boom");
		System.out.println(map.toString());
		assertEquals("{0=89, 1=boom-boom, 2=brain, 3=slippers, 5=socks}",
				map.toString());
		// размер
		assertEquals(5, map.size());
		//удаление
		map.remove(0);
		map.remove(4, "socks");//не удалит
		System.out.println(map.toString());
		//вставка
		System.out.println(map.get(1));
		map.putIfAbsent(1, "fuck");
		map.putIfAbsent(4, "crazy");
		System.out.println(map.toString());
	}

}
