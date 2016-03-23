package etlec1;

import static org.junit.Assert.*;

import org.junit.Test;

public class etlec1Test {

	@Test
	public void testGcd() {
		assertEquals(3, etlec1.gcd(3, 15));
		assertEquals(8, etlec1.gcd(8, 80));
		assertEquals(1, etlec1.gcd(33, 50));
		assertEquals(5, etlec1.gcd(25, 30));
		assertEquals(2, etlec1.gcd(56, 174));
	}

	@Test
	public void testSumma() {
		assertEquals(5, etlec1.summa(11111));
		assertEquals(15, etlec1.summa(12345));
		assertEquals(36, etlec1.summa(9999));
		assertEquals(0, etlec1.summa(0));
		assertEquals(33, etlec1.summa(98628));
	}

	@Test
	public void testIsSimple() {
		assertTrue(etlec1.isSimple(47));
		assertTrue(etlec1.isSimple(13));
		assertTrue(etlec1.isSimple(23593));
		assertFalse(etlec1.isSimple(56));
		assertFalse(etlec1.isSimple(45));
	}

	@Test
	public void testFact() {
		assertEquals(120, etlec1.fact(5));
		assertEquals(3628800, etlec1.fact(10));
		assertEquals(1, etlec1.fact(1));
		assertEquals(1, etlec1.fact(0));
		assertEquals(2432902008176640000l, etlec1.fact(20));
	}

	@Test
	public void testSumSer() {
		assertEquals(619, etlec1.sumSer(7));
		assertEquals(0, etlec1.sumSer(0));
		assertEquals(-1, etlec1.sumSer(2));
		assertEquals(3617809995773201595l, etlec1.sumSer(100));
		assertEquals(0, etlec1.sumSer(-10));
	}

	@Test
	public void testSix() {
		assertEquals(55252, etlec1.six());
		assertNotEquals(55253, etlec1.six());
	}

	@Test
	public void testFib() {
		int[] mas = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
				987, 1597, 2584, 4181, 6765 };
		assertArrayEquals(mas, etlec1.fib());
	}

	@Test
	public void testSimpleMas() {
		int mas[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
				53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109,
				113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179,
				181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241,
				251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313,
				317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389,
				397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461,
				463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541 };
		assertArrayEquals(mas, etlec1.simpleMas());
	}

	@Test
	public void testChessMas() {
		char[][] mas = { { '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á' },
				{ 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×' },
				{ '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á' },
				{ 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×' },
				{ '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á' },
				{ 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×' },
				{ '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á' },
				{ 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×' },
				{ '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á' },
				{ 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×', 'Á', '×' }, };
		assertArrayEquals(mas, etlec1.chessMas());
	}

	@Test
	public void testSixMas() {
		assertEquals(65, etlec1.sixMas());
		assertNotEquals(10, etlec1.sixMas());
	}

	@Test
	public void testIsEven() {
		assertFalse(etlec1.isEven(5));
		assertFalse(etlec1.isEven(11));
		assertFalse(etlec1.isEven(57));
		assertTrue(etlec1.isEven(6));
		assertTrue(etlec1.isEven(100));
		assertTrue(etlec1.isEven(88));
	}

}
