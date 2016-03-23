/* Создать программу, которая будет проверять, является ли слово из пяти букв, 
 * введённое пользователем, палиндромом (примеры: «комок», «ротор»). Если 
 * введено слово не из 5 букв, то сообщать об ошибке. Программа должна 
 * нормально обрабатывать слово, даже если в нём использованы символы разного 
 * регистра. Например, слова «Комок» или «РОТОР» следует также считать 
 * палиндромами.
 */

package kostin.tema6;

import java.util.*;

public class Task6_4 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Введите слово из 5 букв");
		String word = x.next();
		if (word.length() == 5) {
			// System.out.println("ок");
			if (word.charAt(0) == word.charAt(4)
					&& word.charAt(1) == word.charAt(3)) {
				System.out.println("Это палиндром");
			} else
				System.out.println("Это не палиндром");
		} else
			System.out.println("Введено больше или меньше букв");
		x.close();
	}

}
