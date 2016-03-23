/* —оздайте программу, вычисл€ющую факториал натурального числа n, 
 * которое пользователь введЄт с клавиатуры.
 */

package kostin.tema7;

import java.util.*;

public class Task7_2_7 {

	public static void main(String[] args) {
		int digit, i;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите натуральное число - ");
		if (sc.hasNextInt()) {
			digit = sc.nextInt();
			for (i = 1; i <= digit; i++) {
				fact = i * fact;
			}
			System.out.println("‘акториал числа - " + fact);
		}

	}

}
