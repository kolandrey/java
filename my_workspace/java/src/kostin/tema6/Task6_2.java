/* Создать программу, которая будет вычислять и выводить на экран 
 * сумму двух целых чисел, введённых пользователем. Если пользователь 
 * некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

package kostin.tema6;

import java.util.*;

public class Task6_2 {

	public static void main(String[] args) {
		// почему переменные надо инициализировать?
		int a;
		int b;
		Scanner x = new Scanner(System.in);

		System.out.println("Введите первое число - ");

		if (x.hasNextInt()) {
			a = x.nextInt();

			System.out.println("Введите второе число - ");
			if (x.hasNextInt()) {
				b = x.nextInt();
				System.out.println("Сума двух чисел равна = " + (a + b));
			} else
				System.out.println("иди кури брат...");
		} else
			System.out.println("иди кури брат...");
	}

}
