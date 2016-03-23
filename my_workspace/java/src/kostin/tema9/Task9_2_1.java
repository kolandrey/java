/* Выясните экспериментальном путём, начиная с какого элемента 
 * последовательности Фибоначчи, вычисление с использованием 
 * рекурсии становится неприемлемым (занимает более минуты по времени).
 */

package kostin.tema9;


public class Task9_2_1 {
	static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fib(n - 2) + fib(n - 1);
	}

	public static void main(String[] args) {
		int index = 1;
		while (true) {
			long milisecsBefore = System.currentTimeMillis();
			int a = fib(index++);
			long milisecsAfter = System.currentTimeMillis();

			System.out.println(a + " " + index);
			if ((milisecsAfter - milisecsBefore) / 1000 > 60) {
				break;
			}
		}
	}
}
