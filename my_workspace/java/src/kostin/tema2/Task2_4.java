/* В переменной n хранится натуральное трёхзначное число. 
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
package kostin.tema2;

public class Task2_4 {

	public static void main(String[] args) {
		int n = 629;
		System.out.println(n / 100 + n % 100 / 10 + n % 100 % 10);
	}

}
