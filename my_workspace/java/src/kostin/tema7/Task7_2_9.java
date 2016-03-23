/*Проверьте, является ли введённое пользователем с клавиатуры 
 * натуральное число — простым. Постарайтесь не выполнять 
 * лишних действий (например, после того, как вы нашли хотя бы 
 * один нетривиальный делитель уже ясно, что число составное и 
 * проверку продолжать не нужно). Также учтите, что наименьший 
 * делитель натурального числа n, если он вообще имеется, 
 * обязательно располагается в отрезке [2; √n].
 */
package kostin.tema7;

import java.util.*;

public class Task7_2_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите натуральное число:");
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("число не натуральное");
					System.exit(0);
				//	break;
				} //else System.out.println("число натуральное");
			}
			System.out.println("число натуральное");
		} else
			System.out.println("Введено не натуральное число");

	}

}
