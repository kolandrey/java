/* В переменные a и b записаны целые числа, при этом b больше a. 
 * Создайте программу, которая будет генерировать и выводить на 
 * экран целое псевдослучайное число из отрезка [a;b].
 */
package kostin.tema3;

public class Task3_2_3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		System.out.println((int) (Math.random() * (b - a)) + a);
	}

}
