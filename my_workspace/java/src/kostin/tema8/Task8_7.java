/* Создайте массив из 20-ти первых чисел Фибоначчи 
 * и выведите его на экран. Напоминаем, что первый 
 * и второй члены последовательности равны единицам, 
 * а каждый следующий — сумме двух предыдущих.
 */

package kostin.tema8;

public class Task8_7 {

	public static void main(String[] args) {
		int mas[] = new int[20];
		for (int i = 0, fib1 = 0, fib2 = 1; i < mas.length; i++) {
			mas[i] = fib1 + fib2;
			fib2 = fib1;
			fib1 = mas[i];
			System.out.print(mas[i] + " ");
		}
	}
}
