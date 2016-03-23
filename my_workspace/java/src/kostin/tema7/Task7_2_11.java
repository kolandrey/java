/* Выведите на экран первые 11 членов последовательности Фибоначчи. 
 * Напоминаем, что первый и второй члены последовательности равны 
 * единицам, а каждый следующий — сумме двух предыдущих.
 */

package kostin.tema7;

public class Task7_2_11 {

	public static void main(String[] args) {
		for (int i = 0, fib1 = 0, fib2 = 1; i < 11; i++) {
			int fib = fib1 + fib2;
			System.out.println(fib);
			fib2 = fib1;
			fib1 = fib;
		}
	}

}
