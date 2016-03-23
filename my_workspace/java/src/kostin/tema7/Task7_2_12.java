/* Для введённого пользователем с клавиатуры натурального числа 
 * посчитайте сумму всех его цифр (заранее не известно сколько 
 * цифр будет в числе).
 */

package kostin.tema7;

import java.util.*;

public class Task7_2_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите натуральное число - ");
		if (sc.hasNextInt()) {
			String s = String.valueOf(sc.nextInt());
			int sum = 0, lenght = s.length();
			for (int i = 0; i < lenght; i++) {
				sum += (s.charAt(i) - 48);
			}
			System.out.println("Сумма всех чисел равна = "+sum);
		}

	}

}
