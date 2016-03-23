/* В переменных q и w хранятся два натуральных числа. Создайте программу, 
 * выводящую на экран результат деления q на w с остатком. 
 * Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
 * 21 / 8 = 2 и 5 в остатке
 */

package kostin.tema2;

public class Task2_1 {

	public static void main(String[] args) {
		int q = 34;
		int w = 6;
		int x = q / w;
		int y = q % 6;
		System.out.println(q + " / " + w + " = " 
		+ x + " и " + y + " в остатке");
	}
}
