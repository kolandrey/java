/* Создать программу, которая будет выводить на экран меньшее 
 * по модулю из трёх введённых пользователем вещественных чисел.
 */

package kostin.tema6;

import java.util.*;

public class Task6_3 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		Scanner x = new Scanner(System.in);

		System.out.print("Введите первое число - ");
		if (x.hasNextDouble()) {
			a = Math.abs(x.nextDouble());

			System.out.print("Введите второе число - ");
			if (x.hasNextDouble()) {
				b = Math.abs(x.nextDouble());

				System.out.print("Введите второе число - ");
				if (x.hasNextDouble()) {
					c = Math.abs(x.nextDouble());
				} else
					System.out.println("Юморист...");
			} else
				System.out.println("Да ты шутить. да?");
		} else
			System.out.println("Не туда попал брат!");

		// System.out.println(a+" "+b+" "+c);

		if (a < b && a < c)
			System.out.println("Меньшее по модулю - " + a);
		else if (b < a && b < c)
			System.out.println("Меньшее по модулю - " + b);
		else
			System.out.println("Меньшее по модулю - " + c);
	}

}
